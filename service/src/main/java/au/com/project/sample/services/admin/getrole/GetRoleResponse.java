
package au.com.project.sample.services.admin.getrole;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import au.com.project.sample.common.message.ResponseMessage;
import au.com.project.sample.services.model.roleinfo.v1.RoleInfo;


/**
 * <p>Java class for GetRoleResponse complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="GetRoleResponse">
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
 *                   &lt;element name="roles" type="{http://www.sample.project.com.au/services/model/RoleInfo/v1}RoleInfo"/>
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
@XmlType(name = "GetRoleResponse", propOrder = {
    "message"
})
public class GetRoleResponse
    extends ResponseMessage
{

    @XmlElement(required = true)
    protected GetRoleResponse.Message message;

    /**
     * Gets the value of the message property.
     *
     * @return
     *     possible object is
     *     {@link GetRoleResponse.Message }
     *
     */
    public GetRoleResponse.Message getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     *
     * @param value
     *     allowed object is
     *     {@link GetRoleResponse.Message }
     *
     */
    public void setMessage(GetRoleResponse.Message value) {
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
     *         &lt;element name="roles" type="{http://www.sample.project.com.au/services/model/RoleInfo/v1}RoleInfo"/>
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
        "roles"
    })
    public static class Message {

        protected boolean status;
        @XmlElement(required = true)
        protected String description;
        @XmlElement(required = true)
        protected RoleInfo roles;

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
         * Gets the value of the roles property.
         *
         * @return
         *     possible object is
         *     {@link RoleInfo }
         *
         */
        public RoleInfo getRoles() {
            return roles;
        }

        /**
         * Sets the value of the roles property.
         *
         * @param value
         *     allowed object is
         *     {@link RoleInfo }
         *
         */
        public void setRoles(RoleInfo value) {
            this.roles = value;
        }

    }

}
