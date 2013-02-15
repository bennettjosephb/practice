
package au.com.project.sample.registration.services.updatecountry;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import au.com.project.sample.common.message.Response;
import au.com.project.sample.common.message.ResponseMessage;
import au.com.project.sample.registration.model.Country;


/**
 * <p>Java class for UpdateCountryResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateCountryResponse">
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
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateCountryResponse", propOrder = {
    "message"
})
public class UpdateCountryResponse
    extends Response
{

    @XmlElement(required = true)
    protected UpdateCountryResponse.Message message;

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateCountryResponse.Message }
     *     
     */
    public UpdateCountryResponse.Message getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateCountryResponse.Message }
     *     
     */
    public void setMessage(UpdateCountryResponse.Message value) {
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
