package com.vazidsapplication.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button  textBut,textBut1,textBut2,textBut3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textBut = findViewById(R.id.textBut);
        textBut1 = findViewById(R.id.textBut1);
        textBut2 = findViewById(R.id.textBut2);
        textBut3 = findViewById(R.id.textBut3);


        textBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Dashboard.class);

                // Put the text you want to pass to Activity2
                String newText = "Workshop 1 id added";
                intent.putExtra("newText", newText);

                // Start the second activity
                startActivity(intent);
            }
        });
        textBut1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Dashboard.class);

                // Put the text you want to pass to Activity2
                String newText1 = "Workshop 2 id added";
                intent.putExtra("newText1", newText1);

                // Start the second activity
                startActivity(intent);
            }
        });
        textBut2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Dashboard.class);

                // Put the text you want to pass to Activity2
                String newText2 = "Workshop 3 id added";
                intent.putExtra("newText2", newText2);

                // Start the second activity
                startActivity(intent);
            }
        });
        textBut3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Dashboard.class);

                // Put the text you want to pass to Activity2
                String newText3 = "Workshop 4 id added";
                intent.putExtra("newText3", newText3);

                // Start the second activity
                startActivity(intent);
            }
        });
    }
}