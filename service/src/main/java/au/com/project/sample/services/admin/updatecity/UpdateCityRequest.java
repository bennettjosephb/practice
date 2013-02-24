
package au.com.project.sample.services.admin.updatecity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import au.com.project.sample.common.message.Request;
import au.com.project.sample.services.model.CityInfo;


/**
 * <p>Java class for UpdateCityRequest complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="UpdateCityRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sample.project.com.au/common/message/Request/v1}Request">
 *       &lt;sequence>
 *         &lt;element name="message">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="cityInfo" type="{http://www.sample.project.com.au/services/model/CityInfo/v1}CityInfo"/>
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
@XmlType(name = "UpdateCityRequest", propOrder = {
    "message"
})
public class UpdateCityRequest
    extends Request
{

    @XmlElement(required = true)
    protected UpdateCityRequest.Message message;

    /**
     * Gets the value of the message property.
     *
     * @return
     *     possible object is
     *     {@link UpdateCityRequest.Message }
     *
     */
    public UpdateCityRequest.Message getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     *
     * @param value
     *     allowed object is
     *     {@link UpdateCityRequest.Message }
     *
     */
    public void setMessage(UpdateCityRequest.Message value) {
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
     *         &lt;element name="cityInfo" type="{http://www.sample.project.com.au/services/model/CityInfo/v1}CityInfo"/>
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
        "cityInfo"
    })
    public static class Message {

        @XmlElement(required = true)
        protected CityInfo cityInfo;

        /**
         * Gets the value of the cityInfo property.
         *
         * @return
         *     possible object is
         *     {@link CityInfo }
         *
         */
        public CityInfo getCityInfo() {
            return cityInfo;
        }

        /**
         * Sets the value of the cityInfo property.
         *
         * @param value
         *     allowed object is
         *     {@link CityInfo }
         *
         */
        public void setCityInfo(CityInfo value) {
            this.cityInfo = value;
        }

    }

}
