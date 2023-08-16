package WednesdayLiveSession.week14.movieTask;

public final class Netflix extends StreamingSite{


    public Netflix(String region, int subscribersAmount, int availableMovies) {
        super("www.netflix.com/"+region, subscribersAmount, availableMovies);
    }

    @Override
    public void subscribe() {
        System.out.println("Subscribe for " + subscribersAmount);
    }

    @Override
    public void playMovie(Movie movie) {
        System.out.println("Starting " + movie.getTitle()+" on "+url);
    }

    @Override
    public void pause() {
        System.out.println("PAUSED " + url);
    }

}
/*
Create a final class Netflix
        inherit the StreamingSite class and implement all the methods
 */
