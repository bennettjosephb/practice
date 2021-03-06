
package au.com.project.sample.common.message.faultmessage.v1;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.5.2
 * 2013-03-04T22:39:27.729+11:00
 * Generated source version: 2.5.2
 */

@WebFault(name = "businessException", targetNamespace = "http://www.sample.project.com.au/common/message/BusinessException/v1")
public class BusinessFault extends Exception {
    
    private au.com.project.sample.common.message.businessexception.v1.BusinessException businessException;

    public BusinessFault() {
        super();
    }
    
    public BusinessFault(String message) {
        super(message);
    }
    
    public BusinessFault(String message, Throwable cause) {
        super(message, cause);
    }

    public BusinessFault(String message, au.com.project.sample.common.message.businessexception.v1.BusinessException businessException) {
        super(message);
        this.businessException = businessException;
    }

    public BusinessFault(String message, au.com.project.sample.common.message.businessexception.v1.BusinessException businessException, Throwable cause) {
        super(message, cause);
        this.businessException = businessException;
    }

    public au.com.project.sample.common.message.businessexception.v1.BusinessException getFaultInfo() {
        return this.businessException;
    }
}
