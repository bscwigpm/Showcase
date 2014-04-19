
package ch.fhnw.bscwi.gpm.loanapproval.service.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ch.fhnw.bscwi.gpm.loanapproval.service.client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _LoadCustomerResponse_QNAME = new QName("http://service.loanapproval.gpm.bscwi.fhnw.ch/", "loadCustomerResponse");
    private final static QName _LoadCustomer_QNAME = new QName("http://service.loanapproval.gpm.bscwi.fhnw.ch/", "loadCustomer");
    private final static QName _ProcessRequest_QNAME = new QName("http://service.loanapproval.gpm.bscwi.fhnw.ch/", "processRequest");
    private final static QName _ProcessRequestResponse_QNAME = new QName("http://service.loanapproval.gpm.bscwi.fhnw.ch/", "processRequestResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ch.fhnw.bscwi.gpm.loanapproval.service.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ProcessRequestResponse }
     * 
     */
    public ProcessRequestResponse createProcessRequestResponse() {
        return new ProcessRequestResponse();
    }

    /**
     * Create an instance of {@link ProcessRequest }
     * 
     */
    public ProcessRequest createProcessRequest() {
        return new ProcessRequest();
    }

    /**
     * Create an instance of {@link LoadCustomerResponse }
     * 
     */
    public LoadCustomerResponse createLoadCustomerResponse() {
        return new LoadCustomerResponse();
    }

    /**
     * Create an instance of {@link LoadCustomer }
     * 
     */
    public LoadCustomer createLoadCustomer() {
        return new LoadCustomer();
    }

    /**
     * Create an instance of {@link CustomerDTO }
     * 
     */
    public CustomerDTO createCustomerDTO() {
        return new CustomerDTO();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadCustomerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.loanapproval.gpm.bscwi.fhnw.ch/", name = "loadCustomerResponse")
    public JAXBElement<LoadCustomerResponse> createLoadCustomerResponse(LoadCustomerResponse value) {
        return new JAXBElement<LoadCustomerResponse>(_LoadCustomerResponse_QNAME, LoadCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadCustomer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.loanapproval.gpm.bscwi.fhnw.ch/", name = "loadCustomer")
    public JAXBElement<LoadCustomer> createLoadCustomer(LoadCustomer value) {
        return new JAXBElement<LoadCustomer>(_LoadCustomer_QNAME, LoadCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.loanapproval.gpm.bscwi.fhnw.ch/", name = "processRequest")
    public JAXBElement<ProcessRequest> createProcessRequest(ProcessRequest value) {
        return new JAXBElement<ProcessRequest>(_ProcessRequest_QNAME, ProcessRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessRequestResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.loanapproval.gpm.bscwi.fhnw.ch/", name = "processRequestResponse")
    public JAXBElement<ProcessRequestResponse> createProcessRequestResponse(ProcessRequestResponse value) {
        return new JAXBElement<ProcessRequestResponse>(_ProcessRequestResponse_QNAME, ProcessRequestResponse.class, null, value);
    }

}
