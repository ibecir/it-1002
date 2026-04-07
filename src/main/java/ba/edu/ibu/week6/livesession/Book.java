package ba.edu.ibu.week6.livesession;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String name;
    private String author;
    private List<String> pages;

    public Book(String author, String name, List<String> pages) {
        this.author = author;
        this.name = name;
        this.pages = pages;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public List<String> getPages() {
        return pages;
    }
    public void setPages(List<String> pages) {
        this.pages = pages;
    }

    public String read() {
        String content = "";
        for (String page : this.pages)
            content += page;

        return content;
    }
    public String read(int pageNumber) {
        // Add extra security
        return this.pages.get(pageNumber - 1);
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", name='" + name + '\'' +
                ", pages=" + pages +
                '}';
    }
}

class RunMeV2 {
    static void main(String[] args) {
        List<String> pages = new ArrayList<>();
        pages.add("First page");
        pages.add("Second page");
        pages.add("Third page");
        pages.add("Fourth page");
        pages.add("Fifth page");

        Book tvrdjava = new Book("Mesa Selimovic", "Tvrdjava", pages);
        System.out.println(tvrdjava.read(2));

        System.out.println(tvrdjava);
    }
}
