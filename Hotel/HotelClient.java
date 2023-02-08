import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class HotelClient {
  public static void main(String[] args) {
    try {
      // Finding the RMI registry
      Registry registry = LocateRegistry.getRegistry();
      // Looking up the remote object of tyoe HotelManager
      HotelManager hotelManager = (HotelManager) registry.lookup("HotelManager");
      
      // Invoking the method to find a room
      Room room = hotelManager.findRoom(150, 4);
      if (room == null) {
        System.out.println("Room with the specified conditions was not found.");
        return;
      }
      
      // Invoking the method to reserve a room
      Guest guest = new Guest("Danilo", "Terzic", 1);
      boolean roomReserved = hotelManager.reserveRoom(room, guest);
      if (roomReserved) {
        System.out.println("Room successfully reserved.");
      } else {
        System.out.println("Room reservation failed.");
      }
    } catch (RemoteException remoteException) {
     System.out.println("Error connecting to the server: " + remoteException.getMessage());
    } catch (Exception exception) {
      System.out.println("Remote object is not registered: " + exception.getMessage());
    }
  }
}
