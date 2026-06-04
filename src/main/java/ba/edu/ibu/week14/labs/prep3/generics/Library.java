package ba.edu.ibu.week14.labs.prep3.generics;

import java.util.ArrayList;
import java.util.List;

public class Library<T extends MediaItem> {
    private List<T> items;

    public Library() {
        items = new ArrayList<>();
    }

    public void add(T item) {
        items.add(item);
    }

    public List<T> filterByTitle(String title) {
        List<T> result = new ArrayList<>();
        for (T item : items) {
            if (item.getTitle().equals(title)) {
                result.add(item);
            }
        }
        return result;
    }

    public T getByMediaId(int mediaId) {
        for (T item : items) {
            if (item.getMediaId() == mediaId) {
                return item;
            }
        }
        return null;
    }
}
