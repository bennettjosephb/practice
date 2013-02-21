
package au.com.project.sample.services.account.createeducationsummary;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import au.com.project.sample.common.message.Request;
import au.com.project.sample.services.model.EducationSummaryInfo;


/**
 * <p>Java class for CreateEducationSummaryRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateEducationSummaryRequest">
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
@XmlType(name = "CreateEducationSummaryRequest", propOrder = {
    "message"
})
public class CreateEducationSummaryRequest
    extends Request
{

    @XmlElement(required = true)
    protected CreateEducationSummaryRequest.Message message;

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link CreateEducationSummaryRequest.Message }
     *     
     */
    public CreateEducationSummaryRequest.Message getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateEducationSummaryRequest.Message }
     *     
     */
    public void setMessage(CreateEducationSummaryRequest.Message value) {
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
