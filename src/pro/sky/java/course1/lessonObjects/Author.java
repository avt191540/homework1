package pro.sky.java.course1.lessonObjects;

public class Author {
    private final String FirstName;
    private final String LastName;

    public Author(String authorFirstName, String authorLastName) {
        FirstName = authorFirstName;
        LastName = authorLastName;

    }

    public String getAuthorFirstName() {
        return FirstName;
    }

    public String getAuthorLastName() {
        return LastName;
    }


}
