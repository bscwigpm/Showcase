package ch.fhnw.bscwi.gpm.loanapproval.service.client.clientsample;

import ch.fhnw.bscwi.gpm.loanapproval.service.client.*;

public class ClientSample {

	public static void main(String[] args) {
	        System.out.println("***********************");
	        System.out.println("Create Web Service Client...");
	        LoanApprovalESBService_Service service1 = new LoanApprovalESBService_Service();
	        System.out.println("Create Web Service...");
	        LoanApprovalESBService port1 = service1.getLoanApprovalESBServiceSOAP();
	        System.out.println("Call Web Service Operation...");
	        System.out.println("Server said: " + port1.loadCustomer(null));
	        //Please input the parameters instead of 'null' for the upper method!
	
	        System.out.println("Server said: " + port1.processRequest(null,null));
	        //Please input the parameters instead of 'null' for the upper method!
	
	        System.out.println("Create Web Service...");
	        LoanApprovalESBService port2 = service1.getLoanApprovalESBServiceSOAP();
	        System.out.println("Call Web Service Operation...");
	        System.out.println("Server said: " + port2.loadCustomer(null));
	        //Please input the parameters instead of 'null' for the upper method!
	
	        System.out.println("Server said: " + port2.processRequest(null,null));
	        //Please input the parameters instead of 'null' for the upper method!
	
	        System.out.println("***********************");
	        System.out.println("Call Over!");
	}
}
