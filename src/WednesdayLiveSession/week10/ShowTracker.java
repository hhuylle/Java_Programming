package WednesdayLiveSession.week10;

import java.util.ArrayList;

public class ShowTracker {
    /*
    Create a class ShowTracker

    define these instance variables:
        username
        password
        number of shows watched
        tracked shows (Show ArrayList)

    create a constructor that will initialize the username and password
    create a constructor that will initialize the username, password & number of shows watched
    create a constructor that will initialize the username, password, number of shows watched & the list of shows

    create method trackShow(Show)
        this method will accept the name of a show. Check if the show is already tracked and if it is not add it to the list of shows

    create a method filter(String)
        return all the shows that are available in the defined language
            ex: filter("english") -> returns all the shows that have English available

    overload the method to accept a boolean argument filter(boolean)
        if the boolean is true return the list of shows that are complete
        if the boolean is false return the list of shows that are ongoing
            ex: filter(true) -> return all the shows that are complete

    create a toString
     */
    String userName, passWord;
    int numberOfShowWatched;
    ArrayList<Show> trackedShows;

    public ShowTracker(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
        trackedShows = new ArrayList<>();
    }

    public ShowTracker(String userName, String passWord, int numberOfShowWatched) {
        this(userName, passWord);
        this.numberOfShowWatched = numberOfShowWatched;
    }

    public ShowTracker(String userName, String passWord, int numberOfShowWatched, ArrayList<Show> trackedShows) {
        this(userName, passWord, numberOfShowWatched);
        this.trackedShows.addAll(trackedShows);
    }

    /*
    create method trackShow(Show)
        this method will accept the name of a show. Check if the show is already tracked and if it is not add it to the list of shows
     */
    public void trackShow(Show show){

        for(Show each: trackedShows){
            if (each.name.equalsIgnoreCase(show.name)){
                return;
            }
        }
        trackedShows.add(show);
    }

    /*
     create a method filter(String)
        return all the shows that are available in the defined language
            ex: filter("english") -> returns all the shows that have English available
     */
    public ArrayList<Show> filter(String language){

        ArrayList<Show> filted = new ArrayList<>(trackedShows);
        filted.removeIf(p->!(p.audioLanguages.contains(language)));
        return filted;
    }



}
