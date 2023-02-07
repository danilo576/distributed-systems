import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class CalculatorServer {

  public static void main(String[] args) {

    try {
      LocateRegistry.createRegistry(1099);
      CalculatorManager calculatorManager = new CalculatorManagerImpl();
      Naming.rebind("rmi://localhost:1099/CalculatorManager", calculatorManager);
      System.out.println("CalculatorServer is ready");
    } catch (Exception e) {
      System.out.println("CalculatorServer failed" + e.getMessage());
    }
  }
}
