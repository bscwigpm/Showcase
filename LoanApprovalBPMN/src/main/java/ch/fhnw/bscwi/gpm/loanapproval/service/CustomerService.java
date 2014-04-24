package ch.fhnw.bscwi.gpm.loanapproval.service;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;
import javax.xml.ws.WebServiceRef;

import org.camunda.bpm.engine.cdi.BusinessProcess;
import org.camunda.bpm.engine.cdi.annotation.ProcessVariable;

import ch.fhnw.bscwi.gpm.loanapproval.service.client.customerwebservice.CustomerDTO;
import ch.fhnw.bscwi.gpm.loanapproval.service.client.customerwebservice.CustomerWebService;
import ch.fhnw.bscwi.gpm.loanapproval.service.client.customerwebservice.CustomerWebService_Service;


@Named
@Stateless
public class CustomerService {

	@Inject
	@ProcessVariable
	public Object customerId;

	@Inject
	private BusinessProcess businessProcess;
	
	@WebServiceRef(type=CustomerWebService_Service.class)
	private CustomerWebService customerWebService;

	public void loadCustomer() {
        CustomerDTO customerDTO = customerWebService.loadCustomer(Long
				.valueOf((String) customerId));
		if (customerDTO != null) {
			businessProcess.setVariable("customerFirstName", customerDTO.getFirstName());
			businessProcess.setVariable("customerLastName", customerDTO.getLastName());
		}
	}

}
