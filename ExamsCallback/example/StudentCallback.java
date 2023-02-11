package example;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface StudentCallback extends Remote {
  void notify(String message) throws RemoteException;
}
