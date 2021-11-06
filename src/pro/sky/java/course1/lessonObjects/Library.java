package pro.sky.java.course1.lessonObjects;

public class Library {
    private final Book[] books;

    public Library(int size) {
        this.books = new Book[size];
    }

//Добавление книги в Library
public void addNewBookToLibrary(Book[] books, int indexBook) {
    int indexFree = -1;
    for (int i = 0; i < this.books.length; i++) {
        if (this.books[i] == null) {
            this.books[i] = books[indexBook];
            indexFree = i;
            break;
        }
    }
    if (indexFree == -1) {
        System.out.println("Массив Библиотеки заполнен полностью. Добавление книги не возможно.");
    }
}

    // Печать информации о всех книгах в библиотеке
    public void printAllBooksFromLibrary() {
        for (int i = 0; i < this.books.length; i++) {
            if (this.books[i] != null) {
                System.out.println(this.books[i].getAuthor().getAuthorFirstName() + " "
                        + this.books[i].getAuthor().getAuthorLastName() + ": "
                        + this.books[i].getNameBook() + ": " + this.books[i].getPublishingYear());
            }
        }
    }

    //Поиск и печать информации о книге по ее названию
    public void printAboutBookByName(String nameBook) {
        for (int i = 0; i < books.length; i++) {
            if (this.books[i].getNameBook().equals(nameBook)) {
                System.out.println(this.books[i].getNameBook() + " by "
                        + this.books[i].getAuthor().getAuthorFirstName() + " "
                        + this.books[i].getAuthor().getAuthorLastName() + " was published in "
                        + this.books[i].getPublishingYear());
                return;
            }
        }
    }

    // Поиск книги по ее названию и изменение года ее публикации
    public void changeYearPublishingBookByName(String nameBook, int publishingYearNew) {
        for (int i = 0; i < books.length; i++) {
            if (this.books[i].getNameBook().equals(nameBook)) {
                System.out.print("В книге * " + this.books[i].getNameBook() +
                        " * меняем старый год публикации " + this.books[i].getPublishingYear() +
                        " на новый ");
                this.books[i].setPublishingYear(publishingYearNew);
                System.out.println(this.books[i].getPublishingYear());
                return;
            }
        }
    }

}
