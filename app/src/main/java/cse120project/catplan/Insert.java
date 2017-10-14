package cse120project.catplan;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Insert {
    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference Ref = database.getReference("User");

    //SignUp Input
    public void SignUp(User object){
        DatabaseReference Ref = database.getReference("User");

        Ref.setValue(object);

    }

    //Insert Courses/Labs/Discussion
    public void Course(String username, Course object){

        Ref.child(username).child("Courses").push().setValue(object);

    }

    //Insert Schedule to Favourites
    public void Favourite(String username, Favourites object){
        DatabaseReference Ref = database.getReference("Courses");

        Ref.child(username).child("Favourites").setValue(object);

    }



}
