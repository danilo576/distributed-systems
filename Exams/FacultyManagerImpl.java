import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;
import java.util.Map;

public class FacultyManagerImpl extends UnicastRemoteObject implements FacultyManager {

  private static final long serialVersionUID = 1L;
  private Map<String, Exam> examsMap;

  protected FacultyManagerImpl() throws RemoteException {
    super();
    examsMap = new HashMap<>();
    examsMap.put(Constants.RM_EXAM_ID, new ExamImpl(Constants.RM_EXAM_ID, Constants.RM_EXAM_NAME));
    examsMap.put(Constants.DS_EXAM_ID, new ExamImpl(Constants.DS_EXAM_ID, Constants.DS_EXAM_NAME));
  }

  @Override
  public Exam findExam(String examId) throws RemoteException {
    return this.examsMap.get(examId);
  }

}
