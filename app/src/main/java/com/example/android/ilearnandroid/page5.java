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

public class page5 extends Activity {

    ImageButton fabNext5;
    ImageButton fabPrevious5;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page5);
        addListenerOnButtonPrevious5();
        addListenerOnButtonNext5();
    }
    public void addListenerOnButtonPrevious5() {

        final Context context = this;

        fabPrevious5 = (ImageButton) findViewById(R.id.fabPrevious5);

        fabPrevious5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, page4.class);
                startActivity(intent);

            }

        });

    }

    public void addListenerOnButtonNext5() {

        final Context context = this;

        fabNext5 = (ImageButton) findViewById(R.id.fabNext5);

        fabNext5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, page_last.class);
                startActivity(intent);

            }

        });

    }

}

