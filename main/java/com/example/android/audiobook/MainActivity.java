package com.example.android.audiobook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the zootopia category
        TextView zootopia = (TextView) findViewById(R.id.zootopia);

        // Set a click listener on that View
        zootopia.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ZootopiaActivity}
                Intent zootopiaIntent = new Intent(MainActivity.this, Zootopia.class);

                // Start the new activity
                startActivity(zootopiaIntent);
            }
        });

        // Find the View that shows the introduction category
        TextView intro = (TextView) findViewById(R.id.intro);

        // Set a click listener on that View
        intro.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the colors category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link IntroActivity}
                Intent introIntent = new Intent(MainActivity.this, IntroActivity.class);

                // Start the new activity
                startActivity(introIntent);
            }
        });

        // Find the View that shows the link category
        TextView quiz = (TextView) findViewById(R.id.quiz);

        // Set a click listener on that View
        quiz.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the phrases category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link LinkActivity}
                Intent linkIntent = new Intent(MainActivity.this, QuizActivity.class);

                // Start the new activity
                startActivity(linkIntent);
            }
        });

        /**
         * When the exit button is clicked.
         */

        btnExit = findViewById(R.id.exit);

        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_HOME);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }});
    }
}