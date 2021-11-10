package pro.sky.java.course1.lessonObjects;

public class Author {
    private final String firstName;
    private final String lastName;

    public Author(String authorFirstName, String authorLastName) {
        firstName = authorFirstName;
        lastName = authorLastName;

    }

    public String getAuthorFirstName() {
        return firstName;
    }

    public String getAuthorLastName() {
        return lastName;
    }


}
