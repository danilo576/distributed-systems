import java.rmi.Naming;

public class CalculatorClient {

  public static void main(String[] args) {

    try {

      // Look up the remote object using the registry
      CalculatorManager calculatorManager = (CalculatorManager) Naming.lookup("rmi://localhost:1099/CalculatorManager");
      System.out.println("CalculatorClient is ready");
      // Call the methods of the remote object
      System.out.println("Adding 5 + 5: " + calculatorManager.add(5, 5));
      System.out.println("Dividing 25 by 5: " + calculatorManager.divide(25, 5));
      System.out.println("Subtracting 10 - 3: " + calculatorManager.sub(10, 3));
      System.out.println("Multiplying 10 * 10: " + calculatorManager.multiply(10, 10));

    } catch (Exception e) {
      System.out.println("Client failed to connect to the server");
      e.printStackTrace();
    }
  }
}
