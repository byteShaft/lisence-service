package com.byteshaft.licenseservice;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.byteshaft.licenseservice.utils.AppGlobals;

public class SelectionActivity  extends Activity implements View.OnClickListener {

    private Button mSampleButton;
    private Button mTestButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_selection);
        mSampleButton = (Button) findViewById(R.id.sample);
        mTestButton = (Button) findViewById(R.id.test);
        mSampleButton.setOnClickListener(this);
        mTestButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(getApplicationContext(), StartTestActivity.class);
        switch (view.getId()) {
            case R.id.sample:
                intent.putExtra(AppGlobals.INTENT_KEY, "sample");
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                AppGlobals.testModeSample = true;
                break;
            case R.id.test:
                intent.putExtra(AppGlobals.INTENT_KEY, "test");
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                break;
        }
        startActivity(intent);
    }
}
