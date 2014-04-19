package ch.fhnw.bscwi.gpm.loanapproval.service.client.customerwebservice.clientsample;

import ch.fhnw.bscwi.gpm.loanapproval.service.client.customerwebservice.*;

public class ClientSample {

	public static void main(String[] args) {
	        System.out.println("***********************");
	        System.out.println("Create Web Service Client...");
	        CustomerWebService_Service service1 = new CustomerWebService_Service();
	        System.out.println("Create Web Service...");
	        CustomerWebService port1 = service1.getCustomerWebServicePort();
	        System.out.println("Call Web Service Operation...");
	        System.out.println("Server said: " + port1.loadCustomer(null));
	        //Please input the parameters instead of 'null' for the upper method!
	
	        System.out.println("Create Web Service...");
	        CustomerWebService port2 = service1.getCustomerWebServicePort();
	        System.out.println("Call Web Service Operation...");
	        System.out.println("Server said: " + port2.loadCustomer(null));
	        //Please input the parameters instead of 'null' for the upper method!
	
	        System.out.println("***********************");
	        System.out.println("Call Over!");
	}
}
