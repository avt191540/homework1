package pro.sky.java.course1.lessonObjectMethods;

public class Book {
    private final String nameBook;
    private final Author author;
    private int publishingYear;

    public Book(String nameBook, Author author, int publishingYear) {
        this.nameBook = nameBook;
        this.publishingYear = publishingYear;
        this.author = author;
    }

    public String getNameBook() {
        return nameBook;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    public Author getAuthor() {
        return author;
    }
}
