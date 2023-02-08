import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

/**
 * Main class that runs the hotel server.
 * The server registers the HotelManager remote object and starts listening for incoming requests.
 * @author terza
 */
public class HotelServer {
  public static void main(String[] args) {
    try {
      // Create and register a new HotelManager remote object
      HotelManager hotelManager = new HotelManagerImpl();
      LocateRegistry.createRegistry(1099);
      Naming.rebind("rmi://localhost:1099/HotelManager", hotelManager);
      System.out.println("HotelServer is running.");
    } catch (RemoteException remoteException) {
      System.out.println("Error while creating remote object : " + remoteException);
    } catch (Exception exception) {
      System.out.println("Error while starting HotelServer: " + exception);
    }
  }
}
