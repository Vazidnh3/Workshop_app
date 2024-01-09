package com.vazidsapplication.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    TextView txt_signup;

    EditText login_email;
    EditText login_password;
    TextView signIn_btn,skip;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        txt_signup = findViewById(R.id.txt_signup);
        txt_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Login.this, Registration.class));

            }
        });

        login_email = findViewById(R.id.login_email);
        login_password = findViewById(R.id.login_password);
        signIn_btn = findViewById(R.id.signin_btn);
        skip = findViewById(R.id.skip);
        String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";


        signIn_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (isRegistrationDataStored()) {
                    SharedPreferences sharedPreferences = getSharedPreferences("MyPrefs", MODE_PRIVATE);
                    String storedUsername = sharedPreferences.getString("username", "");
                    String storedPassword = sharedPreferences.getString("password", "");

                    if (storedUsername.isEmpty() || storedPassword.isEmpty()) {
                        // Registration not done
                        // Print message or navigate to the registration page
                        Toast.makeText(Login.this, "Register first!", Toast.LENGTH_SHORT).show();
                    } else {
                        // Registration done, proceed with authentication
                        String enteredUsername = login_email.getText().toString();
                        String enteredPassword = login_password.getText().toString();

                        // You can implement your authentication logic here
                        if (enteredUsername.equals(storedUsername) && enteredPassword.equals(storedPassword)) {
                            // Authentication successful, proceed with the app
                            // You might want to navigate to the main activity or perform other actions here
                            Toast.makeText(Login.this, "Authentication successful!", Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(Login.this, MainActivity.class));
                        } else {
                            // Authentication failed
                            Toast.makeText(Login.this, "Authentication failed!", Toast.LENGTH_SHORT).show();
                        }
                    }
                } else {
                    // Registration data is not stored
                    Toast.makeText(Login.this, "Register first!", Toast.LENGTH_SHORT).show();
                }
            }
        });


        skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(Login.this, User_Not_Login.class));

                finish();
            }
        });
    }
    private boolean isRegistrationDataStored() {
        // Check if registration details exist in SharedPreferences

        SharedPreferences sharedPreferences = getSharedPreferences("MyPrefs", MODE_PRIVATE);
        String storedUsername = sharedPreferences.getString("username", "");
        String storedPassword = sharedPreferences.getString("password", "");
        Log.d("LoginActivity", "Stored Username: " + storedUsername);
        Log.d("LoginActivity", "Stored Password: " + storedPassword);

        // Check if both username and password are non-empty
        boolean dataStored = !storedUsername.isEmpty() && !storedPassword.isEmpty();
        Log.d("LoginActivity", "Data Stored: " + dataStored);

        return dataStored;

    }
}