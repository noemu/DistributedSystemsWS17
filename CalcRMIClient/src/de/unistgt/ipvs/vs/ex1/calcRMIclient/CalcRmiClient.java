package de.unistgt.ipvs.vs.ex1.calcRMIclient;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Collection;

import de.unistgt.ipvs.vs.ex1.calculation.ICalculation;
import de.unistgt.ipvs.vs.ex1.calculation.ICalculationFactory;

/**
 * Implement the getCalcRes-, init-, and calculate-method of this class as
 * necessary to complete the assignment. You may also add some fields or methods.
 */
public class CalcRmiClient {
	private ICalculation calc = null;

	public CalcRmiClient() {
		
		 try {
	            //Registry registry = LocateRegistry.getRegistry("localhost", 4321);
			 
			 Registry reg=LocateRegistry.getRegistry("127.0.0.1",4321);
			 
	            ICalculationFactory comp = (ICalculationFactory) reg.lookup("echo");
	            
	            ICalculation calculator = comp.getSession();
	            calculator.add(5);
	            calculator.add(5);
	            
	            System.out.println(calculator.getResult());
	        } catch (Exception e) {
	            System.err.println("ComputePi exception:");
	            e.printStackTrace();
	        }
		
		this.calc = null;
	}

	public int getCalcRes() {
		// TODO		
		return 0;
	}

	public boolean init(String url) {
		// TODO
		return false;
	}

	public boolean calculate(CalculationMode calcMode, Collection<Integer> numbers) {
		// TODO
		return false;
	}
}
