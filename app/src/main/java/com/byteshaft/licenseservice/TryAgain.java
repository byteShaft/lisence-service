package com.byteshaft.licenseservice;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class TryAgain extends AppCompatActivity implements View.OnClickListener {

    private Button tryAgainButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_try_again);
        tryAgainButton = (Button) findViewById(R.id.try_again);
        tryAgainButton.setOnClickListener(this);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(getApplicationContext(), SelectionActivity.class));
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.try_again:
                StartTestActivity.getInstance().finishActivity(0);
                startActivity(new Intent(getApplicationContext(), SelectionActivity.class));
                break;
        }
    }
}
