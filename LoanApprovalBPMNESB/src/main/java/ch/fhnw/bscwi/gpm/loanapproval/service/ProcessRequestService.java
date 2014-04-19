/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.fhnw.bscwi.gpm.loanapproval.service;

import javax.inject.Inject;
import javax.inject.Named;

import org.camunda.bpm.engine.cdi.annotation.ProcessVariable;

@Named
public class ProcessRequestService {

	@Inject
	@ProcessVariable
	public Object customerId;

	@Inject
	@ProcessVariable
	public Object amount;

	public boolean processRequest() {
		/*LoanApprovalESBService_Service service = new LoanApprovalESBService_Service();
        LoanApprovalESBService port = service.getLoanApprovalESBServiceSOAP();
		port.processRequest(Long.valueOf((String) customerId),
				Long.valueOf((Integer) amount));*/
		return true;
	}

}
