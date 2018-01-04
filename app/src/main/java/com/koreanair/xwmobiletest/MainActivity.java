package com.koreanair.xwmobiletest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void onClickButton1(View view) {
        Intent intent = new Intent(this, Quiz1WebViewActivity.class);
        startActivity(intent);
    }

    public void onClickButton2(View view) {
        Intent intent = new Intent(this, Quiz2ListViewActivity.class);
        startActivity(intent);
    }
}
