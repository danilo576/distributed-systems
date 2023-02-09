import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class FacultyManagerClient {
  public static void main(String[] args) {
    try {
      Registry registry = LocateRegistry.getRegistry();
      FacultyManager facultyManager = (FacultyManager) registry.lookup("FacultyManager");
      
      String indexNumber = InputHelper.getStringInput("Enter index number: ");
      String name = InputHelper.getStringInput("Enter first and last name: ");
      String email = InputHelper.getStringInput("Enter email: ");
      String emaxId = InputHelper.getStringInput("Enter exam id: ");
      
      Student student = new Student(indexNumber, name, email);
      Exam exam = facultyManager.findExam(emaxId);
      
      if (exam != null) {
        exam.register(student);
        System.out.println(exam.getRegisteredStudentCount());
      }
      
    } catch (RemoteException remoteException) {
      System.out.println("Error connecting to the server: " + remoteException.getMessage());
     } catch (Exception exception) {
       System.out.println("Remote object is not registered: " + exception.getMessage());
     }
  }
}
