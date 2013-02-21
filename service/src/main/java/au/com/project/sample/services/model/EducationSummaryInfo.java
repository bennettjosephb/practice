
package au.com.project.sample.services.model;

import java.util.Calendar;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for EducationSummaryInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EducationSummaryInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="fromDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="todate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="courseName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="passingYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="institute" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="specialization" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="educationType" type="{http://www.sample.project.com.au/services/model/EducationType/v1}EducationType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EducationSummaryInfo", propOrder = {
    "id",
    "fromDate",
    "todate",
    "courseName",
    "passingYear",
    "institute",
    "specialization",
    "educationType"
})
public class EducationSummaryInfo {

    protected long id;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected Calendar fromDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected Calendar todate;
    @XmlElement(required = true)
    protected String courseName;
    protected int passingYear;
    @XmlElement(required = true)
    protected String institute;
    @XmlElement(required = true)
    protected String specialization;
    @XmlElement(required = true)
    protected EducationType educationType;

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
    public Calendar getFromDate() {
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
    public void setFromDate(Calendar value) {
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
    public Calendar getTodate() {
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
    public void setTodate(Calendar value) {
        this.todate = value;
    }

    /**
     * Gets the value of the courseName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * Sets the value of the courseName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourseName(String value) {
        this.courseName = value;
    }

    /**
     * Gets the value of the passingYear property.
     * 
     */
    public int getPassingYear() {
        return passingYear;
    }

    /**
     * Sets the value of the passingYear property.
     * 
     */
    public void setPassingYear(int value) {
        this.passingYear = value;
    }

    /**
     * Gets the value of the institute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstitute() {
        return institute;
    }

    /**
     * Sets the value of the institute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstitute(String value) {
        this.institute = value;
    }

    /**
     * Gets the value of the specialization property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialization() {
        return specialization;
    }

    /**
     * Sets the value of the specialization property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialization(String value) {
        this.specialization = value;
    }

    /**
     * Gets the value of the educationType property.
     * 
     * @return
     *     possible object is
     *     {@link EducationType }
     *     
     */
    public EducationType getEducationType() {
        return educationType;
    }

    /**
     * Sets the value of the educationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EducationType }
     *     
     */
    public void setEducationType(EducationType value) {
        this.educationType = value;
    }

}
