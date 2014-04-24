/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ch.fhnw.bscwi.gpm.simplecustomerservice.consumer.restclient;

import javax.ws.rs.client.WebTarget;

/**
 * Jersey REST client generated for REST resource:CustomerRESTService
 * [CustomerRESTService]<br>
 * USAGE:
 * <pre>
        CustomerRESTServiceClient client = new CustomerRESTServiceClient();
        Object response = client.XXX(...);
        // do whatever with response
        client.close();
 </pre>
 *
 * @author andreas.martin
 */
public class CustomerRESTServiceClient {
    private final javax.ws.rs.client.WebTarget webTarget;
    private final javax.ws.rs.client.Client client;
    private static final String BASE_URI = "http://localhost:8080/SimpleCustomerService/webresources";

    public CustomerRESTServiceClient() {
        client = javax.ws.rs.client.ClientBuilder.newClient();
        webTarget = client.target(BASE_URI).path("CustomerRESTService");
    }

    public String isAlreadyACustomer(String lastName, String firstName) throws javax.ws.rs.ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("{0}/{1}", new Object[]{firstName, lastName}));
        return resource.request(javax.ws.rs.core.MediaType.TEXT_PLAIN).get(String.class);
    }

    public void close() {
        client.close();
    }
    
}
