
package au.com.project.sample.registration.services.getcountry;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import au.com.project.sample.common.message.Response;
import au.com.project.sample.common.message.ResponseMessage;
import au.com.project.sample.registration.model.Country;


/**
 * <p>Java class for GetCountryResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCountryResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sample.project.com.au/common/message/Response/v1}Response">
 *       &lt;sequence>
 *         &lt;element name="message">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.sample.project.com.au/common/message/ResponseMessage/v1}ResponseMessage">
 *                 &lt;sequence>
 *                   &lt;element name="country" type="{http://www.sample.project.com.au/registration/model/Country/v1}Country" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "GetCountryResponse", propOrder = {
    "message"
})
public class GetCountryResponse
    extends Response
{

    @XmlElement(required = true)
    protected GetCountryResponse.Message message;

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link GetCountryResponse.Message }
     *     
     */
    public GetCountryResponse.Message getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCountryResponse.Message }
     *     
     */
    public void setMessage(GetCountryResponse.Message value) {
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
     *         &lt;element name="country" type="{http://www.sample.project.com.au/registration/model/Country/v1}Country" maxOccurs="unbounded" minOccurs="0"/>
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

        protected List<Country> country;

        /**
         * Gets the value of the country property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the country property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCountry().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Country }
         * 
         * 
         */
        public List<Country> getCountry() {
            if (country == null) {
                country = new ArrayList<Country>();
            }
            return this.country;
        }

    }

}
