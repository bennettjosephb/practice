
package au.com.project.sample.services.account.updateeducationsummary;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import au.com.project.sample.common.message.Request;
import au.com.project.sample.services.model.educationsummaryinfo.v1.EducationSummaryInfo;


/**
 * <p>Java class for UpdateEducationSummaryRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateEducationSummaryRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sample.project.com.au/common/message/Request/v1}Request">
 *       &lt;sequence>
 *         &lt;element name="message">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="educationSummaryInfo" type="{http://www.sample.project.com.au/services/model/EducationSummaryInfo/v1}EducationSummaryInfo"/>
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
@XmlType(name = "UpdateEducationSummaryRequest", propOrder = {
    "message"
})
public class UpdateEducationSummaryRequest
    extends Request
{

    @XmlElement(required = true)
    protected UpdateEducationSummaryRequest.Message message;

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateEducationSummaryRequest.Message }
     *     
     */
    public UpdateEducationSummaryRequest.Message getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateEducationSummaryRequest.Message }
     *     
     */
    public void setMessage(UpdateEducationSummaryRequest.Message value) {
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
     *         &lt;element name="educationSummaryInfo" type="{http://www.sample.project.com.au/services/model/EducationSummaryInfo/v1}EducationSummaryInfo"/>
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
        "educationSummaryInfo"
    })
    public static class Message {

        @XmlElement(required = true)
        protected EducationSummaryInfo educationSummaryInfo;

        /**
         * Gets the value of the educationSummaryInfo property.
         * 
         * @return
         *     possible object is
         *     {@link EducationSummaryInfo }
         *     
         */
        public EducationSummaryInfo getEducationSummaryInfo() {
            return educationSummaryInfo;
        }

        /**
         * Sets the value of the educationSummaryInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link EducationSummaryInfo }
         *     
         */
        public void setEducationSummaryInfo(EducationSummaryInfo value) {
            this.educationSummaryInfo = value;
        }

    }

}
