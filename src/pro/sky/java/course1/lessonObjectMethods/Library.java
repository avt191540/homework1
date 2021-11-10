package pro.sky.java.course1.lessonObjectMethods;

public class Library {
    private final Book[] books;

    public Library(int size) {
        this.books = new Book[size];
    }

    //Добавление книги в Library
    public void addNewBookToLibrary(Book bookNew) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = bookNew;
                return;
            }
        }
        System.out.println("Массив Библиотеки заполнен полностью. Добавление книги не возможно.");
    }

    // Печать информации о всех книгах в библиотеке
    public void printAllBooksFromLibrary() {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                System.out.println(books[i].getAuthor().getAuthorFirstName() + " "
                        + books[i].getAuthor().getAuthorLastName() + ": "
                        + books[i].getNameBook() + ": " + books[i].getPublishingYear());
            }
        }
    }

    //Поиск и печать информации о книге по ее названию
    public void printAboutBookByName(String nameBook) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].getNameBook().equals(nameBook)) {
                System.out.println(books[i].getNameBook() + " by "
                        + books[i].getAuthor().getAuthorFirstName() + " "
                        + books[i].getAuthor().getAuthorLastName() + " was published in "
                        + books[i].getPublishingYear());
                return;
            }
        }
    }

    // Поиск книги по ее названию и изменение года ее публикации
    public void changeYearPublishingBookByName(String nameBook, int publishingYearNew) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].getNameBook().equals(nameBook)) {
                books[i].setPublishingYear(publishingYearNew);
                return;
            }
        }
    }

}
