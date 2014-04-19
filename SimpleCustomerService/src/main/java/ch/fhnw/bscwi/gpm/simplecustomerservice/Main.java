/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ch.fhnw.bscwi.gpm.simplecustomerservice;

import ch.fhnw.bscwi.gpm.simplecustomerservice.service.CustomerLocalService;

/**
 *
 * @author andreas.martin
 */
public class Main {
    
    public static void main(String[] args)
    {
        CustomerLocalService customerLocalService = new CustomerLocalService();
        if(customerLocalService.isAlreadyACustomer("Andreas", "Martin"))
            System.out.println("Yes I am a customer!");
        else
            System.out.println("Yes I am not a customer :-(");
    }
    
}
