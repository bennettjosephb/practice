
package au.com.project.sample.registration.services.savecity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import au.com.project.sample.common.message.Request;
import au.com.project.sample.registration.model.City;


/**
 * <p>Java class for SaveCityRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SaveCityRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sample.project.com.au/common/message/Request/v1}Request">
 *       &lt;sequence>
 *         &lt;element name="message">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="city" type="{http://www.sample.project.com.au/registration/model/City/v1}City"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
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
@XmlType(name = "SaveCityRequest", propOrder = {
    "message"
})
public class SaveCityRequest
    extends Request
{

    @XmlElement(required = true)
    protected SaveCityRequest.Message message;

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link SaveCityRequest.Message }
     *     
     */
    public SaveCityRequest.Message getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link SaveCityRequest.Message }
     *     
     */
    public void setMessage(SaveCityRequest.Message value) {
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
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="city" type="{http://www.sample.project.com.au/registration/model/City/v1}City"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "city"
    })
    public static class Message {

        @XmlElement(required = true)
        protected City city;

        /**
         * Gets the value of the city property.
         * 
         * @return
         *     possible object is
         *     {@link City }
         *     
         */
        public City getCity() {
            return city;
        }

        /**
         * Sets the value of the city property.
         * 
         * @param value
         *     allowed object is
         *     {@link City }
         *     
         */
        public void setCity(City value) {
            this.city = value;
        }

    }

}
