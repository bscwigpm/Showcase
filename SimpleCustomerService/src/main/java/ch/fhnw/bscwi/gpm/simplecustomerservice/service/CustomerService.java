/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ch.fhnw.bscwi.gpm.simplecustomerservice.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author andreas.martin
 */
@WebService(serviceName = "CustomerService")
public class CustomerService {

    /**
     * This is a sample web service operation
     * @param firstName
     * @param lastName
     * @return 
     */
    @WebMethod(operationName = "isAlreadyACustomer")
    public boolean isAlreadyACustomer(@WebParam(name = "firstName") String firstName, @WebParam(name = "lastName") String lastName) {
        boolean result = firstName.equals("Andreas")&&lastName.equals("Martin");
        return result;
    }
}
