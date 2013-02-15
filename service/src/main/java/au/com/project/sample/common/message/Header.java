
package au.com.project.sample.common.message;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Header", propOrder = {
    "from",
    "to",
    "eventTime",
    "requestId",
    "channelCode",
    "enduserCode",
    "usecaseName"
})
public class Header {

    @XmlElement(required = true)
    protected String from;
    @XmlElement(required = true)
    protected String to;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar eventTime;
    @XmlElement(required = true)
    protected String requestId;
    @XmlElement(required = true)
    protected String channelCode;
    @XmlElement(required = true)
    protected String enduserCode;
    @XmlElement(required = true)
    protected String usecaseName;

    /**
     * Gets the value of the from property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrom() {
        return from;
    }

    /**
     * Sets the value of the from property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrom(String value) {
        this.from = value;
    }

    /**
     * Gets the value of the to property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTo() {
        return to;
    }

    /**
     * Sets the value of the to property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTo(String value) {
        this.to = value;
    }

    /**
     * Gets the value of the eventTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEventTime() {
        return eventTime;
    }

    /**
     * Sets the value of the eventTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEventTime(XMLGregorianCalendar value) {
        this.eventTime = value;
    }

    /**
     * Gets the value of the requestId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * Sets the value of the requestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestId(String value) {
        this.requestId = value;
    }

    /**
     * Gets the value of the channelCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelCode() {
        return channelCode;
    }

    /**
     * Sets the value of the channelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelCode(String value) {
        this.channelCode = value;
    }

    /**
     * Gets the value of the enduserCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnduserCode() {
        return enduserCode;
    }

    /**
     * Sets the value of the enduserCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnduserCode(String value) {
        this.enduserCode = value;
    }

    /**
     * Gets the value of the usecaseName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsecaseName() {
        return usecaseName;
    }

    /**
     * Sets the value of the usecaseName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsecaseName(String value) {
        this.usecaseName = value;
    }

}
