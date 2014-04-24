/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.fhnw.bscwi.gpm.loanapproval.service;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;
import javax.xml.ws.WebServiceRef;

import org.camunda.bpm.engine.cdi.annotation.ProcessVariable;

import ch.fhnw.bscwi.gpm.loanapproval.service.client.processrequestservice.ProcessRequestServiceService;

@Named
@Stateless
public class ProcessRequestService {

	@Inject
	@ProcessVariable
	public Object customerId;

	@Inject
	@ProcessVariable
	public Object amount;
	
	@WebServiceRef(type=ProcessRequestServiceService.class)
	private ch.fhnw.bscwi.gpm.loanapproval.service.client.processrequestservice.ProcessRequestService processRequestService;

	public boolean processRequest() {
		processRequestService.processRequest(Long.valueOf((String) customerId),
				Long.valueOf((Integer) amount));
		return true;
	}

}
