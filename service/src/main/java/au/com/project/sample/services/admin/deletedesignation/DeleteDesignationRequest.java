
package au.com.project.sample.services.admin.deletedesignation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import au.com.project.sample.common.message.Request;
import au.com.project.sample.services.model.DesignationInfo;


/**
 * <p>Java class for DeleteDesignationRequest complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="DeleteDesignationRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sample.project.com.au/common/message/Request/v1}Request">
 *       &lt;sequence>
 *         &lt;element name="message">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="designationInfo" type="{http://www.sample.project.com.au/services/model/DesignationInfo/v1}DesignationInfo"/>
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
@XmlType(name = "DeleteDesignationRequest", propOrder = {
    "message"
})
public class DeleteDesignationRequest
    extends Request
{

    @XmlElement(required = true)
    protected DeleteDesignationRequest.Message message;

    /**
     * Gets the value of the message property.
     *
     * @return
     *     possible object is
     *     {@link DeleteDesignationRequest.Message }
     *
     */
    public DeleteDesignationRequest.Message getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     *
     * @param value
     *     allowed object is
     *     {@link DeleteDesignationRequest.Message }
     *
     */
    public void setMessage(DeleteDesignationRequest.Message value) {
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
     *         &lt;element name="designationInfo" type="{http://www.sample.project.com.au/services/model/DesignationInfo/v1}DesignationInfo"/>
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
        "designationInfo"
    })
    public static class Message {

        @XmlElement(required = true)
        protected DesignationInfo designationInfo;

        /**
         * Gets the value of the designationInfo property.
         *
         * @return
         *     possible object is
         *     {@link DesignationInfo }
         *
         */
        public DesignationInfo getDesignationInfo() {
            return designationInfo;
        }

        /**
         * Sets the value of the designationInfo property.
         *
         * @param value
         *     allowed object is
         *     {@link DesignationInfo }
         *
         */
        public void setDesignationInfo(DesignationInfo value) {
            this.designationInfo = value;
        }

    }

}
