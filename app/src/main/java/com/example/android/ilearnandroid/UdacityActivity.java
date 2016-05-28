package com.example.android.ilearnandroid;

/**
 * Created by subramanya.aithal on 27/05/16.
 */

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class UdacityActivity extends AppCompatActivity {

    ImageButton fabNext5;
    ImageButton fabPrevious5;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_udacity); //Show contents of activity_udacity.xml from layouts in resources
        addListenerOnButtonPrevious5();
        addListenerOnButtonNext5();
    }

    //This method listens for any hits on the previous button on the activity and onclick, calls ProjectActivity.class
    public void addListenerOnButtonPrevious5() {

        final Context context = this;

        fabPrevious5 = (ImageButton) findViewById(R.id.fabPrevious5);

        fabPrevious5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, ProjectActivity.class);
                startActivity(intent);

            }

        });

    }

    //This method listens for any hits on the next button on the activity and onclick, calls HappyLearningActivity.class

    public void addListenerOnButtonNext5() {

        final Context context = this;

        fabNext5 = (ImageButton) findViewById(R.id.fabNext5);

        fabNext5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, HappyLearningActivity.class);
                startActivity(intent);

            }

        });

    }

}

