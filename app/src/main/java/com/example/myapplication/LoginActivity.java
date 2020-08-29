package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

<<<<<<< HEAD
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    Button registerButton;

=======
import android.os.Bundle;

public class LoginActivity extends AppCompatActivity {

>>>>>>> d723ffbb28e2daff897d2bc40e62cdc0962771ab
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
<<<<<<< HEAD

        registerButton = findViewById(R.id.buttonR);
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });

=======
>>>>>>> d723ffbb28e2daff897d2bc40e62cdc0962771ab
    }
}