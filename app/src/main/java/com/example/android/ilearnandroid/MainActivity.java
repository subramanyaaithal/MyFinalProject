

package com.example.android.ilearnandroid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;


public class MainActivity extends AppCompatActivity {

    ImageButton fabNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //Show contents of activity_main.xml from layouts in resources
        addListenerOnButton();
    }
    //This method listens for any hits on the next button on the activity and onclick, calls GroundworkActivity.class

    public void addListenerOnButton() {

        final Context context = this;

        fabNext = (ImageButton) findViewById(R.id.fabNext);

        fabNext.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, GroundworkActivity.class);
                startActivity(intent);

            }

        });

    }


}
