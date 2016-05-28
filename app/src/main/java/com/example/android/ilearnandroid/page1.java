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

public class page1 extends Activity {

    ImageButton fabNext1;
    ImageButton fabPrevious1;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page1);
        addListenerOnButtonPrevious1();
        addListenerOnButtonNext1();
    }
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

    public void addListenerOnButtonNext1() {

        final Context context = this;

        fabNext1 = (ImageButton) findViewById(R.id.fabNext1);

        fabNext1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, page2.class);
                startActivity(intent);

            }

        });

    }

}

