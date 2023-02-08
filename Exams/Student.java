import java.io.Serializable;

public class Student implements Serializable {
  
	private static final long serialVersionUID = 1L;
	private String indexNumber;
	private String name;
	private String emailString;
	
  public Student(String indexNumber, String name, String emailString) {
    super();
    this.indexNumber = indexNumber;
    this.name = name;
    this.emailString = emailString;
  }

  public String getIndexNumber() {
    return indexNumber;
  }

  public String getName() {
    return name;
  }

  public String getEmailString() {
    return emailString;
  }
  
}
