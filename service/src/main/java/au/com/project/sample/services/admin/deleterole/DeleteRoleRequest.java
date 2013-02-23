
package au.com.project.sample.services.admin.deleterole;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import au.com.project.sample.common.message.Request;
import au.com.project.sample.services.model.roleinfo.v1.RoleInfo;


/**
 * <p>Java class for DeleteRoleRequest complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="DeleteRoleRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sample.project.com.au/common/message/Request/v1}Request">
 *       &lt;sequence>
 *         &lt;element name="message">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="roleInfo" type="{http://www.sample.project.com.au/services/model/RoleInfo/v1}RoleInfo"/>
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
@XmlType(name = "DeleteRoleRequest", propOrder = {
    "message"
})
public class DeleteRoleRequest
    extends Request
{

    @XmlElement(required = true)
    protected DeleteRoleRequest.Message message;

    /**
     * Gets the value of the message property.
     *
     * @return
     *     possible object is
     *     {@link DeleteRoleRequest.Message }
     *
     */
    public DeleteRoleRequest.Message getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     *
     * @param value
     *     allowed object is
     *     {@link DeleteRoleRequest.Message }
     *
     */
    public void setMessage(DeleteRoleRequest.Message value) {
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
     *         &lt;element name="roleInfo" type="{http://www.sample.project.com.au/services/model/RoleInfo/v1}RoleInfo"/>
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
        "roleInfo"
    })
    public static class Message {

        @XmlElement(required = true)
        protected RoleInfo roleInfo;

        /**
         * Gets the value of the roleInfo property.
         *
         * @return
         *     possible object is
         *     {@link RoleInfo }
         *
         */
        public RoleInfo getRoleInfo() {
            return roleInfo;
        }

        /**
         * Sets the value of the roleInfo property.
         *
         * @param value
         *     allowed object is
         *     {@link RoleInfo }
         *
         */
        public void setRoleInfo(RoleInfo value) {
            this.roleInfo = value;
        }

    }

}
