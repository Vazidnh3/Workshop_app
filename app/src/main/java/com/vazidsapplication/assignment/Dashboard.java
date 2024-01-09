package com.vazidsapplication.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        // Get the text from the Intent
        Intent intent = getIntent();
        String newText = intent.getStringExtra("newText");
        String newText1 = intent.getStringExtra("newText1");
        String newText2 = intent.getStringExtra("newText2");
        String newText3 = intent.getStringExtra("newText3");

        // Update the TextView in Activity2 with the new text
        TextView textView = findViewById(R.id.dashboardtext);
        textView.setText(newText);

        TextView textView1 = findViewById(R.id.dashboardtext1);
        textView1.setText(newText1);
        TextView textView2 = findViewById(R.id.dashboardtext2);
        textView2.setText(newText2);
        TextView textView3 = findViewById(R.id.dashboardtext3);
        textView3.setText(newText3);

    }
}