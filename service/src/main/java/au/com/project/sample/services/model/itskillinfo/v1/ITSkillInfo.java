
package au.com.project.sample.services.model.itskillinfo.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ITSkillInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ITSkillInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lastUsed" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="experienceYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="experienceMonth" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="applicantId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ITSkillInfo", propOrder = {
    "id",
    "name",
    "version",
    "lastUsed",
    "experienceYear",
    "experienceMonth",
    "applicantId"
})
public class ITSkillInfo {

    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long id;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String version;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer lastUsed;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer experienceYear;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer experienceMonth;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long applicantId;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the lastUsed property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLastUsed() {
        return lastUsed;
    }

    /**
     * Sets the value of the lastUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLastUsed(Integer value) {
        this.lastUsed = value;
    }

    /**
     * Gets the value of the experienceYear property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExperienceYear() {
        return experienceYear;
    }

    /**
     * Sets the value of the experienceYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExperienceYear(Integer value) {
        this.experienceYear = value;
    }

    /**
     * Gets the value of the experienceMonth property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExperienceMonth() {
        return experienceMonth;
    }

    /**
     * Sets the value of the experienceMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExperienceMonth(Integer value) {
        this.experienceMonth = value;
    }

    /**
     * Gets the value of the applicantId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getApplicantId() {
        return applicantId;
    }

    /**
     * Sets the value of the applicantId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setApplicantId(Long value) {
        this.applicantId = value;
    }

}
