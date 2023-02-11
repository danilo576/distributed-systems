import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import java.util.List;

public class WhiteboardClient {
  
  public static void main(String[] args) {
    
    try {
      WhiteboardManager whiteboardManager = (WhiteboardManager) Naming.lookup("WhiteboardManager");
      System.out.println("WhiteboardClient successfully connected to WhiteboardServer");
      
      whiteboardManager.addShape(new Shape("Rectangle", "Red", "Yellow", false));
      whiteboardManager.addShape(new Shape("Circle", "Red", "Green", true));
      whiteboardManager.addShape(new Shape("Triangle", "Black", "Pink", true));
      
      List<Shape> shapes = whiteboardManager.getShapes();
      for (Shape shape : shapes) {
        System.out.println(shape);
      }
     
    } catch (NotBoundException | MalformedURLException | RemoteException e) {
      e.printStackTrace();
    }
  }
}
