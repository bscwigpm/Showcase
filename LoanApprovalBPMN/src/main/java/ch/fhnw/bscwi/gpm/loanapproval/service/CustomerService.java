package ch.fhnw.bscwi.gpm.loanapproval.service;

import javax.inject.Inject;
import javax.inject.Named;

import org.camunda.bpm.engine.cdi.BusinessProcess;
import org.camunda.bpm.engine.cdi.annotation.ProcessVariable;

import ch.fhnw.bscwi.gpm.loanapproval.service.client.customerwebservice.CustomerDTO;
import ch.fhnw.bscwi.gpm.loanapproval.service.client.customerwebservice.CustomerWebService;
import ch.fhnw.bscwi.gpm.loanapproval.service.client.customerwebservice.CustomerWebService_Service;


@Named
public class CustomerService {

	@Inject
	@ProcessVariable
	public Object customerId;

	@Inject
	private BusinessProcess businessProcess;

	public void loadCustomer() {
		CustomerWebService_Service service = new CustomerWebService_Service();
        CustomerWebService port = service.getCustomerWebServicePort();
        CustomerDTO customerDTO = port.loadCustomer(Long
				.valueOf((String) customerId));
		if (customerDTO != null) {
			businessProcess.setVariable("customerFirstName", customerDTO.getFirstName());
			businessProcess.setVariable("customerLastName", customerDTO.getLastName());
		}
	}

}
