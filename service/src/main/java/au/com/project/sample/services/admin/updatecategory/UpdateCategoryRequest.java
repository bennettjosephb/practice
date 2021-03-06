
package au.com.project.sample.services.admin.updatecategory;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import au.com.project.sample.common.message.Request;
import au.com.project.sample.services.model.CategoryInfo;


/**
 * <p>Java class for UpdateCategoryRequest complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="UpdateCategoryRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sample.project.com.au/common/message/Request/v1}Request">
 *       &lt;sequence>
 *         &lt;element name="message">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="categoryInfo" type="{http://www.sample.project.com.au/services/model/CategoryInfo/v1}CategoryInfo"/>
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
@XmlType(name = "UpdateCategoryRequest", propOrder = {
    "message"
})
public class UpdateCategoryRequest
    extends Request
{

    @XmlElement(required = true)
    protected UpdateCategoryRequest.Message message;

    /**
     * Gets the value of the message property.
     *
     * @return
     *     possible object is
     *     {@link UpdateCategoryRequest.Message }
     *
     */
    public UpdateCategoryRequest.Message getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     *
     * @param value
     *     allowed object is
     *     {@link UpdateCategoryRequest.Message }
     *
     */
    public void setMessage(UpdateCategoryRequest.Message value) {
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
    @XmlType(name = "", propOrder = {
        "categoryInfo"
    })
    public static class Message {

        @XmlElement(required = true)
        protected CategoryInfo categoryInfo;

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

}
