package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {

    Button register;
    EditText user;
    EditText password;
    EditText confirmPassword;
    TextView error;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registar);
        register = findViewById(R.id.loginBtn2);
        user =  (EditText) findViewById(R.id.user);
        password = (EditText) findViewById(R.id.password);
        confirmPassword = (EditText) findViewById(R.id.confirmPassword);
        error = findViewById(R.id.error1);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String us = user.getText().toString();
                String pw = password.getText().toString();
                String cpw = confirmPassword.getText().toString();
                if(pw.equals(cpw)){
                    error.setVisibility(View.INVISIBLE);

                }
                else{
                    error.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}