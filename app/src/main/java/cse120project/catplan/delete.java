package com.example.irianaguiluz.catplan;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by irianaguiluz on 10/13/17.
 */
import Selction.java;   /*need to know which favorite is selected to know what to delete*/


/*file still needs to be created*/
import FavoriteCoursesList.java; /*should contain the list of all the persons saved school plans*/
                                /*would be helpful if all placed in a linked list*/
                                /*add way to check if course was succesfully deleted otherwise error*/
public class delete {

    protected void deleteAllFavorites(){

        if(!FavoriteCourses.empty();){
            /*go through list of Favorites and delete*/
            deleteFavorite(1);
        }
    }

    protected void deleteFavorite(int FavListNum){
        if(FavoriteCourses.[FavListNum]){   /*should check if the list number exist to delete*/

            /*you cant just delete the favorite course you need to go through each favorite and
            delete the course they have then delete the specific favorite*/
             /*hense the need for the while loop*/

            while(FavoritesCouses.[FavListNum].course()){

                deleteAllCourse(1); /*will call on the deleteCourse option*/
            }
        }
    }

    protected void deleteAllCourse(){
        while(/*make sure the lest of courses is not empty*/){

            deleteCourse(1);/*should delete the specified course*/
        }
    }

    /*could help if you bring address of first course of specified favorite*/

    protected void deleteCourse(int courseNumber){    /*not in favorites here*/
        if(){      /*will go through list of courses in the favorites in case of edit*/
                                    /*would be best in courses are also in a linked list*/


        }

    }

}
