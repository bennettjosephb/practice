
package au.com.project.sample.services.account.geteducationsummary;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import au.com.project.sample.common.message.ResponseMessage;
import au.com.project.sample.services.model.educationsummaryinfo.v1.EducationSummaryInfo;


/**
 * <p>Java class for GetEducationSummaryResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetEducationSummaryResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sample.project.com.au/common/message/ResponseMessage/v1}ResponseMessage">
 *       &lt;sequence>
 *         &lt;element name="message">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="educationSummaryInfos" type="{http://www.sample.project.com.au/services/model/EducationSummaryInfo/v1}EducationSummaryInfo" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "GetEducationSummaryResponse", propOrder = {
    "message"
})
public class GetEducationSummaryResponse
    extends ResponseMessage
{

    @XmlElement(required = true)
    protected GetEducationSummaryResponse.Message message;

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link GetEducationSummaryResponse.Message }
     *     
     */
    public GetEducationSummaryResponse.Message getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetEducationSummaryResponse.Message }
     *     
     */
    public void setMessage(GetEducationSummaryResponse.Message value) {
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
     *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="educationSummaryInfos" type="{http://www.sample.project.com.au/services/model/EducationSummaryInfo/v1}EducationSummaryInfo" maxOccurs="unbounded" minOccurs="0"/>
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
        "status",
        "description",
        "educationSummaryInfos"
    })
    public static class Message {

        protected boolean status;
        @XmlElement(required = true)
        protected String description;
        protected List<EducationSummaryInfo> educationSummaryInfos;

        /**
         * Gets the value of the status property.
         * 
         */
        public boolean isStatus() {
            return status;
        }

        /**
         * Sets the value of the status property.
         * 
         */
        public void setStatus(boolean value) {
            this.status = value;
        }

        /**
         * Gets the value of the description property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDescription() {
            return description;
        }

        /**
         * Sets the value of the description property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDescription(String value) {
            this.description = value;
        }

        /**
         * Gets the value of the educationSummaryInfos property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the educationSummaryInfos property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEducationSummaryInfos().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EducationSummaryInfo }
         * 
         * 
         */
        public List<EducationSummaryInfo> getEducationSummaryInfos() {
            if (educationSummaryInfos == null) {
                educationSummaryInfos = new ArrayList<EducationSummaryInfo>();
            }
            return this.educationSummaryInfos;
        }

    }

}
