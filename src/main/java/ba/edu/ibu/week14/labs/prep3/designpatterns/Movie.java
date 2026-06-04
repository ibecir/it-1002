package ba.edu.ibu.week14.labs.prep3.designpatterns;

public class Movie {
    private String title;
    private String director;
    private int releaseYear;
    private boolean hasWonAwards;

    private Movie(Builder builder) {
        this.title = builder.title;
        this.director = builder.director;
        this.releaseYear = builder.releaseYear;
        this.hasWonAwards = builder.hasWonAwards;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public boolean getHasWonAwards() {
        return hasWonAwards;
    }

    public static class Builder {
        private String title;
        private String director;
        private int releaseYear;
        private boolean hasWonAwards;

        public Builder(String title, String director) {
            this.title = title;
            this.director = director;
        }

        public Builder releaseYear(int releaseYear) {
            this.releaseYear = releaseYear;
            return this;
        }

        public Builder hasWonAwards(boolean hasWonAwards) {
            this.hasWonAwards = hasWonAwards;
            return this;
        }

        public Movie build() {
            return new Movie(this);
        }
    }
}
