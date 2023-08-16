package Sunday_Review.week10.booksTask;

public class EBook extends Books{
    /*
    - Create a class EBook, a sub class of Book
		define more instance variables:
			- size (double) (mb)
			- on kindle (boolean)

		create a open method
     */
    private double size;
    private boolean onKindle;

    public EBook(String title, String author, String genre, int chapters, int numberOfPages, boolean hasAMovie, double size, boolean onKindle) {
        super(title, author, genre, chapters, numberOfPages, hasAMovie);
        setSize(size);
        setOnKindle(onKindle);
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public boolean isOnKindle() {
        return onKindle;
    }

    public void setOnKindle(boolean onKindle) {
        this.onKindle = onKindle;
    }

    @Override
    public void read() {
        System.out.println("Reading "+getTitle()+" of "+getAuthor()+" in "+getChapters());
    }
}
