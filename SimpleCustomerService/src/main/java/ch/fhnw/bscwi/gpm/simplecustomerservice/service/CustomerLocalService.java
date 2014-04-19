/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ch.fhnw.bscwi.gpm.simplecustomerservice.service;

/**
 *
 * @author andreas.martin
 */
public class CustomerLocalService {
    
    public boolean isAlreadyACustomer(String firstName, String lastName) {
        boolean result = firstName.equals("Andreas")&&lastName.equals("Martin");
        return result;
    }
    
}
