import static org.junit.jupiter.api.Assertions.*;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class CalculatorClientTest {
	
	private CalculatorClient calculatorClient;
	private CalculatorManager calculatorManager;

	@Before
	public void setUp() {
		calculatorClient = new CalculatorClient();
		try {
			this.calculatorManager = (CalculatorManager) Naming.lookup("rmi://localhost:1099/CalculatorManager");
		} catch (RemoteException | NotBoundException | MalformedURLException e) {
			e.printStackTrace();
			fail("Exception occurred while initializing calculatorManager");
		}
	}
	
	
	@Test
	public void testMain() {
		
		String[] args = {};
		
		calculatorClient.main(args);
		
		try {
			assertEquals(10, this.calculatorManager.add(5, 5));
			assertEquals(5, this.calculatorManager.divide(25, 5));
			assertEquals(7, this.calculatorManager.sub(10, 3));
			assertEquals(100, this.calculatorManager.multiply(10, 10));
		} catch (RemoteException e) {
			e.printStackTrace();
			fail("Exception occurred while calling methods on calculatorManager");
		}
		
	}

}
