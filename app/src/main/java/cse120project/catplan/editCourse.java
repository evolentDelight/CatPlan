/**
 * Created by Rolly-kun on 10/13/2017.
 */
package cse120project.catplan;
import android.support.v7.app.AppCompatActivity;

public class editCourse extends AppCompatActivity {   //follow tutorial MainActivity

    //private Button mSendData;   //Delete?
    private Firebase mRef;
    //testing
    @Override

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Firebase.setAndroidContext(this);

        mRef = new Firebase("https://catplan-2c5f7.firebaseio.com/");

        mSendData = (Button) findViewById(R.id.sendData);

        mRef.addValueEventListener(new View.OnClickListener()){
            @Override
                    //Current Course info
                public void onDataChange(DataSnapshot data Snapshot){
                String courseName = get("Course Name");
                String courseNumber = get("Course Number");
                String courseRegistrationNum = get("CRN");
                String semester = get("Semester");
                String year = get("Year");

                //Change Current info
            }
        }
    }




}
