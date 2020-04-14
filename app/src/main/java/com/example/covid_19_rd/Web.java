package com.example.covid_19_rd;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Web extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        WebView myWebView = findViewById(R.id.webview);
        final String[] countryList = getResources().getStringArray(R.array.countryEN);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String value = extras.getString("key");
            assert value != null;
            if(value.equals("0")){
                myWebView.loadUrl("https://www.worldometers.info/coronavirus/");
            }
            for(int i = 1; i <= countryList.length; i++){
                String value2 = String.valueOf(i);
                if(value.equals(value2)){
                    myWebView.loadUrl("https://www.worldometers.info/coronavirus/country/" + countryList[i]);
                }
            }
        }
    }
}
