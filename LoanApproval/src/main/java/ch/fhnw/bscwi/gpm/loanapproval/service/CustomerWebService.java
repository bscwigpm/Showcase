/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ch.fhnw.bscwi.gpm.loanapproval.service;

import ch.fhnw.bscwi.gpm.loanapproval.dto.CustomerDTO;
import ch.fhnw.bscwi.gpm.loanapproval.ejb.CustomerEJB;
import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import org.modelmapper.ModelMapper;

/**
 *
 * @author andreas.martin
 */
@WebService(serviceName = "CustomerWebService")
public class CustomerWebService {

    @EJB
    CustomerEJB customerEJB;

    @WebMethod(operationName = "loadCustomer")
    public CustomerDTO loadCustomer(@WebParam(name = "customerId") Long customerId) {
        System.out.println("CustomerWebService : loadCustomer with customerId: " + customerId.toString());
        return new ModelMapper().map(customerEJB.findCustomerById(customerId), CustomerDTO.class);
    }
}
