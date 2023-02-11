import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class WhiteboardServer {

  public static void main(String[] args) {

    try {

      WhiteboardManager whiteboardManager = new WhiteboardManagerImpl();
      LocateRegistry.createRegistry(1099);
      Naming.rebind("WhiteboardManager", whiteboardManager);
      System.out.println("Whiteboard server is ready");

    } catch (Exception e) {
      e.printStackTrace();
    }
  }

}
