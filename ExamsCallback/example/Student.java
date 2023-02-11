package example;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Student implements Serializable {

  private int indexNumber;
  private String name;
  private String email;
  
  public Student(int indexNumber, String name, String email) {
    super();
    this.indexNumber = indexNumber;
    this.name = name;
    this.email = email;
  }

  public int getIndexNumber() {
    return indexNumber;
  }

  public String getName() {
    return name;
  }

  public String getEmail() {
    return email;
  }

  @Override
  public String toString() {
    return "Student [indexNumber=" + indexNumber + ", name=" + name + ", email=" + email + "]";
  }
}
