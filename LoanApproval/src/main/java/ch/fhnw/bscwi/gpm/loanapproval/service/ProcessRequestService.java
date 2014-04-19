/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.fhnw.bscwi.gpm.loanapproval.service;

import ch.fhnw.bscwi.gpm.loanapproval.domain.Customer;
import ch.fhnw.bscwi.gpm.loanapproval.domain.Loan;
import ch.fhnw.bscwi.gpm.loanapproval.ejb.CustomerEJB;
import java.util.List;
import java.util.ArrayList;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.jws.WebService;

/**
 *
 * @author andreas.martin
 */
@Named
@RequestScoped
@WebService(name = "ProcessRequestService")
public class ProcessRequestService {

    @EJB
    CustomerEJB customerEJB;

    public boolean processRequest(Long customerId, Long amount) {
        Customer customer = customerEJB.findCustomerById(customerId);

        Loan loan = new Loan();
        loan.setLoanType("default type");
        loan.setTerm("2 years");
        loan.setAmount(Long.parseLong(amount.toString()));
        List<Loan> loans = new ArrayList<>();
        loans.add(loan);
        customer.setLoan(loans);
        customerEJB.updateCustomer(customer);
        return true;
    }
}
