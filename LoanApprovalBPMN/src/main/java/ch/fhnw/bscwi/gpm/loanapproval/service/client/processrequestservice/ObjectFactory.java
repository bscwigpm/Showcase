
package ch.fhnw.bscwi.gpm.loanapproval.service.client.processrequestservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ch.fhnw.bscwi.gpm.loanapproval.service.client.processrequestservice package. 
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

    private final static QName _ProcessRequest_QNAME = new QName("http://service.loanapproval.gpm.bscwi.fhnw.ch/", "processRequest");
    private final static QName _ProcessRequestResponse_QNAME = new QName("http://service.loanapproval.gpm.bscwi.fhnw.ch/", "processRequestResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ch.fhnw.bscwi.gpm.loanapproval.service.client.processrequestservice
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
