package com.yulitka.nerdr;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final Button loginBtn = findViewById(R.id.liLoginBtn);
        loginBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),R.string.available_soon,Toast.LENGTH_SHORT).show();
            }
        });

        final TextView registrationBtn = findViewById(R.id.liRegistrationLink);
        registrationBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),RegistrationActivity.class);
                startActivity(i);
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
}
