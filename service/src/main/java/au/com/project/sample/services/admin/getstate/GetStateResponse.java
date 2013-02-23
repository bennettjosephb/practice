
package au.com.project.sample.services.admin.getstate;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import au.com.project.sample.common.message.ResponseMessage;
import au.com.project.sample.services.model.stateinfo.v1.StateInfo;


/**
 * <p>Java class for GetStateResponse complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="GetStateResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sample.project.com.au/common/message/ResponseMessage/v1}ResponseMessage">
 *       &lt;sequence>
 *         &lt;element name="message">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="stateInfo" type="{http://www.sample.project.com.au/services/model/StateInfo/v1}StateInfo" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "GetStateResponse", propOrder = {
    "message"
})
public class GetStateResponse
    extends ResponseMessage
{

    @XmlElement(required = true)
    protected GetStateResponse.Message message;

    /**
     * Gets the value of the message property.
     *
     * @return
     *     possible object is
     *     {@link GetStateResponse.Message }
     *
     */
    public GetStateResponse.Message getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     *
     * @param value
     *     allowed object is
     *     {@link GetStateResponse.Message }
     *
     */
    public void setMessage(GetStateResponse.Message value) {
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
     *         &lt;element name="stateInfo" type="{http://www.sample.project.com.au/services/model/StateInfo/v1}StateInfo" maxOccurs="unbounded" minOccurs="0"/>
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

        protected List<StateInfo> stateInfo;

        /**
         * Gets the value of the stateInfo property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the stateInfo property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getStateInfo().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link StateInfo }
         *
         *
         */
        public List<StateInfo> getStateInfo() {
            if (stateInfo == null) {
                stateInfo = new ArrayList<StateInfo>();
            }
            return this.stateInfo;
        }

    }

}
