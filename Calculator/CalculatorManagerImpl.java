
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Class that represents concrete implementatio of {@link CalculatorManager}.
 * 
 * @author terza
 *
 */
@SuppressWarnings("serial")
public class CalculatorManagerImpl extends UnicastRemoteObject implements CalculatorManager {

  protected CalculatorManagerImpl() throws RemoteException {
    super();
  }

  @Override
  public int add(int a, int b) throws RemoteException {
    return a + b;
  }

  @Override
  public int sub(int a, int b) throws RemoteException {
    return a - b;
  }

  @Override
  public int multiply(int a, int b) throws RemoteException {
    return a * b;
  }

  @Override
  public int divide(int a, int b) throws RemoteException {
    return a / b;
  }

}
