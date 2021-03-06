
package au.com.project.sample.services.admin.updatesubcategory;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import au.com.project.sample.common.message.Request;
import au.com.project.sample.services.model.SubCategoryInfo;


/**
 * <p>Java class for UpdateSubCategoryRequest complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="UpdateSubCategoryRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sample.project.com.au/common/message/Request/v1}Request">
 *       &lt;sequence>
 *         &lt;element name="message">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="subCategoryInfo" type="{http://www.sample.project.com.au/services/model/SubCategoryInfo/v1}SubCategoryInfo"/>
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
@XmlType(name = "UpdateSubCategoryRequest", propOrder = {
    "message"
})
public class UpdateSubCategoryRequest
    extends Request
{

    @XmlElement(required = true)
    protected UpdateSubCategoryRequest.Message message;

    /**
     * Gets the value of the message property.
     *
     * @return
     *     possible object is
     *     {@link UpdateSubCategoryRequest.Message }
     *
     */
    public UpdateSubCategoryRequest.Message getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     *
     * @param value
     *     allowed object is
     *     {@link UpdateSubCategoryRequest.Message }
     *
     */
    public void setMessage(UpdateSubCategoryRequest.Message value) {
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
     *         &lt;element name="subCategoryInfo" type="{http://www.sample.project.com.au/services/model/SubCategoryInfo/v1}SubCategoryInfo"/>
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
        "subCategoryInfo"
    })
    public static class Message {

        @XmlElement(required = true)
        protected SubCategoryInfo subCategoryInfo;

        /**
         * Gets the value of the subCategoryInfo property.
         *
         * @return
         *     possible object is
         *     {@link SubCategoryInfo }
         *
         */
        public SubCategoryInfo getSubCategoryInfo() {
            return subCategoryInfo;
        }

        /**
         * Sets the value of the subCategoryInfo property.
         *
         * @param value
         *     allowed object is
         *     {@link SubCategoryInfo }
         *
         */
        public void setSubCategoryInfo(SubCategoryInfo value) {
            this.subCategoryInfo = value;
        }

    }

}
