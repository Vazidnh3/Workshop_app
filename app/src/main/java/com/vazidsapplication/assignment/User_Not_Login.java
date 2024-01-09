package com.vazidsapplication.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class User_Not_Login extends AppCompatActivity {
    Button textBut5;
    Button textBut6;
    Button textBut7;
    Button textBut8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_not_login);
        textBut5 = findViewById(R.id.textBut5);
        textBut6 = findViewById(R.id.textBut6);
        textBut7 = findViewById(R.id.textBut7);
        textBut8 = findViewById(R.id.textBut8);
        textBut5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(User_Not_Login.this,"Login First",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(User_Not_Login.this, Login.class));
            }
        });
        textBut6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(User_Not_Login.this,"Login First",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(User_Not_Login.this, Login.class));
            }
        });
        textBut7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(User_Not_Login.this,"Login First",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(User_Not_Login.this, Login.class));
            }
        });
        textBut8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(User_Not_Login.this,"Login First",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(User_Not_Login.this, Login.class));
            }
        });
    }
}