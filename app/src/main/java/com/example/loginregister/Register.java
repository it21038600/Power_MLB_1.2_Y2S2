package com.example.loginregister;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        final EditText FullName = findViewById(R.id.FullnameID);
        final TextView EmailAddress = findViewById(R.id.EmailID);
        final TextView Password = findViewById(R.id.PasswordID);

        final Button Registerbtn = findViewById(R.id.Registerbtn);

        final TextView Loginbtn  = findViewById(R.id.Loginbtn);

        Loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
            }
        });

    }
}