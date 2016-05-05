package com.byteshaft.lisenceservice;

import android.app.Application;
import android.content.Context;


public class AppGlobals extends Application {

    private static Context sContext;
    public static String INTENT_KEY = "intent_key";
    public static boolean testModeSample = false;

    @Override
    public void onCreate() {
        super.onCreate();
        sContext = getApplicationContext();
    }

    public static Context getContext() {
        return sContext;
    }
}
