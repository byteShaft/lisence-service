package com.byteshaft.licenseservice.utils;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class Helpers {

    public static SharedPreferences getPreferenceManager() {
        return PreferenceManager.getDefaultSharedPreferences(AppGlobals.getContext());
    }

    public static Boolean isInstantAnswerEnabled() {
        SharedPreferences sharedPreferences = getPreferenceManager();
        return sharedPreferences.getBoolean(AppGlobals.KEY_INSTANT_ANSWER_ENABLED, false);
    }

    public static void saveInstantAnswerValue(boolean state) {
        SharedPreferences sharedPreferences = getPreferenceManager();
        sharedPreferences.edit().putBoolean(AppGlobals.KEY_INSTANT_ANSWER_ENABLED, state).apply();
    }
}
