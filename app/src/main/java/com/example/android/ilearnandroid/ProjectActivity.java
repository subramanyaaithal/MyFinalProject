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

public class ProjectActivity extends AppCompatActivity {

    ImageButton fabNext4;
    ImageButton fabPrevious4;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project); //Show contents of activity_project.xml from layouts in resources
        addListenerOnButtonPrevious4();
        addListenerOnButtonNext4();
    }

    //This method listens for any hits on the previous button on the activity and onclick, calls SearchActivity.class

    public void addListenerOnButtonPrevious4() {

        final Context context = this;

        fabPrevious4 = (ImageButton) findViewById(R.id.fabPrevious4);

        fabPrevious4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, SearchActivity.class);
                startActivity(intent);

            }

        });

    }

    //This method listens for any hits on the next button on the activity and onclick, calls UdacityActivity.class

    public void addListenerOnButtonNext4() {

        final Context context = this;

        fabNext4 = (ImageButton) findViewById(R.id.fabNext4);

        fabNext4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, UdacityActivity.class);
                startActivity(intent);

            }

        });

    }

}

