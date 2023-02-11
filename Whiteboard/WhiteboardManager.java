import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface WhiteboardManager extends Remote {

  void addShape(Shape shape) throws RemoteException;

  List<Shape> getShapes() throws RemoteException;

}
