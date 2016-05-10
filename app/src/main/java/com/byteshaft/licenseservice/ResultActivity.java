package com.byteshaft.licenseservice;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.byteshaft.licenseservice.utils.AppGlobals;

import java.util.HashMap;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_result_activity);
        HashMap<String, String> hashMap = (HashMap<String, String>)getIntent().getSerializableExtra(AppGlobals.ANSWER_DATA);
        Log.i("HashMap", String.valueOf(hashMap));
        Log.i("Categories", String.valueOf(getIntent().getStringArrayListExtra(AppGlobals.TOTAL_CATEGORIES)));
    }
}
