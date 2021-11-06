package pro.sky.java.course1.lessonObjects;

public class Author {
    private final String authorFirstName;
    private final String authorLastName;

    public Author(String authorFirstName, String authorLastName) {
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;

    }

    public String getAuthorFirstName() {
        return authorFirstName;
    }

    public String getAuthorLastName() {
        return authorLastName;
    }


}
