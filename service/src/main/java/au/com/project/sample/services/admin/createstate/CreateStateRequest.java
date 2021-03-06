
package au.com.project.sample.services.admin.createstate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import au.com.project.sample.common.message.Request;
import au.com.project.sample.services.model.StateInfo;


/**
 * <p>Java class for CreateStateRequest complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="CreateStateRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sample.project.com.au/common/message/Request/v1}Request">
 *       &lt;sequence>
 *         &lt;element name="message">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="stateInfo" type="{http://www.sample.project.com.au/services/model/StateInfo/v1}StateInfo"/>
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
@XmlType(name = "CreateStateRequest", propOrder = {
    "message"
})
public class CreateStateRequest
    extends Request
{

    @XmlElement(required = true)
    protected CreateStateRequest.Message message;

    /**
     * Gets the value of the message property.
     *
     * @return
     *     possible object is
     *     {@link CreateStateRequest.Message }
     *
     */
    public CreateStateRequest.Message getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     *
     * @param value
     *     allowed object is
     *     {@link CreateStateRequest.Message }
     *
     */
    public void setMessage(CreateStateRequest.Message value) {
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
     *         &lt;element name="stateInfo" type="{http://www.sample.project.com.au/services/model/StateInfo/v1}StateInfo"/>
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
        "stateInfo"
    })
    public static class Message {

        @XmlElement(required = true)
        protected StateInfo stateInfo;

        /**
         * Gets the value of the stateInfo property.
         *
         * @return
         *     possible object is
         *     {@link StateInfo }
         *
         */
        public StateInfo getStateInfo() {
            return stateInfo;
        }

        /**
         * Sets the value of the stateInfo property.
         *
         * @param value
         *     allowed object is
         *     {@link StateInfo }
         *
         */
        public void setStateInfo(StateInfo value) {
            this.stateInfo = value;
        }

    }

}
