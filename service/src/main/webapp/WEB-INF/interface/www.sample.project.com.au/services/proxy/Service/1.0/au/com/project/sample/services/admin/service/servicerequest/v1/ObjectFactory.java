
package au.com.project.sample.services.admin.service.servicerequest.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the au.com.project.sample.services.admin.service.servicerequest.v1 package. 
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

    private final static QName _ServiceRequest_QNAME = new QName("http://www.sample.project.com.au/services/admin/Service/ServiceRequest/v1", "serviceRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: au.com.project.sample.services.admin.service.servicerequest.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ServiceRequest }
     * 
     */
    public ServiceRequest createServiceRequest() {
        return new ServiceRequest();
    }

    /**
     * Create an instance of {@link ServiceRequest.Message }
     * 
     */
    public ServiceRequest.Message createServiceRequestMessage() {
        return new ServiceRequest.Message();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sample.project.com.au/services/admin/Service/ServiceRequest/v1", name = "serviceRequest")
    public JAXBElement<ServiceRequest> createServiceRequest(ServiceRequest value) {
        return new JAXBElement<ServiceRequest>(_ServiceRequest_QNAME, ServiceRequest.class, null, value);
    }

}
