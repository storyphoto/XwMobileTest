package com.koreanair.xwmobiletest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by kim.sungj on 2018-01-04.
 */

public class Quiz2ListViewActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz2_list_view);

        // 데이터 원본 준비
        ArrayList<String> arList = new ArrayList<String>();
        arList.add("1");
        arList.add("2");
        arList.add("3");
        arList.add("4");
        arList.add("5");
        arList.add("6");
        arList.add("7");
        arList.add("8");
        arList.add("9");
        arList.add("10");

        // 어댑터 준비
        ArrayAdapter<String> Adapter;
        Adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, arList);

        // 어댑터 연결
        ListView list = (ListView) findViewById(R.id.listview1);
        list.setAdapter(Adapter);
    }
}
