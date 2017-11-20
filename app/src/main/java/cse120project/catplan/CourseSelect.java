package com.example.matri.catplan;

/**
 * Created by Rolly-kun on 11/3/2017.
 */

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

//Used explicitly what you created
import android.app.Activity;    //Delete?
import android.view.View;
import android.content.Intent; //used for making new activities

/*
 * Created to do what Catalog does but better. This
 * class should allow user see which courses they can select
 * from the catalog
 */

public class CourseSelect extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    //Should open the desired catalog for viewing. Opens a new activity
    public void CSviewClick(View v){
        if(v.getId() == R.id.CSviewcourseButton){
            Intent i = new Intent(CourseSelect.this, Catalog.class);
            startActivity(i);
        }
    }







}
