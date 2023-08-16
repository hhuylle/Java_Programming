package WednesdayLiveSession.week14.movieTask;

import java.time.LocalTime;

public final class Movie {

    String title;
    int rating;
    int duration;
    int year;

    public Movie(String title, int rating, int duration, int year) {
        setTitle(title);
        setRating(rating);
        setDuration(duration);
        setYear(year);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", rating=" + rating +
                ", duration=" + duration +
                ", year=" + year +
                '}';
    }
}
/*
Movies [Abstraction, Polymorphism]

    - Create a final class Movie
        create the following instance variables:
            title, rating(out of 5), duration(minutes), year

        create a constructor to initialize all the variables

        encapsulate the class

        create a toString to print the information of the Movie

        create a method to determine which StreamingSite is the best for you.
            parameter: StreamingSite
            return: StreamingSite

            options to check if the site is for you:
                subscription is the cheapest
                or has the most number of movies

        create a List of Cinema in your area. A new movie came out and you want to support it so you buy a ticket for that movie from every Cinema in your area.

        extra: think about other ways you could use polymorphism to interact with these objects and play around with the code
 */
