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
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null && i == 0) {
                return "Library is empty";
            } else if (books[i] == null) {
                break;
            }
            if (i != 0) {
                s.append("\n");
            }
            s.append(books[i].toString());
        }
        return s.toString();
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
