package com.byteshaft.lisenceservice;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

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
    private HashMap<ArrayList<String[]>, HashMap<String, String[]>> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_start_test);
        ArrayList<String> categories = Data.initializeCategoriesArray();
        System.out.println(categories);
        currentCategory = categories.get(0);
        data = Data.getSelectedCategoryDetails(currentCategory);
        System.out.println();
    }

    // Method to load the fragment required Fragment as parameter
    public void loadFragment(Fragment fragment) {
        FragmentTransaction tx = getSupportFragmentManager().beginTransaction();
        tx.replace(R.id.container, fragment);
        tx.commit();
    }
}
