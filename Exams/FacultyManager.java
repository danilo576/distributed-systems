import java.rmi.Remote;
import java.rmi.RemoteException;

public interface FacultyManager extends Remote {
  
  Exam findExam(String examId) throws RemoteException;

}
