import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

/**
 * This class implements the {@link HotelManager} interface and provides implementation for its methods.
 * The class extends UnicastRemoteObject to allow the object to be exported as a remote object.
 * @author terza
 */
public class HotelManagerImpl extends UnicastRemoteObject implements HotelManager{

  private static final long serialVersionUID = 1L;
  // A list of rooms in hotel
  private List<Room> rooms;

  /**
   * Constructor that initializes the list of rooms and adds a few rooms in the list.
   * @throws RemoteException
   */
  protected HotelManagerImpl() throws RemoteException {
    super();
    rooms = new ArrayList<>();
    rooms.add(new Room(100, 2, 80));
    rooms.add(new Room(101, 4, 150));
    rooms.add(new Room(102, 1, 40));
  }

  /**
   * Method to find a room based on maximum price and number of beds.
   * @param maxPrice the maximum price for the room.
   * @param numBeds the number of beds required in the room.
   * @return the room that matches the criteria.
   * @throws RemoteException
   */
  public Room findRoom(int maxPrice, int numBeds) throws RemoteException {
    // Validation to check if the maximum price is not less than 0
    if (maxPrice < 0)
      throw new IllegalArgumentException("Maximum price cannot be less than 0");
    // Validation to check if the number of beds is not less than 1
    if (numBeds < 1)
      throw new IllegalArgumentException("Number of beds cannot be less than 1");
    // Loop through the list of rooms and find a room that matches the criteria
    for (Room room : rooms)
      if (room.isAvailable() && room.getNumBeds() == numBeds && room.getPrice() <= maxPrice)
        return room;
    
    return null;
    
  }

  /**
   * Method to reserve a room
   * @param room the room to be reserved.
   * @param guest the guest who is reserving the room.
   * @return true if the room is successfully reserved, false otherwise.
   * @throws RemoteException.
   */
  public boolean reserveRoom(Room room, Guest guest) throws RemoteException {
    // Validation to check if the room is not null
    if (room == null)
      throw new IllegalArgumentException("Room cannot be null");
    // Validation to check if guest is not null
    if (guest == null)
      throw new IllegalArgumentException("Guest cannot be null");
    // Loop through the list of rooms and find the room that needs to be reserved
    for (Room r : rooms) {
      if (r.getRoomNumber() == room.getRoomNumber() && r.isAvailable()) {
        // Set the availability of the room to false to indicate that it is reserved
        r.setAvailable(false);
        return true;
      } 
    }
    // Return false if there is no availabe room
    return false;
  }
  
  
}
