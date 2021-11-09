package pro.sky.java.course1.lessonObjectMethods;

public class Author {
    private final String FirstName;
    private final String LastName;

    public Author(String authorFirstName, String authorLastName) {
        FirstName = authorFirstName;
        LastName = authorLastName;

    }

    @Override
    public String toString() {
        return "Author{" +
                "FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                '}';
    }

    public String getAuthorFirstName() {
        return FirstName;
    }

    public String getAuthorLastName() {
        return LastName;
    }

}
