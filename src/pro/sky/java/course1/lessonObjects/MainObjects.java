package pro.sky.java.course1.lessonObjects;

public class MainObjects {

    public static void main(String[] args) {

        System.out.println();
        System.out.println("Задание Минимального уровня");

        Author author1 = new Author("Peter", "Carey");
        Author author2 = new Author("Don", "DeLillo");
        Book book1 = new Book("True History of the Kelly Gang", author1, 2000);
        Book book2 = new Book("Underworld", author2, 1997);
        System.out.print("Книга-1 - Название: " + book1.getNameBook() + " * ");
        System.out.print("Автор: " + book1.getAuthor().getAuthorFirstName() + " " + book1.getAuthor().getAuthorLastName() + " * ");
        System.out.print("Год публикации: " + book1.getPublishingYear() + " * ");
        book1.setPublishingYear(2020);
        System.out.println("Последний год публикации: " + book1.getPublishingYear());
        System.out.print("Книга-2 - Название: " + book2.getNameBook() + " *  ");
        System.out.print("Автор: " + book2.getAuthor().getAuthorFirstName() + " " + book2.getAuthor().getAuthorLastName() + " * ");
        System.out.println("Год публикации: " + book2.getPublishingYear());
        System.out.println();

        System.out.println("Задание Среднего уровня");

        Book[] books = new Book[7];
        books[0] = book1;
        books[1] = book2;
        addNewBookToArray(books, "John", "McGahern", "Amongst women", 1990);
        printAllBooksFromArray(books);
    }

    public static void addNewBookToArray(Book[] books, String authorFirstName, String authorLastName, String bookName, int publishingYear) {
        int indexFree = -1;
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                indexFree = i;
                break;
            }
        }
        if (indexFree == -1) {
            System.out.println("Массив books заполнен полностью. Добавление книги не возможно.");
            return;
        }
        switch (indexFree) {
            case 0:
                Author author1 = new Author(authorFirstName, authorLastName);
                Book book1 = new Book(bookName, author1, publishingYear);
                books[indexFree] = book1;
                break;

            case 1:
                Author author2 = new Author(authorFirstName, authorLastName);
                Book book2 = new Book(bookName, author2, publishingYear);
                books[indexFree] = book2;
                break;
            case 2:
                Author author3 = new Author(authorFirstName, authorLastName);
                Book book3 = new Book(bookName, author3, publishingYear);
                books[indexFree] = book3;
                break;
            case 3:
                Author author4 = new Author(authorFirstName, authorLastName);
                Book book4 = new Book(bookName, author4, publishingYear);
                books[indexFree] = book4;
                break;
            case 4:
                Author author5 = new Author(authorFirstName, authorLastName);
                Book book5 = new Book(bookName, author5, publishingYear);
                books[indexFree] = book5;
                break;
            case 5:
                Author author6 = new Author(authorFirstName, authorLastName);
                Book book6 = new Book(bookName, author6, publishingYear);
                books[indexFree] = book6;
                break;
            case 6:
                Author author7 = new Author(authorFirstName, authorLastName);
                Book book7 = new Book(bookName, author7, publishingYear);
                books[indexFree] = book7;
                break;
            default:
                System.out.println("Что-то пошло не так. Добавление книги не возможно");
        }
    }

    public static void printAllBooksFromArray(Book[] books) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                System.out.println(books[i].getAuthor().getAuthorFirstName() + " "
                        + books[i].getAuthor().getAuthorLastName() + ": "
                        + books[i].getNameBook() + ": " + books[i].getPublishingYear());
            }
        }
    }

}