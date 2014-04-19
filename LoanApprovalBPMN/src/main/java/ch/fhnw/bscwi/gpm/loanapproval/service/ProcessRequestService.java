/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.fhnw.bscwi.gpm.loanapproval.service;

import javax.inject.Inject;
import javax.inject.Named;

import org.camunda.bpm.engine.cdi.annotation.ProcessVariable;

import ch.fhnw.bscwi.gpm.loanapproval.service.client.processrequestservice.ProcessRequestServiceService;

@Named
public class ProcessRequestService {

	@Inject
	@ProcessVariable
	public Object customerId;

	@Inject
	@ProcessVariable
	public Object amount;

	public boolean processRequest() {
		ProcessRequestServiceService service = new ProcessRequestServiceService();
		ch.fhnw.bscwi.gpm.loanapproval.service.client.processrequestservice.ProcessRequestService port = service.getProcessRequestServicePort();
		port.processRequest(Long.valueOf((String) customerId),
				Long.valueOf((Integer) amount));
		return true;
	}

}
