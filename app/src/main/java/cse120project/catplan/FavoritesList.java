package cse120project.catplan;

import Favorites;

/*
* Will be used to contain the List all favorite
* */

public class FavoritesList extends Favorites {

    LinkedList FList<Favorites> = new LinkedList();

    void static addFavorite(){  //creating a new favorite list of courses

        Favorites F = new Favorites();

        FList.add(F);
    }

    void static removeFavortite(int ID){

        if(FList.size() != 0) {   //checking if there is Favorites to remove

            if(FList.get(ID).size() != 0){   //removers the courses in the Favorites list being romoved
                FList.get(ID).removeAllCourses();
            }

            Favorites.remove(ID);
        }
    }

}
