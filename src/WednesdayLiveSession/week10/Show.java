package WednesdayLiveSession.week10;

import java.util.ArrayList;

public class Show {
    /*
    T3ShowTracker [classes, constructors, ArrayList]

    Create a class Show
        define these instance variables
            name
            number seasons
            boolean completed
                true - finished
                false - ongoing
            audio languages available (String ArrayList)

    create a constructor that will initialize the name and number of seasons, completed
    create a constructor that will initialize the name, number of seasons, completed, & all the available languages

    create a toString
     */
    public String name;
    public int numberOfSeasons;
    public boolean isCompleted;
    public ArrayList<String> audioLanguages;

    public Show(String name, int numberOfSeasons, boolean isCompleted) {
        this.name = name.toUpperCase();
        this.numberOfSeasons = numberOfSeasons;
        this.isCompleted = isCompleted;
        audioLanguages = new ArrayList<>();
    }

    public Show(String name, int numberOfSeasons, boolean isCompleted, ArrayList<String> audioLanguages) {
        this(name, numberOfSeasons, isCompleted);
        this.audioLanguages.addAll(audioLanguages);
    }

    public String toString() {
        return name + " - " + numberOfSeasons + " Seasons - " + (isCompleted? "Completed": "On Going") + " - Available in: " + audioLanguages;
    }
}
