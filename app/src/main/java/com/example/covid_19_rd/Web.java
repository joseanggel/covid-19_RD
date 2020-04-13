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

            for(int i = 1; i <= systemList.length; i++){
                String value2 = String.valueOf(i);
                if(value.equals(value2)){
                    myWebView.loadUrl("https://www.worldometers.info/coronavirus/country/" + countryList[i]);
                }



            }
//            if(value.equals("0")){
//
//                myWebView.loadUrl("https://www.worldometers.info/coronavirus/");
//
//            }
//            if(value.equals("1")){
//
//                myWebView.loadUrl("https://www.worldometers.info/coronavirus/country/afghanistan");
//
//            }
//
//            if(value.equals("2")){
//
//                myWebView.loadUrl("https://www.worldometers.info/coronavirus/country/italy/");
//
//            }
//
//            if(value.equals("3")){
//
//                myWebView.loadUrl("https://www.worldometers.info/coronavirus/country/spain/");
//
//            }
//
//            if(value.equals("4")){
//
//                myWebView.loadUrl("https://www.worldometers.info/coronavirus/country/france/");
//
//            }
//
//            if(value.equals("5")){
//
//                myWebView.loadUrl("https://www.worldometers.info/coronavirus/country/china/");
//
//            }
//
//            if(value.equals("6")){
//
//                myWebView.loadUrl("https://www.worldometers.info/coronavirus/country/iran/");
//
//            }
//
//            if(value.equals("7")){
//
//                myWebView.loadUrl("https://www.worldometers.info/coronavirus/country/dominican-republic/");
//
//            }
//
//            if(value.equals("8")){
//
//                myWebView.loadUrl("https://www.worldometers.info/coronavirus/country/germany/");
//
//            }
//
//            if(value.equals("9")){
//
//                myWebView.loadUrl("https://www.worldometers.info/coronavirus/country/uk/");
//
//            }
//
//            if(value.equals("10")){
//
//                myWebView.loadUrl("https://www.worldometers.info/coronavirus/country/belgium/");
//
//            }
//
//            if(value.equals("11")){
//
//                myWebView.loadUrl("https://www.worldometers.info/coronavirus/country/mexico/");
//
//            }
//
//            if(value.equals("12")){
//
//                myWebView.loadUrl("https://www.worldometers.info/coronavirus/country/turkey/");
//
//            }
//
//            if(value.equals("13")){
//
//                myWebView.loadUrl("https://www.worldometers.info/coronavirus/country/germany/");
//
//            }
//
//            if(value.equals("13")){
//
//                myWebView.loadUrl("https://www.worldometers.info/coronavirus/country/netherlands/");
//
//            }



        }


//        myWebView.loadUrl("https://www.worldometers.info/coronavirus/country/us/");

    }


}
