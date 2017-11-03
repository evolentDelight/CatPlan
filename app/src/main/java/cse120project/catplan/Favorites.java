package cse120project.catplan;
import java.util.LinkedList;
import Courses;

/*
Here we will create a list of Favorite courses to set
 */

protected class Favorites extends Courses{

    LinkedList Favorites<Courses>;

    Favorites() {   //creates a list to contain all the courses the person wants
        Favorites = new LinkedList();
    }

    void static addCourse(string name, int CRN){ //adds a course to the list of courses

        Courses C = new Courses();

        C.setCourseName(name);
        C.setCourseID(CRN);

        Favorites.add(C);
    }

    void static removeAllCourses(){ //will use when deleteing an entire Favorite course list

        int i = 0;
        while(Favorites.size() != 0){
            removeCourse(Favorites.get(i).getCourseCRN());
        }
    }

    void static removeCourse(int CRN){       //removes the chosen course

        int i = 0;

        if(Favorites.size() != 0) {

            while (Favorites.get(i).getCourseCRN != CRN) {
                i++;
            }

            Favorites.get(i).removeinfo();
            Favorites.remove(i);
        }
    }

}
