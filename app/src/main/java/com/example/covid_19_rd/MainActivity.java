package com.example.covid_19_rd;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        ListView listView = findViewById(R.id.lvCountry);
        final String[] countryList = getResources().getStringArray(R.array.country);

        ArrayAdapter<String> mAdapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_list_item_1, android.R.id.text1, countryList
        );

        listView.setAdapter(mAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String value = String.valueOf(position);
                Intent i = new Intent(MainActivity.this, Web.class);
                i.putExtra("key",value);
                startActivity(i);
            }
        });
    }
}
