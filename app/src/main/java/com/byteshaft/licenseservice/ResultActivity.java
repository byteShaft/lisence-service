package com.byteshaft.licenseservice;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.internal.NavigationMenuView;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.byteshaft.licenseservice.utils.AppGlobals;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;

public class ResultActivity extends AppCompatActivity implements View.OnClickListener {

    private ViewHolder viewHolder;
    private ListView listView;
    private int totalQuestions = 1;
    private TextView totalCalculations;
    private int totalTrue = 0;
    private View header;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ArrayList<String> dataList = getIntent()
                .getStringArrayListExtra(AppGlobals.TOTAL_CATEGORIES);
        listView = (ListView) findViewById(R.id.result_list_view);
        totalCalculations = (TextView) findViewById(R.id.total_question_answers);
        HashMap<String, String> hashMap = (HashMap<String, String>)getIntent()
                .getSerializableExtra(AppGlobals.ANSWER_DATA);
        totalQuestions = getIntent().getIntExtra(AppGlobals.TOTAL_QUESTIONS, 0);
        Log.i("Total ques received", String.valueOf(totalQuestions));
        for (String category: dataList) {
            if (hashMap.get(category) != null) {
                totalTrue = totalTrue + Integer.parseInt(String.valueOf(hashMap.get(category)));
            }
        }
        totalCalculations.setText(String.valueOf(totalTrue)+"/"+totalQuestions);
        Log.i("HashMap", String.valueOf(hashMap));
        Adapter adapter = new Adapter(getApplicationContext(), R.layout.layout_result_delegate,
                dataList, hashMap);
        listView.setAdapter(adapter);
        final DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        disableNavigationViewScrollbars(navigationView);
        header = navigationView.getHeaderView(0);
        TextView result = (TextView) header.findViewById(R.id.text_result);
        if (totalTrue < 38) {
            result.setText("Test Result: Fail");
        } else {
            result.setText("Test Result: Pass");
        }
        Calendar c = Calendar.getInstance();
        System.out.println("Current time => " + c.getTime());

        SimpleDateFormat df = new SimpleDateFormat("dd-MMM-yyyy");
        String formattedDate = df.format(c.getTime());
        TextView date = (TextView) header.findViewById(R.id.date);
        date.setText(formattedDate);
        Button haveAnotherGo = (Button) header.findViewById(R.id.button);
        haveAnotherGo.setOnClickListener(this);
    }

    private void disableNavigationViewScrollbars(NavigationView navigationView) {
        if (navigationView != null) {
            NavigationMenuView navigationMenuView = (NavigationMenuView) navigationView.getChildAt(0);
            if (navigationMenuView != null) {
                navigationMenuView.setVerticalScrollBarEnabled(false);
            }
        }
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button:
                finish();
                startActivity(new Intent(getApplicationContext(), SelectionActivity.class));
                break;
        }
    }

    class Adapter extends ArrayAdapter<String> {

        private ArrayList<String> arrayList;
        private HashMap<String, String> hashMap;

        public Adapter(Context context, int resource, ArrayList<String> arrayList,
                       HashMap<String, String> hashMap) {
            super(context, resource, arrayList);
            this.arrayList = arrayList;
            this.hashMap = hashMap;
        }

        @SuppressLint("SetTextI18n")
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            if (convertView == null) {
                LayoutInflater layoutInflater = getLayoutInflater();
                convertView = layoutInflater.inflate(R.layout.layout_result_delegate, parent, false);
                viewHolder = new ViewHolder();
                viewHolder.category =(TextView) convertView.findViewById(R.id.category_name);
                viewHolder.result = (TextView) convertView.findViewById(R.id.questions_result);
                convertView.setTag(viewHolder);
            } else {
                viewHolder = (ViewHolder) convertView.getTag();
            }
            viewHolder.category.setText(arrayList.get(position));
            String result;
            Log.e(""+arrayList.get(position), String.valueOf(hashMap.get(arrayList.get(position))));
            if (hashMap.get(arrayList.get(position)) != null) {
                result = String.valueOf(hashMap.get(arrayList.get(position)));
            } else {
                result = "0";
            }
            int totalItems = StartTestActivity.getInstance()
                    .getCurrentCategoryMaxQuestion(arrayList.get(position))+1;
            viewHolder.result.setText(result+"/"+String.valueOf(totalItems));
            return convertView;
        }

        @Override
        public int getCount() {
            return arrayList.size();
        }
    }
    class ViewHolder {
        public TextView category;
        public TextView result;
    }
}
