
package au.com.project.sample.services.model.subcategoryinfo.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import au.com.project.sample.services.model.categoryinfo.v1.CategoryInfo;


/**
 * <p>Java class for SubCategoryInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubCategoryInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="categoryInfo" type="{http://www.sample.project.com.au/services/model/CategoryInfo/v1}CategoryInfo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubCategoryInfo", propOrder = {
    "id",
    "name",
    "code",
    "categoryInfo"
})
public class SubCategoryInfo {

    protected long id;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String code;
    @XmlElement(required = true)
    protected CategoryInfo categoryInfo;

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
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the categoryInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CategoryInfo }
     *     
     */
    public CategoryInfo getCategoryInfo() {
        return categoryInfo;
    }

    /**
     * Sets the value of the categoryInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CategoryInfo }
     *     
     */
    public void setCategoryInfo(CategoryInfo value) {
        this.categoryInfo = value;
    }

}
