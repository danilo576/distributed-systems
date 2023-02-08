import java.io.Serializable;

public class Guest implements Serializable {

  private static final long serialVersionUID = 1L;
    private String firstName;
    private String lastName;
    private int id;

    public Guest(String firstName, String lastName, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getId() {
        return id;
    }
}
