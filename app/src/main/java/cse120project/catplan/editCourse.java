/**
 * Created by Rolly-kun on 10/13/2017.
 *
 * This class is simply used to edit a course
 */
package cse120project.catplan;
import cse120project.catplan.Courses;
import java.util.LinkedList;


import android.support.v7.app.AppCompatActivity;
// extends AppCompatActivity

public class editCourse extends Courses{   //follow tutorial MainActivity

    //private Button mSendData;   //Delete?
    //private Firebase mRef;
    //testing

    //This effectively changes the course information, replacing the old info.
    void editCourse(String coursename, int CRN, int AmtUnit){

            CourseName = coursename;
            CourseCRN = CRN;
            int AmountOfUnits = AmtUnit;
    }

    String getCourseName(){
        return CourseName;
    }

    int getCourseCRN(){
        return CourseCRN;
    }

    String getDays(){
        return Days;
    }

    String getHours(){
        return Hours;
    }






}
