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

public class GroundworkActivity extends AppCompatActivity {

    ImageButton fabNext1;
    ImageButton fabPrevious1;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_groundwork); //Show contents of activity_groundwork.xml from layouts in resources
        addListenerOnButtonPrevious1();
        addListenerOnButtonNext1();
    }

    //This method listens for any hits on the previous button on the activity and onclick, calls MainActivity.class

    public void addListenerOnButtonPrevious1() {

        final Context context = this;

        fabPrevious1 = (ImageButton) findViewById(R.id.fabPrevious1);

        fabPrevious1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, MainActivity.class);
                startActivity(intent);

            }

        });

    }

    //This method listens for any hits on the next button on the activity and onclick, calls ToolsActivity.class

    public void addListenerOnButtonNext1() {

        final Context context = this;

        fabNext1 = (ImageButton) findViewById(R.id.fabNext1);

        fabNext1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, ToolsActivity.class);
                startActivity(intent);

            }

        });

    }

}

