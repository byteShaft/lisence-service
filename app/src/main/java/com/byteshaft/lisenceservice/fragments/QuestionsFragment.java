package com.byteshaft.lisenceservice.fragments;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.byteshaft.lisenceservice.R;


public class QuestionsFragment extends Fragment {

    private View mBaseView;
    private TextView question;
    private RadioGroup radioGroup;
    private RadioButton radioOne;
    private RadioButton radioTwo;
    private RadioButton radioThree;
    private String answerOne = "";
    private String answerTwo = "";
    private String answerThree =  "";
    private String que = "";
    private int answerIndex = 5;
    private static QuestionsFragment instance;
    private String drawableName;
    public RelativeLayout mRelativeLayout;
    private TextView category;
    private ImageView imageView;

    public void setValuesToDisplay(String question, String answerOne, String answerTwo,
                             String answerThree, int answerIndex, String drawableName, String category) {
        this.answerOne = answerOne;
        this.answerTwo = answerTwo;
        this.answerThree = answerThree;
        this.answerIndex = answerIndex;
        this.que = question;
        this.drawableName = drawableName;
        this.question.setText(que);
        radioGroup.clearCheck();
        imageView.setVisibility(View.GONE);
        radioOne.setText(answerOne);
        radioTwo.setText(answerTwo);
        radioThree.setText(answerThree);
        this.category.setText(category);
        Log.i("TAG",drawableName+ " "+ drawableName.trim().isEmpty());
        if (!drawableName.trim().isEmpty()) {
            Log.i("TAG", "setting drawable");
            int resId = getResources().getIdentifier(drawableName, "drawable",
                    getActivity().getPackageName());
            System.out.println(resId);
            Drawable d = getActivity().getResources().getDrawable(resId);
            imageView.setImageDrawable(d);
            imageView.setVisibility(View.VISIBLE);
        }
    }

    public static QuestionsFragment getInstance() {
        return instance;
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mBaseView = inflater.inflate(R.layout.layout_questions, container, false);
        instance = this;
        mRelativeLayout = (RelativeLayout) mBaseView.findViewById(R.id.question_main_layout);
        question = (TextView) mBaseView.findViewById(R.id.question);
        radioGroup = (RadioGroup) mBaseView.findViewById(R.id.radioGroup);
        radioOne = (RadioButton) mBaseView.findViewById(R.id.radio_one);
        radioTwo = (RadioButton) mBaseView.findViewById(R.id.radio_two);
        radioThree = (RadioButton) mBaseView.findViewById(R.id.radio_three);
        category = (TextView) mBaseView.findViewById(R.id.category);
        imageView = (ImageView) mBaseView.findViewById(R.id.image);
        return mBaseView;
    }

    public void hideCurrentQuestion() {
        Animation RightSwipe = AnimationUtils.loadAnimation(getActivity().getApplicationContext(),
                R.anim.anim);
        mRelativeLayout.startAnimation(RightSwipe);
        mRelativeLayout.setLayoutAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                question.setText("");
                radioOne.setText("");
                radioTwo.setText("");
                radioThree.setText("");
                answerIndex = 5;
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }

    public void showCurrentQuestion() {
        Animation RightSwipe = AnimationUtils.loadAnimation(getActivity().getApplicationContext(),
                R.anim.slide_in_right);
        mRelativeLayout.startAnimation(RightSwipe);
    }

    public int getAnswerIndex() {
        switch (radioGroup.getCheckedRadioButtonId()) {
            case R.id.radio_one:
                Log.i("Checked", "one");
                return 0;
            case R.id.radio_two:
                Log.i("Checked", "two");
                return 1;
            case R.id.radio_three:
                Log.i("Checked", "three");
                return 2;
            default:
                return 5;
        }
    }


}
