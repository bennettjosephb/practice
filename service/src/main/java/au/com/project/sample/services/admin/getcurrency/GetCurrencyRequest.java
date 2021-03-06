
package au.com.project.sample.services.admin.getcurrency;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import au.com.project.sample.common.message.Request;
import au.com.project.sample.services.model.CurrencyInfo;


/**
 * <p>Java class for GetCurrencyRequest complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="GetCurrencyRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sample.project.com.au/common/message/Request/v1}Request">
 *       &lt;sequence>
 *         &lt;element name="message">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="currencyInfo" type="{http://www.sample.project.com.au/services/model/CurrencyInfo/v1}CurrencyInfo"/>
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
@XmlType(name = "GetCurrencyRequest", propOrder = {
    "message"
})
public class GetCurrencyRequest
    extends Request
{

    @XmlElement(required = true)
    protected GetCurrencyRequest.Message message;

    /**
     * Gets the value of the message property.
     *
     * @return
     *     possible object is
     *     {@link GetCurrencyRequest.Message }
     *
     */
    public GetCurrencyRequest.Message getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     *
     * @param value
     *     allowed object is
     *     {@link GetCurrencyRequest.Message }
     *
     */
    public void setMessage(GetCurrencyRequest.Message value) {
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
     *         &lt;element name="currencyInfo" type="{http://www.sample.project.com.au/services/model/CurrencyInfo/v1}CurrencyInfo"/>
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
        "currencyInfo"
    })
    public static class Message {

        @XmlElement(required = true)
        protected CurrencyInfo currencyInfo;

        /**
         * Gets the value of the currencyInfo property.
         *
         * @return
         *     possible object is
         *     {@link CurrencyInfo }
         *
         */
        public CurrencyInfo getCurrencyInfo() {
            return currencyInfo;
        }

        /**
         * Sets the value of the currencyInfo property.
         *
         * @param value
         *     allowed object is
         *     {@link CurrencyInfo }
         *
         */
        public void setCurrencyInfo(CurrencyInfo value) {
            this.currencyInfo = value;
        }

    }

}
