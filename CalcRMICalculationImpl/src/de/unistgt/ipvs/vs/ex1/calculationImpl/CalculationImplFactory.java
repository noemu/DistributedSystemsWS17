package de.unistgt.ipvs.vs.ex1.calculationImpl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import de.unistgt.ipvs.vs.ex1.calculation.ICalculation;
import de.unistgt.ipvs.vs.ex1.calculation.ICalculationFactory;

/**
 * Change this class (implementation/signature/...) as necessary to complete the assignment.
 * You may also add some fields or methods.
 */
public class CalculationImplFactory extends UnicastRemoteObject implements ICalculationFactory {

	private static final long serialVersionUID = 1037492631208151024L;

	public CalculationImplFactory() throws RemoteException {
		super();
	}

	public ICalculation getSession() throws RemoteException {
		// TODO Auto-generated method stub
		return new CalculationImpl();
	}
	

}