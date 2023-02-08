import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class ExamServer {
  public static void main(String[] args) {
    try {
      FacultyManager facultyManager = new FacultyManagerImpl();
      LocateRegistry.createRegistry(1099);
      Naming.rebind("rmi://localhost:1099/FacultyManager", facultyManager);
      System.out.println("FacultyManager is running.");
    } catch (RemoteException remoteException) {
      System.out.println("Error while creating remote object : " + remoteException);
    } catch (Exception exception) {
      System.out.println("Error while starting FacultyManager server: " + exception);
    }
  }
}
