package TodaysTask;

public abstract class LibraryItem {

    protected String title;
    protected int itemId;

    public LibraryItem (String title, int itemId) {
        this.title = title;
        this.itemId = itemId;
    }

    public String toString () {
        return String.format("%d: %s\n",itemId, title);
    }


}
