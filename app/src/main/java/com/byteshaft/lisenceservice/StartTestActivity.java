package com.byteshaft.lisenceservice;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;

public class StartTestActivity extends AppCompatActivity {

    private String currentCategory = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_start_test);
        ArrayList<String> categories = Data.initializeCategoriesArray();

    }

    // Method to load the fragment required Fragment as parameter
    public void loadFragment(Fragment fragment) {
        FragmentTransaction tx = getSupportFragmentManager().beginTransaction();
        tx.replace(R.id.container, fragment);
        tx.commit();
    }
}
