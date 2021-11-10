package pro.sky.java.course1.lessonObjectMethods;

import java.util.Objects;

public class Author {
    private final String FirstName;
    private final String LastName;

    public Author(String authorFirstName, String authorLastName) {
        FirstName = authorFirstName;
        LastName = authorLastName;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return FirstName.equals(author.FirstName) && LastName.equals(author.LastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(LastName);
    }

    @Override
    public String toString() {
        return "Author: " + FirstName + " " + LastName;
    }

    public String getAuthorFirstName() {
        return FirstName;
    }

    public String getAuthorLastName() {
        return LastName;
    }

}
