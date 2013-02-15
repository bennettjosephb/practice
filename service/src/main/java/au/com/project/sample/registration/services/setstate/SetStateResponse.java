
package au.com.project.sample.registration.services.setstate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import au.com.project.sample.common.message.ResponseMessage;
import au.com.project.sample.registration.model.State;


/**
 * <p>Java class for SetStateResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SetStateResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sample.project.com.au/common/message/ResponseMessage/v1}ResponseMessage">
 *       &lt;sequence>
 *         &lt;element name="state" type="{http://www.sample.project.com.au/registration/model/State/v1}State"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetStateResponse", propOrder = {
    "state"
})
public class SetStateResponse
    extends ResponseMessage
{

    @XmlElement(required = true)
    protected State state;

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link State }
     *     
     */
    public State getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link State }
     *     
     */
    public void setState(State value) {
        this.state = value;
    }

}
