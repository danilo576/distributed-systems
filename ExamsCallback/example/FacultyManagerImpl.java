package example;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("serial")
public class FacultyManagerImpl extends UnicastRemoteObject implements FacultyManager {
  
  private Map<Integer, Exam> exams;

  protected FacultyManagerImpl() throws RemoteException {
    super();
    exams = new HashMap<>();
    for (int i = 1; i <= 5; i++)
      exams.put(i,new Exam(i, "Exam " + i));
  }

  @Override
  public Exam findExamById(int examId) throws RemoteException {
    return exams.get(examId);
  }

}
