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

public class page4 extends Activity {

    ImageButton fabNext4;
    ImageButton fabPrevious4;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page4);
        addListenerOnButtonPrevious4();
        addListenerOnButtonNext4();
    }
    public void addListenerOnButtonPrevious4() {

        final Context context = this;

        fabPrevious4 = (ImageButton) findViewById(R.id.fabPrevious4);

        fabPrevious4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, page3.class);
                startActivity(intent);

            }

        });

    }

    public void addListenerOnButtonNext4() {

        final Context context = this;

        fabNext4 = (ImageButton) findViewById(R.id.fabNext4);

        fabNext4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, page5.class);
                startActivity(intent);

            }

        });

    }

}

