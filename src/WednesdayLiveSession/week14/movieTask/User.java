package WednesdayLiveSession.week14.movieTask;

import java.util.ArrayList;
import java.util.Arrays;

public class User {

    public static void main(String[] args) {

        //Create a final class User
        //create a main method and create Movie, Cinema, Netflix, Amazon, & Hulu objects
        ArrayList<Movie> movies = new ArrayList<>(Arrays.asList(
                new Movie("Avengers End Game",5,120,2020),
                new Movie("Guardians of the Galaxy",4,125,2023),
                new Movie("Avatar 2",3,140,2023)
        ));

        Cinema cinema = new Cinema("Essington",13, movies);
        System.out.println(cinema);

        System.out.println();

        Netflix netflixUS = new Netflix("US",15,250);
        Netflix netflixCA = new Netflix("CA",17,126);
        System.out.println(netflixUS);
        System.out.println(netflixCA);

        Amazon amazon = new Amazon(20,100);
        System.out.println(amazon);

        System.out.println();

        //create a List of all the StreamingSites used. Then subscribe to them all.
        //   extra: you can also pause the movie
        ArrayList<StreamingSite> streamingSites = new ArrayList<>(Arrays.asList(
                netflixUS,netflixCA, amazon,
                new Netflix("JP",25,300),
                new Amazon(10,50),
                new Hulu(15,100)
        ));

        for (StreamingSite each : streamingSites) {
            each.subscribe();
        }

        for (StreamingSite each : streamingSites) {
            each.pause();
        }

        System.out.println();

        //create a List of PlayMovie and add multiple different Cinema and StreamingSite objects. Then play your favorite movie on all of the options
        ArrayList<PlayMovie> allMovies = new ArrayList<>(Arrays.asList(
                cinema, netflixCA, netflixUS, amazon,
                new Netflix("UK",13,150)
        ));

        for (PlayMovie each : allMovies) {
            each.playMovie(new Movie("John Wick 4",5,169,2023));
        }

        for (PlayMovie each : allMovies) {
            if (each instanceof StreamingSite){
                ((StreamingSite) each).pause();
            }
        }

        System.out.println("==================================================");



    }
}
