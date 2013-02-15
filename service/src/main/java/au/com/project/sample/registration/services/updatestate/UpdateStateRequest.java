
package au.com.project.sample.registration.services.updatestate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import au.com.project.sample.common.message.Request;
import au.com.project.sample.registration.model.State;


/**
 * <p>Java class for UpdateStateRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateStateRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sample.project.com.au/common/message/Request/v1}Request">
 *       &lt;sequence>
 *         &lt;element name="message">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="state" type="{http://www.sample.project.com.au/registration/model/State/v1}State"/>
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
@XmlType(name = "UpdateStateRequest", propOrder = {
    "message"
})
public class UpdateStateRequest
    extends Request
{

    @XmlElement(required = true)
    protected UpdateStateRequest.Message message;

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateStateRequest.Message }
     *     
     */
    public UpdateStateRequest.Message getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateStateRequest.Message }
     *     
     */
    public void setMessage(UpdateStateRequest.Message value) {
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
     *         &lt;element name="state" type="{http://www.sample.project.com.au/registration/model/State/v1}State"/>
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
        "state"
    })
    public static class Message {

        @XmlElement(required = true)
        protected State state;

        /**
         * Gets the value of the state property.
         * 
         * @return
         *     possible object is
         *     {@link State }
         *     
         */
        public State getState() {
            return state;
        }

        /**
         * Sets the value of the state property.
         * 
         * @param value
         *     allowed object is
         *     {@link State }
         *     
         */
        public void setState(State value) {
            this.state = value;
        }

    }

}
