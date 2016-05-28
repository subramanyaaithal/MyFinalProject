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

public class SearchActivity extends AppCompatActivity {

    ImageButton fabNext3;
    ImageButton fabPrevious3;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);  //Show contents of activity_search.xml from layouts in resources
        addListenerOnButtonPrevious3();
        addListenerOnButtonNext3();
    }

    //This method listens for any hits on the previous button on the activity and onclick, calls ToolsActivity.class

    public void addListenerOnButtonPrevious3() {

        final Context context = this;

        fabPrevious3 = (ImageButton) findViewById(R.id.fabPrevious3);

        fabPrevious3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, ToolsActivity.class);
                startActivity(intent);

            }

        });

    }

    //This method listens for any hits on the next button on the activity and onclick, calls ProjectActivity.class

    public void addListenerOnButtonNext3() {

        final Context context = this;

        fabNext3 = (ImageButton) findViewById(R.id.fabNext3);

        fabNext3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, ProjectActivity.class);
                startActivity(intent);

            }

        });

    }

}

