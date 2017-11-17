package de.unistgt.ipvs.vs.ex1.calcRMIserver;

import de.unistgt.ipvs.vs.ex1.calcRMIclient.CalcRmiClient;

public class main {

	public static void main(String[] args) {
		Thread serverThread = new CalcRmiServer("localhost", "Hello");
		serverThread.start();
		
		CalcRmiClient client = new CalcRmiClient();
		

	}

}
