package application.catplan_simulation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Button;
import android.content.Intent;
import android.content.Context;
import android.content.SharedPreferences;

public class SearchCatalog extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    /*
    Additional Features:
        We could save the choices selected from previous interaction but as of now, I think it
            is more important to focus on the main program
    */

    //Drop Down Menu Items
    /*
        Preferably, I would like for this part to call a method called "update"
            that gives you the year and new available majors.
            By doing this, we only need to update the "update" method for future convenience.
            Currently we should have Fall 2017 - Spring 2018

    //Using 1, 2, 3... to reduce variable names
        1: Semester
        2: Year
        3: Subject(Optional)
        4: Major(Optional)
    */
    private static final String[] paths1 = {"Fall", "Spring"};
    private static final String[] paths2 = {"2017", "2018"};
    private static final String[] paths3 = {"None", "ANTH", "BIO", "CSE"};
    private static final String[] paths4 = {"None", "A", "B", "C"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_catalog);


     //Spinner Implementation
        Spinner spinner1 = (Spinner)findViewById(R.id.spinner1);
        Spinner spinner2 = (Spinner)findViewById(R.id.spinner2);
        Spinner spinner3 = (Spinner)findViewById(R.id.spinner3);
        Spinner spinner4 = (Spinner)findViewById(R.id.spinner4);

        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(SearchCatalog.this,
                android.R.layout.simple_spinner_item, paths1);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(SearchCatalog.this,
                android.R.layout.simple_spinner_item, paths2);
        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(SearchCatalog.this,
                android.R.layout.simple_spinner_item, paths3);
        ArrayAdapter<String> adapter4 = new ArrayAdapter<String>(SearchCatalog.this,
                android.R.layout.simple_spinner_item, paths4);

        spinner1.setAdapter(adapter1);
        spinner2.setAdapter(adapter2);
        spinner3.setAdapter(adapter3);
        spinner4.setAdapter(adapter4);

        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner1.setOnItemSelectedListener(this);
        spinner2.setOnItemSelectedListener(this);
        spinner3.setOnItemSelectedListener(this);
        spinner4.setOnItemSelectedListener(this);


     //Button: Enter Implementation
        Button enter = (Button)findViewById(R.id.enter);

        enter.setOnClickListener(new OnClickListener(){

            public void onClick(View v){
                Intent intent = new Intent(SearchCatalog.this, AddCourses.class);
                startActivity(intent);

            }
        });

    }


    //DropDown List
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id){

        //Input the selected choices, Semester, Year, Subject(Optional), Major(Optional)
        //      into the database for future use.

        //SharedPreferences to store these datas onto the xml file of 15KB storage
        String UserSelections = "UserSelections"; //Name of xml file to store in
        SharedPreferences SP = getSharedPreferences(UserSelections, Context.MODE_PRIVATE);

        SharedPreferences.Editor editor = SP.edit();

        switch(parent.getId()){
            case R.id.spinner1:
                String Semester = parent.getItemAtPosition(position).toString();

                //The datas here and below are saved onto SharedPreferences storage
                    //with the name of UserS
                editor.putString("Semester", Semester);
                editor.apply();

                break;

            case R.id.spinner2:
                String Year = parent.getItemAtPosition(position).toString();

                editor.putString("Year", Year);
                editor.apply();

                break;

            case R.id.spinner3:
                String Subject = parent.getItemAtPosition(position).toString();

                editor.putString("Subject", Subject);
                editor.apply();

                break;

            case R.id.spinner4:
                String Major = parent.getItemAtPosition(position).toString();

                editor.putString("Major", Major);
                editor.apply();

        }

    }

    //Presumption: Do nothing When selected
    @Override
    public void onNothingSelected(AdapterView<?> arg0){
        //Do Nothing
    }


}
