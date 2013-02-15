
package au.com.project.sample.registration.services.setcountry;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import au.com.project.sample.common.message.Response;
import au.com.project.sample.common.message.ResponseMessage;
import au.com.project.sample.registration.model.Country;


/**
 * <p>Java class for SetCountryResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SetCountryResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sample.project.com.au/common/message/Response/v1}Response">
 *       &lt;sequence>
 *         &lt;element name="message">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.sample.project.com.au/common/message/ResponseMessage/v1}ResponseMessage">
 *                 &lt;sequence>
 *                   &lt;element name="country" type="{http://www.sample.project.com.au/registration/model/Country/v1}Country"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetCountryResponse", propOrder = {
    "message",
    "id"
})
public class SetCountryResponse
    extends Response
{

    @XmlElement(required = true)
    protected SetCountryResponse.Message message;
    @XmlElement(required = true)
    protected String id;

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link SetCountryResponse.Message }
     *     
     */
    public SetCountryResponse.Message getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link SetCountryResponse.Message }
     *     
     */
    public void setMessage(SetCountryResponse.Message value) {
        this.message = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
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
     *         &lt;element name="country" type="{http://www.sample.project.com.au/registration/model/Country/v1}Country"/>
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
        "country"
    })
    public static class Message
        extends ResponseMessage
    {

        @XmlElement(required = true)
        protected Country country;

        /**
         * Gets the value of the country property.
         * 
         * @return
         *     possible object is
         *     {@link Country }
         *     
         */
        public Country getCountry() {
            return country;
        }

        /**
         * Sets the value of the country property.
         * 
         * @param value
         *     allowed object is
         *     {@link Country }
         *     
         */
        public void setCountry(Country value) {
            this.country = value;
        }

    }

}
