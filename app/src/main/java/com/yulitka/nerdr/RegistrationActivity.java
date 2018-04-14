package com.yulitka.nerdr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.MultiAutoCompleteTextView;
import android.widget.Toast;

import java.io.File;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class RegistrationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        ArrayAdapter<String> countriesAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_dropdown_item_1line, COUNTRIES);
        AutoCompleteTextView countriesView = findViewById(R.id.reCountryAC);
        countriesView.setAdapter(countriesAdapter);

        ArrayAdapter<String> citiesAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_dropdown_item_1line, CITIES);
        MultiAutoCompleteTextView citiesView = findViewById(R.id.reCityMAC);
        citiesView.setAdapter(citiesAdapter);

        final Button loginBtn = findViewById(R.id.reRegistrationBtn);
        loginBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),R.string.available_soon,Toast.LENGTH_SHORT).show();
            }
        });

        final ImageView infoImgBtn = findViewById(R.id.liInfoImage);
        infoImgBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),InfoActivity.class);
                startActivity(i);
            }
        });
    }

    // At this point only Israel is supported
    private static final String[] COUNTRIES = new String[] {
            "Israel"
    };

    // TODO load cities from file
    private static final String[] CITIES = new String[] {
            "Tel Aviv", "Jerusalem", "Haifa", "Eilat"
    };
}
