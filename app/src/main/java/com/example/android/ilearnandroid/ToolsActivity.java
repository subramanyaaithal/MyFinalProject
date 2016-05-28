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

public class ToolsActivity extends AppCompatActivity {

    ImageButton fabNext2;
    ImageButton fabPrevious2;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tools); //Show contents of activity_tools.xml from layouts in resources
        addListenerOnButtonPrevious2();
        addListenerOnButtonNext2();
    }

    //This method listens for any hits on the previous button on the activity and onclick, calls GroundworkActivity.class

    public void addListenerOnButtonPrevious2() {

        final Context context = this;

        fabPrevious2 = (ImageButton) findViewById(R.id.fabPrevious2);

        fabPrevious2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, GroundworkActivity.class);
                startActivity(intent);

            }

        });

    }

    //This method listens for any hits on the previous button on the activity and onclick, calls SearchActivity.class

    public void addListenerOnButtonNext2() {

        final Context context = this;

        fabNext2 = (ImageButton) findViewById(R.id.fabNext2);

        fabNext2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, SearchActivity.class);
                startActivity(intent);

            }

        });

    }

}

