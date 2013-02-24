
package au.com.project.sample.services.account.createitskill;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import au.com.project.sample.common.message.Request;
import au.com.project.sample.services.model.ITSkillInfo;


/**
 * <p>Java class for CreateITSkillRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateITSkillRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sample.project.com.au/common/message/Request/v1}Request">
 *       &lt;sequence>
 *         &lt;element name="message">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="iTSkillInfo" type="{http://www.sample.project.com.au/services/model/ITSkillInfo/v1}ITSkillInfo"/>
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
@XmlType(name = "CreateITSkillRequest", propOrder = {
    "message"
})
public class CreateITSkillRequest
    extends Request
{

    @XmlElement(required = true)
    protected CreateITSkillRequest.Message message;

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link CreateITSkillRequest.Message }
     *     
     */
    public CreateITSkillRequest.Message getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateITSkillRequest.Message }
     *     
     */
    public void setMessage(CreateITSkillRequest.Message value) {
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
     *         &lt;element name="iTSkillInfo" type="{http://www.sample.project.com.au/services/model/ITSkillInfo/v1}ITSkillInfo"/>
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
        "itSkillInfo"
    })
    public static class Message {

        @XmlElement(name = "iTSkillInfo", required = true)
        protected ITSkillInfo itSkillInfo;

        /**
         * Gets the value of the itSkillInfo property.
         * 
         * @return
         *     possible object is
         *     {@link ITSkillInfo }
         *     
         */
        public ITSkillInfo getITSkillInfo() {
            return itSkillInfo;
        }

        /**
         * Sets the value of the itSkillInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link ITSkillInfo }
         *     
         */
        public void setITSkillInfo(ITSkillInfo value) {
            this.itSkillInfo = value;
        }

    }

}
