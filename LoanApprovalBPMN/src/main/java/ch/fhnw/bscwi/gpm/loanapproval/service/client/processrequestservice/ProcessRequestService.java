package ch.fhnw.bscwi.gpm.loanapproval.service.client.processrequestservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.6.6
 * 2014-04-19T18:11:11.438+02:00
 * Generated source version: 2.6.6
 * 
 */
@WebService(targetNamespace = "http://service.loanapproval.gpm.bscwi.fhnw.ch/", name = "ProcessRequestService")
@XmlSeeAlso({ObjectFactory.class})
public interface ProcessRequestService {

    @WebResult(name = "return", targetNamespace = "")
    @Action(input = "http://service.loanapproval.gpm.bscwi.fhnw.ch/ProcessRequestService/processRequestRequest", output = "http://service.loanapproval.gpm.bscwi.fhnw.ch/ProcessRequestService/processRequestResponse")
    @RequestWrapper(localName = "processRequest", targetNamespace = "http://service.loanapproval.gpm.bscwi.fhnw.ch/", className = "ch.fhnw.bscwi.gpm.loanapproval.service.client.processrequestservice.ProcessRequest")
    @WebMethod
    @ResponseWrapper(localName = "processRequestResponse", targetNamespace = "http://service.loanapproval.gpm.bscwi.fhnw.ch/", className = "ch.fhnw.bscwi.gpm.loanapproval.service.client.processrequestservice.ProcessRequestResponse")
    public boolean processRequest(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.Long arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        java.lang.Long arg1
    );
}
