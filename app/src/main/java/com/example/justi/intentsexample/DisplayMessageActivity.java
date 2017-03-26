package com.example.justi.intentsexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        // Get the Intent that started this activity and extract the string

        int currentYear = 2017;
        Intent intent = getIntent();
        String message = intent.getStringExtra("Name");
        String year = intent.getStringExtra("year");

        int intYear = Integer.parseInt(year);
        int age = currentYear - intYear;

        String currentAge = Integer.toString(age);

        if(age >= 20){
            TextView elegible = (TextView) findViewById(R.id.eligibility);
            elegible.setText("Your Age Is Above 20 - ELIGIBLE");
        }else{
            TextView elegible = (TextView) findViewById(R.id.eligibility);
            elegible.setText("Your Age Is Less Than 20 - NOT ELIGIBLE");
        }
        TextView ageName = (TextView) findViewById(R.id.currentAge);
        ageName.setText("Your Age Is: "+currentAge);

        // Capture the layout's TextView and set the string as its text
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(message);

        TextView textView2 = (TextView) findViewById(R.id.textView2);
        textView2.setText(year);

    }
}
