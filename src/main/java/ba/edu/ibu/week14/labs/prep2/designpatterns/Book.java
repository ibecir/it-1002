package ba.edu.ibu.week14.labs.prep2.designpatterns;

public class Book {
    private String title;
    private String author;
    private int publicationYear;
    private boolean isBestseller;

    private Book(Builder builder) {
        this.title = builder.title;
        this.author = builder.author;
        this.publicationYear = builder.publicationYear;
        this.isBestseller = builder.isBestseller;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public boolean getIsBestseller() {
        return isBestseller;
    }

    public static class Builder {
        private String title;
        private String author;
        private int publicationYear;
        private boolean isBestseller;

        public Builder(String title, String author) {
            this.title = title;
            this.author = author;
        }

        public Builder publicationYear(int publicationYear) {
            this.publicationYear = publicationYear;
            return this;
        }

        public Builder isBestseller(boolean isBestseller) {
            this.isBestseller = isBestseller;
            return this;
        }

        public Book build() {
            return new Book(this);
        }
    }
}
