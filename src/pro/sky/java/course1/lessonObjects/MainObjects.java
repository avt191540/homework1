package pro.sky.java.course1.lessonObjects;

public class MainObjects {

    public static void main(String[] args) {

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


    }
}
