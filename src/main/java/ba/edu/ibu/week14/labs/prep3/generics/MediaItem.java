package ba.edu.ibu.week14.labs.prep3.generics;

public class MediaItem {
    private int mediaId;
    private String title;

    public MediaItem(int mediaId, String title) {
        this.mediaId = mediaId;
        this.title = title;
    }

    public int getMediaId() {
        return mediaId;
    }

    public String getTitle() {
        return title;
    }
}
