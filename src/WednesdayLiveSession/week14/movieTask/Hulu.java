package WednesdayLiveSession.week14.movieTask;

public final class Hulu extends StreamingSite{

    public Hulu(int subscribersAmount, int availableMovies) {
        super("www.hulu.com", subscribersAmount, availableMovies);
    }

    @Override
    public void subscribe() {
        System.out.println("Subscribe for " + subscribersAmount);
    }

    @Override
    public void playMovie(Movie movie) {
        System.out.println("Starting " + movie.getTitle());
    }

    @Override
    public void pause() {
        System.out.println("PAUSED");
    }
}
/*
Create a final class Hulu
        inherit the StreamingSite class and implement all the methods
 */
