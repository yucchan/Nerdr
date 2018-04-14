package com.yulitka.nerdr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;

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
