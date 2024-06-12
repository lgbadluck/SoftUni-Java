package IteratorsAndComparatorsLabs._03_ComparableBook;

import java.util.Arrays;
import java.util.List;

public class Book implements Comparable<Book> {
    private String title;
    private int year;
    private List<String> authors;

    public Book(String title, int year, String... authors) {
        setTitle(title);
        setYear(year);
        setAuthors(authors); //Arrays.stream(authors).toList();
    }

    private void setTitle(String title) {
        this.title = title;
    }

    private void setYear(int year) {
        this.year = year;
    }
    private void setAuthors(String... authors) {
        this.authors = Arrays.asList(authors);
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public List<String> getAuthors() {
        return authors;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", year=" + year +
                ", authors=" + authors +
                '}';
    }

    @Override
    public int compareTo(Book compareWith) {
        int result = title.compareTo(compareWith.title);
        return result != 0
                ?result : Integer.compare(year, compareWith.year);
    }
}
