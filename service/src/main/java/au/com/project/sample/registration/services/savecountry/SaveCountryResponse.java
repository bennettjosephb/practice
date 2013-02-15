
package au.com.project.sample.registration.services.savecountry;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import au.com.project.sample.common.message.Response;
import au.com.project.sample.common.message.ResponseMessage;


/**
 * <p>Java class for SaveCountryResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SaveCountryResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sample.project.com.au/common/message/Response/v1}Response">
 *       &lt;sequence>
 *         &lt;element name="message">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.sample.project.com.au/common/message/ResponseMessage/v1}ResponseMessage">
 *                 &lt;sequence>
 *                   &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SaveCountryResponse", propOrder = {
    "message"
})
public class SaveCountryResponse
    extends Response
{

    @XmlElement(required = true)
    protected SaveCountryResponse.Message message;

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link SaveCountryResponse.Message }
     *     
     */
    public SaveCountryResponse.Message getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link SaveCountryResponse.Message }
     *     
     */
    public void setMessage(SaveCountryResponse.Message value) {
        this.message = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.sample.project.com.au/common/message/ResponseMessage/v1}ResponseMessage">
     *       &lt;sequence>
     *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "status"
    })
    public static class Message
        extends ResponseMessage
    {

        protected boolean status;

        /**
         * Gets the value of the status property.
         * 
         */
        public boolean isStatus() {
            return status;
        }

        /**
         * Sets the value of the status property.
         * 
         */
        public void setStatus(boolean value) {
            this.status = value;
        }

    }

}
