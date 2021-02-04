package TodaysTask;

public class Book extends LibraryItem {

    private String author;
    private String genre;

    public Book (String title, int id, String author, String genre) {
        super(title, id);
        this.author = author;
        this.genre = genre;
    }

    public String toString () {
        return String.format("%d: %s - %s - %s\n", itemId, title, author, genre);
    }

}
