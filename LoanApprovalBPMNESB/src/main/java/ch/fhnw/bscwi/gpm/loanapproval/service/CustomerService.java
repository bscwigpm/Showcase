package ch.fhnw.bscwi.gpm.loanapproval.service;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;
import javax.xml.ws.WebServiceRef;

import org.camunda.bpm.engine.cdi.BusinessProcess;
import org.camunda.bpm.engine.cdi.annotation.ProcessVariable;

import ch.fhnw.bscwi.gpm.loanapproval.service.client.CustomerDTO;
import ch.fhnw.bscwi.gpm.loanapproval.service.client.LoanApprovalESBService;
import ch.fhnw.bscwi.gpm.loanapproval.service.client.LoanApprovalESBService_Service;

@Named
@Stateless
public class CustomerService {

	@Inject
	@ProcessVariable
	public Object customerId;

	@Inject
	private BusinessProcess businessProcess;
	
	@WebServiceRef(type=LoanApprovalESBService_Service.class)
	private LoanApprovalESBService approvalESBService;

	public void loadCustomer() {
        CustomerDTO customerDTO = approvalESBService.loadCustomer(Long
				.valueOf((String) customerId));
		if (customerDTO != null) {
			businessProcess.setVariable("customerFirstName", customerDTO.getFirstName());
			businessProcess.setVariable("customerLastName", customerDTO.getLastName());
		}
	}

}
