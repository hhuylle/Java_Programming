package day25_constructor.practiceTasks;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TestMovieObjects {
    /*
    2. create a class called TestMovieObjects
            1. create an object of the movie:
                    title: Java Developer: Zero to Hero
                    country: USA
                    Genre: Adventure, Comedy, Thriller
                    release date: 04/18/2021
                    director: Kuzzat Altay
                    Casts: Ozzy, Ali, Muhtar and 5 more students from your group

        print the full info of the movie
     */

    public static void main(String[] args) {

        DateTimeFormatter df = DateTimeFormatter.ofPattern("MM/dd/y");

        Movie movie1 = new Movie("USA","Zero to Hero", LocalDate.of(2021,04,18),"Kuzzat Altay");

        Movie movie2 = new Movie("UK","Java Developer",LocalDate.of(2016,3,4),"Babak Najafi");

        Movie movie3 = new Movie("UK","Java Developer",LocalDate.of(2016,3,4),"Babak Najafi");

        Movie movie4 = new Movie("UK","Java Developer",LocalDate.of(2016,3,4),"Babak Najafi");

        Movie movie5 = new Movie("UK","Java Developer",LocalDate.of(2016,3,4),"Babak Najafi");

    }
}
