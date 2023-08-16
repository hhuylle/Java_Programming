package Sunday_Review.week10.booksTask;

public class Books {
    /*
    Books [Inheritance]

	Create a class Book

	instance variables:
		- title (String)
		- author (String)
		- genre (String)
		- chapters (int)
		- number of pages (int)
		- has a movie (boolean)

		create a read method
     */
    private String title, author, genre;
    private int chapters, numberOfPages;
    private boolean hasAMovie;

    public Books(String title, String author, String genre, int chapters, int numberOfPages, boolean hasAMovie) {
        setTitle(title);
        setAuthor(author);
        setGenre(genre);
        setChapters(chapters);
        setNumberOfPages(numberOfPages);
        setHasAMovie(hasAMovie);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getChapters() {
        return chapters;
    }

    public void setChapters(int chapters) {
        this.chapters = chapters;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public boolean isHasAMovie() {
        return hasAMovie;
    }

    public void setHasAMovie(boolean hasAMovie) {
        this.hasAMovie = hasAMovie;
    }

    public void read(){
        System.out.println("Reading "+getTitle()+" of "+getAuthor()+" in "+getChapters());
    }

    public String toString() {
        return "Books{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                ", chapters=" + chapters +
                ", numberOfPages=" + numberOfPages +
                ", hasAMovie=" + hasAMovie +
                '}';
    }
}
