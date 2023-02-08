import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Interface HotelManager defines the methods that a remote HotelManager object should provide.
 * The methods allow clients to find available rooms and reserve rooms in a hotel.
 * @author terza
 */
public interface HotelManager extends Remote {
  
  /**
   * Finds a room that matches the given maximum price and number of beds.
   * @param maxPrice the maximum proce for the room.
   * @param numBeds the number of beds required in the room.
   * @return the room that matches the criteria, or null if no such room is available.
   * @throws RemoteException if a remote error occurs
   */
  Room findRoom(int maxPrice, int numBeds) throws RemoteException;
  
  /**
   * Reserves the given room for the given guest.
   * @param room the room to be reserved.
   * @param guest the guest who will be staying in the room.
   * @return true if the reservation was successful, false otherwise.
   * @throws RemoteException if a remote error occurs.
   */
  boolean reserveRoom(Room room, Guest guest) throws RemoteException;

}
