package ba.edu.ibu.week14.labs.prep1.generics;

import java.util.ArrayList;
import java.util.List;

public class Library<T extends Publication> {
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

    public T getByIsbn(int isbn) {
        for (T item : items) {
            if (item.getIsbn() == isbn) {
                return item;
            }
        }
        return null;
    }
}
