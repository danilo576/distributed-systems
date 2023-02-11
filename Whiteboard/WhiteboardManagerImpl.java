import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("serial")
public class WhiteboardManagerImpl extends UnicastRemoteObject implements WhiteboardManager {
  
  private List<Shape> shapes = new ArrayList<>();

  protected WhiteboardManagerImpl() throws RemoteException {
    super();
  }

  @Override
  public void addShape(Shape shape) throws RemoteException {
    shapes.add(shape);
  }

  @Override
  public List<Shape> getShapes() throws RemoteException {
    return shapes;
  }

}
