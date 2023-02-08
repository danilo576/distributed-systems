import java.io.Serializable;

/**
 * Room class to represent a hotel room
 * @author terza
 */
public class Room implements Serializable {

  private static final long serialVersionUID = 1L;
  private int roomNumber;
  private int numBeds;
  private int price;
  private boolean isAvailable;
  
  /**
   * Constructor to create a Room object
   * @param roomNumber int - room number
   * @param numBeds int - number of beds in the room
   * @param price int - price of the room
   */
  public Room(int roomNumber, int numBeds, int price) {
    this.roomNumber = roomNumber;
    this.numBeds = numBeds;
    this.price = price;
    this.isAvailable = true;
  }

  public int getRoomNumber() {
    return roomNumber;
  }

  public void setRoomNumber(int roomNumber) {
    this.roomNumber = roomNumber;
  }

  public int getNumBeds() {
    return numBeds;
  }

  public void setNumBeds(int numBeds) {
    this.numBeds = numBeds;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public boolean isAvailable() {
    return isAvailable;
  }

  public void setAvailable(boolean isAvailable) {
    this.isAvailable = isAvailable;
  }
}
