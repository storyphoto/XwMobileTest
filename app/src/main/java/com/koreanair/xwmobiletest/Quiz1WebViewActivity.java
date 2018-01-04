package com.koreanair.xwmobiletest;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by kim.sungj on 2018-01-04.
 */

public class Quiz1WebViewActivity extends Activity {
    private final String urlForLoading = "http://m.koreanair.com";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz1_web_view);

        WebView webview = (WebView)findViewById(R.id.webview1);
        webview.setWebViewClient(new WebViewClient());
        webview.loadUrl(urlForLoading);

    }
}
