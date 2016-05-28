package com.example.android.ilearnandroid;

/**
 * Created by subramanya.aithal on 27/05/16.
 */
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class page_last extends Activity {

    ImageButton fabPreviousLast;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_last);
        addListenerOnButtonPreviousLast();
    }
    public void addListenerOnButtonPreviousLast() {

        final Context context = this;

        fabPreviousLast = (ImageButton) findViewById(R.id.fabPreviousLast);

        fabPreviousLast.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, page5.class);
                startActivity(intent);

            }

        });

    }

}

