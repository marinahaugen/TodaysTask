package TodaysTask.Library;

public class Film extends LibraryItem {

    private final String director;
    private final float length;
    private float rating;

    public Film (int id, String title, String director, float length, float rating) {
        super(title, id);
        this.director = director;
        this.length = length;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return String.format("%d: %s - %s - length %.2f - rating %.2f\n", itemId, title, director, length, rating);
    }
}
