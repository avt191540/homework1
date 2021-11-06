package pro.sky.java.course1.lessonObjects;

public class Library {
    private final Book[] books;

    public Library(int size) {
        this.books = new Book[size];
    }

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

//        switch (indexFree) {
//            case 0:
//                Author author1 = new Author(authorFirstName, authorLastName);
//                Book book1 = new Book(bookName, author1, publishingYear);
//                books[indexFree] = book1;
//                break;
//
//            case 1:
//                Author author2 = new Author(authorFirstName, authorLastName);
//                Book book2 = new Book(bookName, author2, publishingYear);
//                books[indexFree] = book2;
//                break;
//            case 2:
//                Author author3 = new Author(authorFirstName, authorLastName);
//                Book book3 = new Book(bookName, author3, publishingYear);
//                books[indexFree] = book3;
//                break;
//            case 3:
//                Author author4 = new Author(authorFirstName, authorLastName);
//                Book book4 = new Book(bookName, author4, publishingYear);
//                books[indexFree] = book4;
//                break;
//            case 4:
//                Author author5 = new Author(authorFirstName, authorLastName);
//                Book book5 = new Book(bookName, author5, publishingYear);
//                books[indexFree] = book5;
//                break;
//            case 5:
//                Author author6 = new Author(authorFirstName, authorLastName);
//                Book book6 = new Book(bookName, author6, publishingYear);
//                books[indexFree] = book6;
//                break;
//            case 6:
//                Author author7 = new Author(authorFirstName, authorLastName);
//                Book book7 = new Book(bookName, author7, publishingYear);
//                books[indexFree] = book7;
//                break;
//            default:
//                System.out.println("Что-то пошло не так. Добавление книги не возможно");
//        }
    }

    public void printAllBooksFromLibrary() {
        for (int i = 0; i < this.books.length; i++) {
            if (this.books[i] != null) {
                System.out.println(this.books[i].getAuthor().getAuthorFirstName() + " "
                        + this.books[i].getAuthor().getAuthorLastName() + ": "
                        + this.books[i].getNameBook() + ": " + this.books[i].getPublishingYear());
            }
        }
    }

    public void informationAboutBookByName() {

    }

}
