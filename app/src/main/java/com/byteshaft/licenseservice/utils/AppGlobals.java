package com.byteshaft.licenseservice.utils;

import android.app.Application;
import android.content.Context;
import android.widget.RadioButton;


public class AppGlobals extends Application {

    private static Context sContext;
    public static String INTENT_KEY = "intent_key";
    public static boolean testModeSample = false;
    public static String KEY_INSTANT_ANSWER_ENABLED = "instant_answer_enabled";
    public static RadioButton wrongAnswerButton;
    public static boolean sCurrentCategoryInitialized = false;
    public static final String ANSWER_DATA = "answer_data";
    public static final String TOTAL_CATEGORIES = "total_categories";
    public static final String TOTAL_QUESTIONS = "total_questions";

    @Override
    public void onCreate() {
        super.onCreate();
        sContext = getApplicationContext();
    }

    public static Context getContext() {
        return sContext;
    }
}
