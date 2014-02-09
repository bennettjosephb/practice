package au.com.showcase.application.model;

import java.util.Calendar;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "SHOWCASE_PERSON")
public abstract class Person  implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2750720082384075724L;
	
	@Version
    @Column(name="OPTLOCK")
	private Long version;
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "PERSON_ID")
	private Long id;

	@Column(name = "PERSON_FIRST_NAME", nullable = false)
	private String firstName;

	@Column(name = "PERSON_LAST_NAME", nullable = false)
	private String lastName;

	@Column(name = "PERSON_MOBILE_NUMBER", nullable = false)
	private String mobileNumber;

	@Column(name = "PERSON_PHONE_NUMBER", nullable = false)
	private String phoneNumber;

	@Column(name = "PERSON_EMAIL_ID", nullable = false)
	private String emailId;

	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "ADDRESS_ID", insertable = true, updatable = true, unique = true)
	private Address address;

	@Column(name = "PERSON_DOB", nullable = false)
	@Temporal(TemporalType.DATE)
	private Calendar dob;

	@Column(name = "PERSON_GENDER", nullable = false)
	@Enumerated(EnumType.STRING)
	private Gender gender;

	@Column(name = "PERSON_NATIONALITY", nullable = false)
	private String nationality;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Calendar getDob() {
		return dob;
	}

	public void setDob(Calendar dob) {
		this.dob = dob;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

}
