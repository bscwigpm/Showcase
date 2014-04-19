package ch.fhnw.bscwi.gpm.loanapproval.service.client.processrequestservice.clientsample;

import ch.fhnw.bscwi.gpm.loanapproval.service.client.processrequestservice.*;

public class ClientSample {

	public static void main(String[] args) {
	        System.out.println("***********************");
	        System.out.println("Create Web Service Client...");
	        ProcessRequestServiceService service1 = new ProcessRequestServiceService();
	        System.out.println("Create Web Service...");
	        ProcessRequestService port1 = service1.getProcessRequestServicePort();
	        System.out.println("Call Web Service Operation...");
	        System.out.println("Server said: " + port1.processRequest(null,null));
	        //Please input the parameters instead of 'null' for the upper method!
	
	        System.out.println("Create Web Service...");
	        ProcessRequestService port2 = service1.getProcessRequestServicePort();
	        System.out.println("Call Web Service Operation...");
	        System.out.println("Server said: " + port2.processRequest(null,null));
	        //Please input the parameters instead of 'null' for the upper method!
	
	        System.out.println("***********************");
	        System.out.println("Call Over!");
	}
}
