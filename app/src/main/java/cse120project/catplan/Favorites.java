package cse120project.catplan;
import java.util.LinkedList;
import cse120project.catplan.Courses;

/*
Here we will create a list of Favorite courses to set
 */

public class Favorites{

    LinkedList<Courses> Schedule;
    int ID;

    Favorites(int ID) {   //creates a list to contain all the courses the person wants
        Schedule = new LinkedList();
        ID = this.ID;
    }

    void addCourse(String name, int CRN){ //adds a course to the list of courses

        Courses C = new Courses(name, CRN, 0, null, null);

        Schedule.add(C);
    }

    void removeAllCourses(){ //will use when deleteing an entire Favorite course list

        int i = 0;
        while(Schedule.size() != 0){
            removeCourse(Schedule.get(i).getCourseCRN());
        }
    }

    void removeCourse(int CRN){       //removes the chosen course

        int i = 0;

        if(Schedule.size() != 0) {

            while (Schedule.get(i).getCourseCRN() != CRN) {
                i++;
            }

            Schedule.get(i).removeinfo();
            Schedule.remove(i);
        }
    }

}