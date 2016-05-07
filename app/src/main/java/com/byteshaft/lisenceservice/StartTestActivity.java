package com.byteshaft.lisenceservice;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.util.ArrayList;
import java.util.HashMap;

public class StartTestActivity extends AppCompatActivity {

    private String currentCategory = "";
    private final int ICAC_QUESTIONS = 3;
    private final int GENERAL_KNOWLEDGE_QUESTIONS = 15;
    private int ASKED_QUESZTIONS_GENERAL_KNOWLEDGE = 0;
    private final int ALCOHOL_DRUGS_QUESTIONS = 3;
    private int ASKED_ALCOHOL_DRUGS_QUESTIONS = 0;
    private final int FATIGUE_AND_DEFENCE_DRIVING = 2;
    private int ASKED_FATIGUE_AND_DEFENCE_DRIVING = 0;
    private final int INTERSECTION = 2;
    private int ASKED_INTERSECTION = 0;
    private final int NEGLIGENT_DRIVING = 2;
    private int ASKED_NEGLIGENT_DRIVING = 0;
    private final int PEDESTRAINS = 2;
    private int ASKED_PEDESTRAINS = 0;
    private final int SEAT_BELTS_RESTRAINS = 2;
    private int ASKED_SEAT_BELTS_RESTRAINS = 0;
    private final int SPEED_LIMITS = 3;
    private int ASKED_SPEED_LIMITS = 0;
    private final int TRAFFIC_LIGHTS = 2;
    private int ASKED_TRAFFIC_LIGHTS = 0;
    private final int TRAFFIC_LIGHTS_2 = 2;
    private int ASKED_TRAFFIC_LIGHTS_2 = 0;
    private static StartTestActivity instance;
    private static ArrayList<String[]> questionsArrayForCurrent;
    private static HashMap<String, String[]> answersForSelected;

    public static StartTestActivity getInstance() {
        return instance;
    }

    public static void setValuesForCurrentCategory(ArrayList<String[]> arrayList,
                                                   HashMap<String, String[]> hashMap) {
        questionsArrayForCurrent = arrayList;
        answersForSelected = hashMap;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_start_test);
        instance = this;
        questionsArrayForCurrent = new ArrayList<>();
        answersForSelected = new HashMap<>();
        ArrayList<String> categories = Data.initializeCategoriesArray();
        System.out.println(categories);
        currentCategory = categories.get(0);
        Data.getSelectedCategoryDetails(currentCategory);
        loadFragment(new QuestionsFragment());

    }

    @Override
    protected void onResume() {
        super.onResume();
        String drawableName = "";
        String question = questionsArrayForCurrent.get(0)[0];
        if (!questionsArrayForCurrent.get(0)[1].trim().isEmpty()) {
            drawableName = questionsArrayForCurrent.get(0)[1];
        }
        Log.i("Question", question);
        Log.i("answer one", answersForSelected.get(question)[0]);
        QuestionsFragment.getInstance().setValuesToDisplay(question
                , answersForSelected.get(question)[0],
                answersForSelected.get(question)[1],
                answersForSelected.get(question)[2], Integer.parseInt(answersForSelected.get(question)[3]),
                drawableName);
    }

    // Method to load the fragment required Fragment as parameter
    public void loadFragment(Fragment fragment) {
        FragmentTransaction tx = getSupportFragmentManager().beginTransaction();
        tx.replace(R.id.container, fragment);
        tx.commit();
    }
}
