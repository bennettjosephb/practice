
package au.com.project.sample.services.account.deleteemploymentsummary;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import au.com.project.sample.common.message.Request;
import au.com.project.sample.services.model.EmploymentSummaryInfo;


/**
 * <p>Java class for DeleteEmploymentSummaryRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeleteEmploymentSummaryRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sample.project.com.au/common/message/Request/v1}Request">
 *       &lt;sequence>
 *         &lt;element name="message">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="employmentSummaryInfo" type="{http://www.sample.project.com.au/services/model/EmploymentSummaryInfo/v1}EmploymentSummaryInfo"/>
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
@XmlType(name = "DeleteEmploymentSummaryRequest", propOrder = {
    "message"
})
public class DeleteEmploymentSummaryRequest
    extends Request
{

    @XmlElement(required = true)
    protected DeleteEmploymentSummaryRequest.Message message;

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link DeleteEmploymentSummaryRequest.Message }
     *     
     */
    public DeleteEmploymentSummaryRequest.Message getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeleteEmploymentSummaryRequest.Message }
     *     
     */
    public void setMessage(DeleteEmploymentSummaryRequest.Message value) {
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
     *         &lt;element name="employmentSummaryInfo" type="{http://www.sample.project.com.au/services/model/EmploymentSummaryInfo/v1}EmploymentSummaryInfo"/>
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
        "employmentSummaryInfo"
    })
    public static class Message {

        @XmlElement(required = true)
        protected EmploymentSummaryInfo employmentSummaryInfo;

        /**
         * Gets the value of the employmentSummaryInfo property.
         * 
         * @return
         *     possible object is
         *     {@link EmploymentSummaryInfo }
         *     
         */
        public EmploymentSummaryInfo getEmploymentSummaryInfo() {
            return employmentSummaryInfo;
        }

        /**
         * Sets the value of the employmentSummaryInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link EmploymentSummaryInfo }
         *     
         */
        public void setEmploymentSummaryInfo(EmploymentSummaryInfo value) {
            this.employmentSummaryInfo = value;
        }

    }

}
