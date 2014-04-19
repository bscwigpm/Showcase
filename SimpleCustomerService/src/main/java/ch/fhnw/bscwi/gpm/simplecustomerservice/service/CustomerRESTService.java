/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ch.fhnw.bscwi.gpm.simplecustomerservice.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 *
 * @author andreas.martin
 */
@Path("CustomerRESTService")
public class CustomerRESTService {

    @GET
    @Path("{lastName}/{firstName}")
    @Produces("text/plain")
    public String isAlreadyACustomer(@PathParam("firstName") String firstName, @PathParam("lastName") String lastName) {
        Boolean result = firstName.equals("Andreas")&&lastName.equals("Martin");
        return result.toString();
    }
}
