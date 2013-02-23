
package au.com.project.sample.services.admin.getcountry;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import au.com.project.sample.common.message.ResponseMessage;
import au.com.project.sample.services.model.countryinfo.v1.CountryInfo;


/**
 * <p>Java class for GetCountryResponse complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="GetCountryResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sample.project.com.au/common/message/ResponseMessage/v1}ResponseMessage">
 *       &lt;sequence>
 *         &lt;element name="message">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="countryInfo" type="{http://www.sample.project.com.au/services/model/CountryInfo/v1}CountryInfo" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "GetCountryResponse", propOrder = {
    "message"
})
public class GetCountryResponse
    extends ResponseMessage
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
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="countryInfo" type="{http://www.sample.project.com.au/services/model/CountryInfo/v1}CountryInfo" maxOccurs="unbounded" minOccurs="0"/>
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

        protected List<CountryInfo> countryInfo;

        /**
         * Gets the value of the countryInfo property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the countryInfo property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCountryInfo().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CountryInfo }
         *
         *
         */
        public List<CountryInfo> getCountryInfo() {
            if (countryInfo == null) {
                countryInfo = new ArrayList<CountryInfo>();
            }
            return this.countryInfo;
        }

    }

}
