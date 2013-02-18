package au.com.project.sample.services.model;

import java.util.Calendar;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * Java class for UserInfo complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="UserInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="confirmPassword" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="gender" type="{http://www.sample.project.com.au/services/model/Gender/v1}Gender"/>
 *         &lt;element name="phoneNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="emailId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="location" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dateOfBirth" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserInfo", propOrder = { "firstName", "lastName", "username",
		"password", "confirmPassword", "gender", "phoneNumber", "emailId",
		"location", "dateOfBirth" })
public class UserInfo {

	@XmlElement(required = true)
	protected String firstName;
	@XmlElement(required = true)
	protected String lastName;
	@XmlElement(required = true)
	protected String username;
	@XmlElement(required = true)
	protected String password;
	@XmlElement(required = true)
	protected String confirmPassword;
	@XmlElement(required = true)
	protected Gender gender;
	@XmlElement(required = true)
	protected String phoneNumber;
	@XmlElement(required = true)
	protected String emailId;
	@XmlElement(required = true)
	protected String location;
	@XmlElement(required = true)
	@XmlSchemaType(name = "date")
	protected Calendar dateOfBirth;

	/**
	 * Gets the value of the firstName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Sets the value of the firstName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setFirstName(String value) {
		this.firstName = value;
	}

	/**
	 * Gets the value of the lastName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Sets the value of the lastName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setLastName(String value) {
		this.lastName = value;
	}

	/**
	 * Gets the value of the username property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * Sets the value of the username property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setUsername(String value) {
		this.username = value;
	}

	/**
	 * Gets the value of the password property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Sets the value of the password property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPassword(String value) {
		this.password = value;
	}

	/**
	 * Gets the value of the confirmPassword property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getConfirmPassword() {
		return confirmPassword;
	}

	/**
	 * Sets the value of the confirmPassword property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setConfirmPassword(String value) {
		this.confirmPassword = value;
	}

	/**
	 * Gets the value of the gender property.
	 * 
	 * @return possible object is {@link Gender }
	 * 
	 */
	public Gender getGender() {
		return gender;
	}

	/**
	 * Sets the value of the gender property.
	 * 
	 * @param value
	 *            allowed object is {@link Gender }
	 * 
	 */
	public void setGender(Gender value) {
		this.gender = value;
	}

	/**
	 * Gets the value of the phoneNumber property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * Sets the value of the phoneNumber property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPhoneNumber(String value) {
		this.phoneNumber = value;
	}

	/**
	 * Gets the value of the emailId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEmailId() {
		return emailId;
	}

	/**
	 * Sets the value of the emailId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setEmailId(String value) {
		this.emailId = value;
	}

	/**
	 * Gets the value of the location property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * Sets the value of the location property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setLocation(String value) {
		this.location = value;
	}

	/**
	 * Gets the value of the dateOfBirth property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public Calendar getDateOfBirth() {
		return dateOfBirth;
	}

	/**
	 * Sets the value of the dateOfBirth property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setDateOfBirth(Calendar value) {
		this.dateOfBirth = value;
	}

}
