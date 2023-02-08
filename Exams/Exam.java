import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Exam extends Remote {
  
  String getExamId() throws RemoteException;
  
  String getExameName() throws RemoteException;
  
  void register(Student student) throws RemoteException;
  
  int getRegisteredStudentCount() throws RemoteException;

}
