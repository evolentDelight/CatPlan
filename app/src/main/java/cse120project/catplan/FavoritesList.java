package cse120project.catplan;

import cse120project.catplan.Favorites;

/*
* Will be used to contain the List all favorite
* */

public class FavoritesList{

    LinkedList<Favorites> FList = new LinkedList();

    void addFavorite(){  //creating a new favorite list of courses

        Favorites F = new Favorites(0);

        FList.add(F);
    }

    void removeFavortite(int ID){

        if(FList.size() != 0) {   //checking if there is Favorites to remove

            if(FList.get(ID).Schedule.size() != 0){   //removes the courses in the Favorites list being removed
                FList.get(ID).removeAllCourses();
            }

            FList.remove(ID);
        }
    }

}