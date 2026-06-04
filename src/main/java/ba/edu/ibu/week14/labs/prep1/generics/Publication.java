package ba.edu.ibu.week14.labs.prep1.generics;

public class Publication {
    private int isbn;
    private String title;

    public Publication(int isbn, String title) {
        this.isbn = isbn;
        this.title = title;
    }

    public int getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }
}
