package com.byteshaft.lisenceservice;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;


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

    public void setValuesToDisplay(String question, String answerOne, String answerTwo,
                             String answerThree, int answerIndex, String drawableName) {
        this.answerOne = answerOne;
        this.answerTwo = answerTwo;
        this.answerThree = answerThree;
        this.answerIndex = answerIndex;
        this.que = question;
        this.drawableName = drawableName;
        this.question.setText(que);
        radioOne.setText(answerOne);
        radioTwo.setText(answerTwo);
        radioThree.setText(answerThree);
    }

    public static QuestionsFragment getInstance() {
        return instance;
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mBaseView = inflater.inflate(R.layout.layout_questions, container, false);
        instance = this;
        question = (TextView) mBaseView.findViewById(R.id.question);
        radioGroup = (RadioGroup) mBaseView.findViewById(R.id.radioGroup);
        radioOne = (RadioButton) mBaseView.findViewById(R.id.radio_one);
        radioTwo = (RadioButton) mBaseView.findViewById(R.id.radio_two);
        radioThree = (RadioButton) mBaseView.findViewById(R.id.radio_three);
        return mBaseView;
    }
}
