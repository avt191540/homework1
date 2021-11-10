package pro.sky.java.course1.lessonObjectMethods;

public class MainObjectMethods {
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
        System.out.println("Измененный год публикации: " + book1.getPublishingYear());
        System.out.print("Книга-2 - Название: " + book2.getNameBook() + " *  ");
        System.out.print("Автор: " + book2.getAuthor().getAuthorFirstName() + " " + book2.getAuthor().getAuthorLastName() + " * ");
        System.out.println("Год публикации: " + book2.getPublishingYear());
        System.out.println();

        System.out.println("Задание Среднего уровня");

        Book[] books = new Book[7];
        books[0] = book1;
        books[1] = book2;
        Author author3 = new Author("John", "McGahern");
        Book book3 = new Book("Amongst women", author3, 1990);
        books[2] = book3;
        System.out.println(author1);
        System.out.println(book1);

//        System.out.println("Задание Сложного уровня");
//
//        //Создаем новый объект library1
//        Library library1 = new Library(8);
//        // Заполняем объект library1 книгами
//        library1.addNewBookToLibrary(book1);
//        library1.addNewBookToLibrary(book2);
//        library1.addNewBookToLibrary(book3);
//        // Печатаем содержимое объекта library1
//        library1.printAllBooksFromLibrary();
//        // Печатаем информацию о книге, которую находим по ее названию
//        library1.printAboutBookByName("Underworld");
//        // Находим книгу по ее названию меняем ее год пуюликации
//        library1.changeYearPublishingBookByName("Amongst women", 2019);

    }
}
