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

public class page2 extends Activity {

    ImageButton fabNext2;
    ImageButton fabPrevious2;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page2);
        addListenerOnButtonPrevious2();
        addListenerOnButtonNext2();
    }
    public void addListenerOnButtonPrevious2() {

        final Context context = this;

        fabPrevious2 = (ImageButton) findViewById(R.id.fabPrevious2);

        fabPrevious2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, page1.class);
                startActivity(intent);

            }

        });

    }

    public void addListenerOnButtonNext2() {

        final Context context = this;

        fabNext2 = (ImageButton) findViewById(R.id.fabNext2);

        fabNext2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, page3.class);
                startActivity(intent);

            }

        });

    }

}

