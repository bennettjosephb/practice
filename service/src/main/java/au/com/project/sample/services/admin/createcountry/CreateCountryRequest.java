
package au.com.project.sample.services.admin.createcountry;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import au.com.project.sample.common.message.Request;
import au.com.project.sample.services.model.countryinfo.v1.CountryInfo;


/**
 * <p>Java class for CreateCountryRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateCountryRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sample.project.com.au/common/message/Request/v1}Request">
 *       &lt;sequence>
 *         &lt;element name="message">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="countryInfo" type="{http://www.sample.project.com.au/services/model/CountryInfo/v1}CountryInfo"/>
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
@XmlType(name = "CreateCountryRequest", propOrder = {
    "message"
})
public class CreateCountryRequest
    extends Request
{

    @XmlElement(required = true)
    protected CreateCountryRequest.Message message;

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link CreateCountryRequest.Message }
     *     
     */
    public CreateCountryRequest.Message getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateCountryRequest.Message }
     *     
     */
    public void setMessage(CreateCountryRequest.Message value) {
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
     *         &lt;element name="countryInfo" type="{http://www.sample.project.com.au/services/model/CountryInfo/v1}CountryInfo"/>
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
        "countryInfo"
    })
    public static class Message {

        @XmlElement(required = true)
        protected CountryInfo countryInfo;

        /**
         * Gets the value of the countryInfo property.
         * 
         * @return
         *     possible object is
         *     {@link CountryInfo }
         *     
         */
        public CountryInfo getCountryInfo() {
            return countryInfo;
        }

        /**
         * Sets the value of the countryInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link CountryInfo }
         *     
         */
        public void setCountryInfo(CountryInfo value) {
            this.countryInfo = value;
        }

    }

}
