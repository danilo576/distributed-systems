package example;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("serial")
public class Exam implements Serializable {

  private int examId;
  private String examName;
  private Map<Integer, Student> registeredStudents;
  
  public Exam(int examId, String examName) {
    super();
    this.examId = examId;
    this.examName = examName;
    this.registeredStudents = new HashMap<>();
  }

  public String getExamName() {
    return examName;
  }
  
  public int getCurrentStudentsCount() {
    return registeredStudents.size();
  }
  
  public void registerStudent(Student student) {
    this.registeredStudents.put(student.getIndexNumber(), student);
    System.out.println("Student: " + student.getName() + "with the index number: " + student.getIndexNumber() + " successfully registered: " + getExamName());
  }
  
}
