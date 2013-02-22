
package au.com.project.sample.services.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for EmploymentSummaryInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmploymentSummaryInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="fromDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="todate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="entityName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="designation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="joiningDesignation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="leavingDesignation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="salary" type="{http://www.sample.project.com.au/services/model/SalaryInfo/v1}SalaryInfo"/>
 *         &lt;element name="joiningSalary" type="{http://www.sample.project.com.au/services/model/SalaryInfo/v1}SalaryInfo"/>
 *         &lt;element name="leavingSalary" type="{http://www.sample.project.com.au/services/model/SalaryInfo/v1}SalaryInfo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmploymentSummaryInfo", propOrder = {
    "id",
    "fromDate",
    "todate",
    "entityName",
    "designation",
    "joiningDesignation",
    "leavingDesignation",
    "salary",
    "joiningSalary",
    "leavingSalary"
})
public class EmploymentSummaryInfo {

    protected long id;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fromDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar todate;
    @XmlElement(required = true)
    protected String entityName;
    @XmlElement(required = true)
    protected String designation;
    @XmlElement(required = true)
    protected String joiningDesignation;
    @XmlElement(required = true)
    protected String leavingDesignation;
    @XmlElement(required = true)
    protected SalaryInfo salary;
    @XmlElement(required = true)
    protected SalaryInfo joiningSalary;
    @XmlElement(required = true)
    protected SalaryInfo leavingSalary;

    /**
     * Gets the value of the id property.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the fromDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFromDate() {
        return fromDate;
    }

    /**
     * Sets the value of the fromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFromDate(XMLGregorianCalendar value) {
        this.fromDate = value;
    }

    /**
     * Gets the value of the todate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTodate() {
        return todate;
    }

    /**
     * Sets the value of the todate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTodate(XMLGregorianCalendar value) {
        this.todate = value;
    }

    /**
     * Gets the value of the entityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityName() {
        return entityName;
    }

    /**
     * Sets the value of the entityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityName(String value) {
        this.entityName = value;
    }

    /**
     * Gets the value of the designation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesignation() {
        return designation;
    }

    /**
     * Sets the value of the designation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesignation(String value) {
        this.designation = value;
    }

    /**
     * Gets the value of the joiningDesignation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJoiningDesignation() {
        return joiningDesignation;
    }

    /**
     * Sets the value of the joiningDesignation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJoiningDesignation(String value) {
        this.joiningDesignation = value;
    }

    /**
     * Gets the value of the leavingDesignation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeavingDesignation() {
        return leavingDesignation;
    }

    /**
     * Sets the value of the leavingDesignation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeavingDesignation(String value) {
        this.leavingDesignation = value;
    }

    /**
     * Gets the value of the salary property.
     * 
     * @return
     *     possible object is
     *     {@link SalaryInfo }
     *     
     */
    public SalaryInfo getSalary() {
        return salary;
    }

    /**
     * Sets the value of the salary property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalaryInfo }
     *     
     */
    public void setSalary(SalaryInfo value) {
        this.salary = value;
    }

    /**
     * Gets the value of the joiningSalary property.
     * 
     * @return
     *     possible object is
     *     {@link SalaryInfo }
     *     
     */
    public SalaryInfo getJoiningSalary() {
        return joiningSalary;
    }

    /**
     * Sets the value of the joiningSalary property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalaryInfo }
     *     
     */
    public void setJoiningSalary(SalaryInfo value) {
        this.joiningSalary = value;
    }

    /**
     * Gets the value of the leavingSalary property.
     * 
     * @return
     *     possible object is
     *     {@link SalaryInfo }
     *     
     */
    public SalaryInfo getLeavingSalary() {
        return leavingSalary;
    }

    /**
     * Sets the value of the leavingSalary property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalaryInfo }
     *     
     */
    public void setLeavingSalary(SalaryInfo value) {
        this.leavingSalary = value;
    }

}
