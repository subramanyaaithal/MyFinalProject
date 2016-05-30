

package com.example.android.ilearnandroid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;


public class MainActivity extends AppCompatActivity {

    ImageButton fabNextMain;
    ImageButton fabPreviousGroundwork;
    ImageButton fabNextGroundwork;
    ImageButton fabNextTools;
    ImageButton fabPreviousTools;
    ImageButton fabNextSearch;
    ImageButton fabPreviousSearch;
    ImageButton fabNextProject;
    ImageButton fabPreviousProject;
    ImageButton fabNextUdacity;
    ImageButton fabPreviousUdacity;
    ImageButton fabPreviousHappyLearning;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //Show views from activity_main.xml from layouts in resources
        addListenerOnButtonNextMain();

    }
    //This method listens for any hits on the next button on the activity_main.xml and onclick, load activity_groundwork.xml

    public void addListenerOnButtonNextMain() {

        fabNextMain = (ImageButton) findViewById(R.id.fabNextMain);

        fabNextMain.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                setContentView(R.layout.activity_groundwork); //Show views from activity_groundwork.xml from layouts in resources
                addListenerOnButtonPreviousGroundwork();
                addListenerOnButtonNextGroundwork();
            }

        });

    }


    //This method listens for any hits on the previous button on the activity_groundwork.xml and onclick, load MainActivity.class

    public void addListenerOnButtonPreviousGroundwork() {

        final Context context = this;

        fabPreviousGroundwork = (ImageButton) findViewById(R.id.fabPreviousGroundwork);

        fabPreviousGroundwork.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, MainActivity.class);
                startActivity(intent);

            }

        });

    }
    //This method listens for any hits on the next button on the activity_groundwork.xml and onclick, load activity_tools.xml

    public void addListenerOnButtonNextGroundwork() {


        fabNextGroundwork = (ImageButton) findViewById(R.id.fabNextGroundwork);

        fabNextGroundwork.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                setContentView(R.layout.activity_tools); //Show views from activity_tools.xml from layouts in resources
                addListenerOnButtonNextTools();
                addListenerOnButtonPreviousTools();

            }

        });

    }

    //This method listens for any hits on the next button on the activity_tools.xml and onclick, load activity_search.xml

    public void addListenerOnButtonNextTools() {


        fabNextTools = (ImageButton) findViewById(R.id.fabNextTools);

        fabNextTools.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                setContentView(R.layout.activity_search); //Show views from activity_search.xml from layouts in resources
                addListenerOnButtonNextSearch();
                addListenerOnButtonPreviousSearch();

            }

        });

    }


    //This method listens for any hits on the previous button on the activity_tools.xml and onclick, load activity_groundwork.xml

    public void addListenerOnButtonPreviousTools() {


        fabPreviousTools = (ImageButton) findViewById(R.id.fabPreviousTools);

        fabPreviousTools.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                setContentView(R.layout.activity_groundwork); //Show views from activity_groundwork.xml from layouts in resources
                addListenerOnButtonNextGroundwork();
                addListenerOnButtonPreviousGroundwork();

            }

        });

    }

    //This method listens for any hits on the next button on the activity_search.xml and onclick, load activity_project.xml

    public void addListenerOnButtonNextSearch() {


        fabNextSearch = (ImageButton) findViewById(R.id.fabNextSearch);

        fabNextSearch.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                setContentView(R.layout.activity_project); //Show views from activity_project.xml from layouts in resources
                addListenerOnButtonNextProject();
                addListenerOnButtonPreviousProject();

            }

        });

    }

    //This method listens for any hits on the previous button on the activity_search.xml and onclick, load activity_tools.xml

    public void addListenerOnButtonPreviousSearch() {


        fabPreviousSearch = (ImageButton) findViewById(R.id.fabPreviousSearch);

        fabPreviousSearch.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                setContentView(R.layout.activity_tools); //Show views from activity_tools.xml from layouts in resources
                addListenerOnButtonNextTools();
                addListenerOnButtonPreviousTools();

            }

        });

    }

    //This method listens for any hits on the next button on the activity_project.xml and onclick, load activity_udacity.xml

    public void addListenerOnButtonNextProject() {


        fabNextProject = (ImageButton) findViewById(R.id.fabNextProject);

        fabNextProject.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                setContentView(R.layout.activity_udacity); //Show views from activity_udacity.xml from layouts in resources
                addListenerOnButtonNextUdacity();
                addListenerOnButtonPreviousUdacity();

            }

        });

    }

    //This method listens for any hits on the previous button on the activity_project.xml and onclick, load activity_search.xml

    public void addListenerOnButtonPreviousProject() {


        fabPreviousProject = (ImageButton) findViewById(R.id.fabPreviousProject);

        fabPreviousProject.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                setContentView(R.layout.activity_search); //Show views from activity_search.xml from layouts in resources
                addListenerOnButtonNextSearch();
                addListenerOnButtonPreviousSearch();

            }

        });

    }


    //This method listens for any hits on the next button on the activity_udacity.xml and onclick, load activity_happy_learning.xml

    public void addListenerOnButtonNextUdacity() {


        fabNextUdacity = (ImageButton) findViewById(R.id.fabNextUdacity);

        fabNextUdacity.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                setContentView(R.layout.activity_happy_learning); //Show views from activity_happy_learning.xml from layouts in resources
                addListenerOnButtonPreviousHappyLearning();

            }

        });

    }

    //This method listens for any hits on the previous button on the activity_udacity.xml and onclick, load activity_project.xml

    public void addListenerOnButtonPreviousUdacity() {


        fabPreviousUdacity = (ImageButton) findViewById(R.id.fabPreviousUdacity);

        fabPreviousUdacity.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                setContentView(R.layout.activity_project); //Show views from activity_project.xml from layouts in resources
                addListenerOnButtonNextProject();
                addListenerOnButtonPreviousProject();

            }

        });

    }

    //This method listens for any hits on the previous button on the activity_happy_learning.xml and onclick, loads activity_udacity.xml

    public void addListenerOnButtonPreviousHappyLearning() {


        fabPreviousHappyLearning = (ImageButton) findViewById(R.id.fabPreviousHappyLearning);

        fabPreviousHappyLearning.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                setContentView(R.layout.activity_udacity); //Show views from activity_udacity.xml from layouts in resources
                addListenerOnButtonNextUdacity();
                addListenerOnButtonPreviousUdacity();

            }

        });

    }

}
