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

public class page3 extends Activity {

    ImageButton fabNext3;
    ImageButton fabPrevious3;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page3);
        addListenerOnButtonPrevious3();
        addListenerOnButtonNext3();
    }
    public void addListenerOnButtonPrevious3() {

        final Context context = this;

        fabPrevious3 = (ImageButton) findViewById(R.id.fabPrevious3);

        fabPrevious3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, page2.class);
                startActivity(intent);

            }

        });

    }

    public void addListenerOnButtonNext3() {

        final Context context = this;

        fabNext3 = (ImageButton) findViewById(R.id.fabNext3);

        fabNext3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, page4.class);
                startActivity(intent);

            }

        });

    }

}

