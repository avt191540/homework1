package pro.sky.java.course1.lessonObjectMethods;

import java.util.Objects;

public class Author {
    private final String firstName;
    private final String lastName;

    public Author(String authorFirstName, String authorLastName) {
        firstName = authorFirstName;
        lastName = authorLastName;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return firstName.equals(author.firstName) && lastName.equals(author.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastName);
    }

    @Override
    public String toString() {
        return "Author: " + firstName + " " + lastName;
    }

    public String getAuthorFirstName() {
        return firstName;
    }

    public String getAuthorLastName() {
        return lastName;
    }

}
