package com.byteshaft.licenseservice.fragments;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
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

import com.byteshaft.licenseservice.R;
import com.byteshaft.licenseservice.utils.AppGlobals;
import com.byteshaft.licenseservice.utils.Data;


public class QuestionsFragment extends Fragment implements RadioGroup.OnCheckedChangeListener {

    private View mBaseView;
    private TextView question;
    public RadioGroup radioGroup;
    private RadioButton radioOne;
    private RadioButton radioTwo;
    private RadioButton radioThree;
    private String answerOne = "";
    private String answerTwo = "";
    private String answerThree = "";
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
        if (category.equals(Data.sTrafficSignsSection)) {
            this.question.setText(que.replaceAll("[0-9]",""));
        } else {
            this.question.setText(que);
        }
        this.radioGroup.clearCheck();
        this.imageView.setVisibility(View.GONE);
        this.radioOne.setText(answerOne);
        this.radioTwo.setText(answerTwo);
        this.radioThree.setText(answerThree);
        this.category.setText(category);
        if (!drawableName.trim().isEmpty()) {
            int resId = getResources().getIdentifier(drawableName, "drawable",
                    getActivity().getPackageName());
            if (resId != 0) {
                Drawable d = getActivity().getResources().getDrawable(resId);
                imageView.setImageDrawable(d);
                imageView.setVisibility(View.VISIBLE);
            }
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

    public void disableRadioGroup() {
        for (int i = 0; i < radioGroup.getChildCount(); i++) {
            radioGroup.getChildAt(i).setEnabled(false);
        }
    }

    public void enableRadioGroup() {
        for (int i = 0; i < radioGroup.getChildCount(); i++) {
            radioGroup.getChildAt(i).setEnabled(true);
        }
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        radioGroup.setOnCheckedChangeListener(this);
    }

    public void hideCurrentQuestion() {
        question.setText("");
        radioOne.setText("");
        radioTwo.setText("");
        radioThree.setText("");
        answerIndex = 5;
    }

    public void showCurrentQuestion() {
        Animation RightSwipe = AnimationUtils.loadAnimation(getActivity().getApplicationContext(),
                R.anim.slide_in_right);
        mRelativeLayout.startAnimation(RightSwipe);
    }

    public RadioButton getAnswerRadioButton() {
        switch (radioGroup.getCheckedRadioButtonId()) {
            case R.id.radio_one:
                return radioOne;
            case R.id.radio_two:
                return radioTwo;
            case R.id.radio_three:
                return radioThree;
            default:
                return null;
        }
    }

    public int getAnswerIndex() {
        switch (radioGroup.getCheckedRadioButtonId()) {
            case R.id.radio_one:
                return 0;
            case R.id.radio_two:
                return 1;
            case R.id.radio_three:
                return 2;
            default:
                return 5;
        }
    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        if (AppGlobals.wrongAnswerButton != null) {
            AppGlobals.wrongAnswerButton.
                    setCompoundDrawablesWithIntrinsicBounds(R.drawable.png_selector, 0, 0, 0);
        }
    }
}
