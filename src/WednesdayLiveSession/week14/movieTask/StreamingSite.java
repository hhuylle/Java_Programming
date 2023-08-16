package WednesdayLiveSession.week14.movieTask;

public abstract class StreamingSite implements PlayMovie, HasSubcription{

    String url;
    int subscribersAmount;
    int availableMovies;

    public StreamingSite(String url, int subscribersAmount, int availableMovies) {
        this.url = url;
        this.subscribersAmount = subscribersAmount;
        this.availableMovies = availableMovies;
    }

    public abstract void pause();

    @Override
    public String toString() {
        return "StreamingSite{" +
                "url='" + url + '\'' +
                ", subscribersAmount=" + subscribersAmount +
                ", availableMovies=" + availableMovies +
                '}';
    }
}
/*
Create an abstract class StreamingSite
        implement the PlayMovie & HasSubcription interfaces - don't need to implement the methods

        create the following instance variables:
            url, subscription amount, movies available(int)

        create a constructor to initialize all the variables

        create an abstract method:
            pause()
 */
