package com.byteshaft.licenseservice;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SelectionActivity  extends Activity implements View.OnClickListener {

    private Button mTestButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_selection);
        mTestButton = (Button) findViewById(R.id.test);
        mTestButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.test:
                Intent intent = new Intent(getApplicationContext(), StartTestActivity.class);
                startActivity(intent);
                break;
        }
    }
}
