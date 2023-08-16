package Sunday_Review.week10.booksTask;

public class AudioBook extends Books{
    /*
    - Create a class AudioBook, a sub class of Book
		define more instance variables:
			- narrator (String)
			- duration (double)

		create a listen method
     */
    private String narrator;
    private double duration;

    public AudioBook(String title, String author, String genre, int chapters, int numberOfPages, boolean hasAMovie, String narrator, double duration) {
        super(title, author, genre, chapters, numberOfPages, hasAMovie);
        setNarrator(narrator);
        setDuration(duration);
    }

    public String getNarrator() {
        return narrator;
    }

    public void setNarrator(String narrator) {
        this.narrator = narrator;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    @Override
    public void read() {
        System.out.println("Reading "+getTitle()+" of "+getAuthor()+" in "+getChapters()+" with "+getNarrator()+" in "+getDuration());
    }
}
