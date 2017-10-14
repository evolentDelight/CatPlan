package com.example.matri.catplan;

import android.support.v7.app.AppCompatActivity;

/**
 * Created by matri on 10/13/2017.
 */

public class Selection extends AppCompatActivity {

        private Firebase mRef;

    @Override
    protected void oncreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRef = newFirebase("https://catplan-f3ebf.firebaseio.com/");

        mRef.addValueEventListener(new ValueEventListener())
        {
            @Override
                    public void onDataChange(DataSnapshot dataSnapshot)
            {
                String courseName = map.get("Course Name");
                String courseNumber = map.get("Course Number");
                String semester = map.get("Semester");
                String year = map.get("Year");
                String major = map.get("Major");

                Log.v("E.VALUE"), "Course Name : " + courseName);
                Log.v("E.VALUE"), "Course Number : " + courseNumber);
                Log.v("E.VALUE"), "Semester : " + semester);
                Log.v("E.VALUE"), "Year: " + year);
                Log.v("E.VALUE"), "Major : " + major);
            }

            public void onCancelled(FirebaseError firebaseError)
            {

            }
        });
    }
}
