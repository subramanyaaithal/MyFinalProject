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

public class HappyLearningActivity extends AppCompatActivity {

    ImageButton fabPreviousLast;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_happy_learning); //Show contents of activity_happy_learning.xml from layouts in resources
        addListenerOnButtonPreviousLast();
    }

    //This method listens for any hits on the previous button on the activity and onclick, calls UdacityActivity.class

    public void addListenerOnButtonPreviousLast() {

        final Context context = this;

        fabPreviousLast = (ImageButton) findViewById(R.id.fabPreviousLast);

        fabPreviousLast.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, UdacityActivity.class);
                startActivity(intent);

            }

        });

    }

}

