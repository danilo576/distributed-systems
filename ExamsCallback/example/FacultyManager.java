package example;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface FacultyManager extends Remote {
  Exam findExamById(int examId) throws RemoteException;
}
