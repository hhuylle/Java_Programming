package WednesdayLiveSession.week14.movieTask;

public final class Amazon extends StreamingSite{

    public Amazon(int subscribersAmount, int availableMovies) {
        super("www.amazon.com", subscribersAmount, availableMovies);
    }

    @Override
    public void subscribe() {
        System.out.println("Subscription to amazon prime");
    }

    @Override
    public void playMovie(Movie movie) {
        System.out.println("Playing " + movie.getTitle() + " on amazon prime video");
    }

    @Override
    public void pause() {
        System.out.println("Paused with space");
    }
}
/*
Create a final class Amazon
        inherit the StreamingSite class and implement all the methods
 */
