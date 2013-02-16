
package au.com.project.sample.services.account.createaccount;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import au.com.project.sample.common.message.Request;
import au.com.project.sample.services.model.UserInfo;


/**
 * <p>Java class for CreateAccountRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateAccountRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sample.project.com.au/common/message/Request/v1}Request">
 *       &lt;sequence>
 *         &lt;element name="message">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="userInfo" type="{http://www.sample.project.com.au/services/model/UserInfo/v1}UserInfo"/>
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
@XmlType(name = "CreateAccountRequest", propOrder = {
    "message"
})
public class CreateAccountRequest
    extends Request
{

    @XmlElement(required = true)
    protected CreateAccountRequest.Message message;

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link CreateAccountRequest.Message }
     *     
     */
    public CreateAccountRequest.Message getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateAccountRequest.Message }
     *     
     */
    public void setMessage(CreateAccountRequest.Message value) {
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
     *         &lt;element name="userInfo" type="{http://www.sample.project.com.au/services/model/UserInfo/v1}UserInfo"/>
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
        "userInfo"
    })
    public static class Message {

        @XmlElement(required = true)
        protected UserInfo userInfo;

        /**
         * Gets the value of the userInfo property.
         * 
         * @return
         *     possible object is
         *     {@link UserInfo }
         *     
         */
        public UserInfo getUserInfo() {
            return userInfo;
        }

        /**
         * Sets the value of the userInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link UserInfo }
         *     
         */
        public void setUserInfo(UserInfo value) {
            this.userInfo = value;
        }

    }

}
