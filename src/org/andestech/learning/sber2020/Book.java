package org.andestech.learning.sber2020;

public class Book {

    private String author;
    private String title;
    private String ISBN;
    private int id;
    private int year;


    public Book( int id, String author, String title, String isbn, int year) {
        setAuthor(author);
        setTitle(title);
        setISBN(isbn);
        setId(id);
        setYear(year);
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", id=" + id +
                ", year=" + year +
                '}';
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
