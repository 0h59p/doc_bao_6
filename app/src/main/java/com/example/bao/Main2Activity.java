package com.example.bao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    WebView webView;
    private String dlink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        webView = findViewById(R.id.webview);
        Intent intent = getIntent();
        String dlink = intent.getStringExtra("link");
        webView.loadUrl(dlink);
        webView.setWebViewClient(new WebViewClient());
    }
}
