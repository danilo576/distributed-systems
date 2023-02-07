import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Interface that represents basic arithmetic calculation.
 * 
 * @author terza
 *
 */
public interface CalculatorManager extends Remote {

  int add(int a, int b) throws RemoteException;

  int sub(int a, int b) throws RemoteException;

  int multiply(int a, int b) throws RemoteException;

  int divide(int ab, int b) throws RemoteException;
}
