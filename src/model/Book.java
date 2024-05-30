package model;

public class Book {

    private int id;
    private String title;
    private String author;
    private int year;
    private String genre;

    public Book(int id, String title, String author, int year, String genre) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.year = year;
        this.genre = genre;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public String getGenre() {
        return genre;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return  id + " : " + title + " : " + author + " : " + year + " : " + genre;
    }
}
