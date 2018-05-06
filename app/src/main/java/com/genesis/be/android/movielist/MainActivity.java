package com.genesis.be.android.movielist;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_movielist);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab =  findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "This doesn't work for now",
                        Snackbar.LENGTH_SHORT).setAction("Undo", null).show();
            }
        });

        //Create movie list
        final ArrayList<Movies> movies = new ArrayList<>();
       movies.add(new Movies("The Lion King", "Animation", "1994"));
       movies.add(new Movies("Prince of Egypt", "Animation", "1996"));
       movies.add(new Movies("Gone Girl", "Thriller","2015"));
       movies.add(new Movies("Rurouni Kenshin", "Oriental Action", "2012"));
       movies.add(new Movies("Iron Man", "Action", "2008"));
       movies.add(new Movies("Raiders of the lost ark", "Science Fiction", "1895"));
       movies.add(new Movies("Jack Ryan; Shadow Recruit","Action", "2014"));
       movies.add(new Movies("Beyond the Lights", "Romance", "2014"));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
