package ch.fhnw.bscwi.gpm.loanapproval.service.client.customerwebservice;

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
 * 2014-04-19T18:08:23.615+02:00
 * Generated source version: 2.6.6
 * 
 */
@WebService(targetNamespace = "http://service.loanapproval.gpm.bscwi.fhnw.ch/", name = "CustomerWebService")
@XmlSeeAlso({ObjectFactory.class})
public interface CustomerWebService {

    @WebResult(name = "return", targetNamespace = "")
    @Action(input = "http://service.loanapproval.gpm.bscwi.fhnw.ch/CustomerWebService/loadCustomerRequest", output = "http://service.loanapproval.gpm.bscwi.fhnw.ch/CustomerWebService/loadCustomerResponse")
    @RequestWrapper(localName = "loadCustomer", targetNamespace = "http://service.loanapproval.gpm.bscwi.fhnw.ch/", className = "ch.fhnw.bscwi.gpm.loanapproval.service.client.customerwebservice.LoadCustomer")
    @WebMethod
    @ResponseWrapper(localName = "loadCustomerResponse", targetNamespace = "http://service.loanapproval.gpm.bscwi.fhnw.ch/", className = "ch.fhnw.bscwi.gpm.loanapproval.service.client.customerwebservice.LoadCustomerResponse")
    public ch.fhnw.bscwi.gpm.loanapproval.service.client.customerwebservice.CustomerDTO loadCustomer(
        @WebParam(name = "customerId", targetNamespace = "")
        java.lang.Long customerId
    );
}