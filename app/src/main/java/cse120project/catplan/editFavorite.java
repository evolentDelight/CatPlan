package cse120project.catplan;

import cse120project.catplan.Courses;
import cse120project.catplan.Favorites;
import java.util.LinkedList;

/**
 * Created by Rolly-kun on 10/28/2017.
 */

public class editFavorite extends Favorites{

   LinkedList favList<Favorites> = new LinkedList();

    void editFavorite(String name, int newCRN, int removeCRN){  //creating a new favorite list of courses

        Courses course = new Courses();
        int i = 0;

        while(Favorites.size() != 0){
            if(course.getCourseCRN() == removeCRN){
                Favorites.get(i).removeInfo();
                Favorites.remove(i);
            }
        }

        course.setCourseName(name);
        course.setCourseID(CRN);

        Favorites.add(course);
    }

}
