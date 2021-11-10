package pro.sky.java.course1.lessonObjectMethods;

import java.util.Arrays;

public class Library {
    private final Book[] books;

    public Library(int size) {
        this.books = new Book[size];
    }

    @Override
    public String toString() {
        System.out.println("Library:");
        int i = 0;
        for (; i < books.length; i++) {
            if (books[i] == null && i == 0) {
                return "Library is empty";
            } else if (i == books.length - 1) {
                break;
            } else if (books[i + 1] == null) {
                break;
            }
            System.out.println(books[i]);
        }
        return books[i].toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Arrays.equals(books, library.books);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(books);
    }

    //Добавление книги в Library
    public void addBook(Book bookNew) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = bookNew;
                return;
            }
        }
        System.out.println("Массив Библиотеки заполнен полностью. Добавление книги не возможно.");
    }
}
