package com.byteshaft.licenseservice;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.byteshaft.licenseservice.utils.AppGlobals;

import java.util.ArrayList;
import java.util.HashMap;

public class ResultActivity extends AppCompatActivity {

    private ViewHolder viewHolder;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_result_activity);
        listView = (ListView) findViewById(R.id.result_activity);
        HashMap<String, String> hashMap = (HashMap<String, String>)getIntent()
                .getSerializableExtra(AppGlobals.ANSWER_DATA);
        Log.i("HashMap", String.valueOf(hashMap));
        ArrayList<String> dataList = getIntent()
                .getStringArrayListExtra(AppGlobals.TOTAL_CATEGORIES);
        Adapter adapter = new Adapter(getApplicationContext(), R.layout.layout_result_delegate,
                dataList, hashMap);
        listView.setAdapter(adapter);


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
            viewHolder.result.setText(String.valueOf(hashMap.get(arrayList.get(position))));



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
