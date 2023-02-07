package calculator;

import static org.junit.jupiter.api.Assertions.*;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import org.junit.jupiter.api.Test;

class CalculatorServerTest {

  @Test
  void testServerBind() throws RemoteException {

    // Create the registry for RMI connections on port 1099
    LocateRegistry.createRegistry(1099);

    // Look up the registry at the given host and port
    Registry registry = LocateRegistry.getRegistry("localhost", 1099);

    // Check if the given CalculatorManager object is bound in the registy
    assertNotNull(registry);

  }

  @Test
  void testPortInUse() {

    try {
      // Try to create the registry for RMI connections on port 1099
      LocateRegistry.createRegistry(1099);

      // If the registry is successfully created, this test will fail.
      fail("Port 1099 is already in use");
    } catch (RemoteException e) {
      // Check if the exception message contains the error "ObjID already in use"
      assertTrue(e.getMessage().contains("already in use"));
    }

  }

  @Test
  void testWrongUrlConnection() throws RemoteException, NotBoundException {

    // Look up the registry at the given host and port
    Registry registry = LocateRegistry.getRegistry("localhost", 1099);

    assertThrows(RemoteException.class, () -> {
      registry.lookup("rmi://localhost:1099/WrongManager");
    });

  }

}
