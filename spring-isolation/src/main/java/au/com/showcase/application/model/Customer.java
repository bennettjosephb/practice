package au.com.showcase.application.model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "SHOWCASE_CUSTOMER")
public class Customer extends Person {

	@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<IDProof> idProof = new ArrayList<IDProof>();

	@Column(name = "CUSTOMER_NAME")
	private String name;

	@Column(name = "CUSTOMER_VALUE")
	private String value;

	@Column(name = "CUSTOMER_CREATED_TIME", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar createdTime;

	@Column(name = "CUSTOMER_CREATED_DATE", nullable = false)
	@Temporal(TemporalType.DATE)
	private Calendar createdDate;

	public List<IDProof> getIdProof() {
		return idProof;
	}

	public void setIdProof(List<IDProof> idProof) {
		this.idProof = idProof;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Calendar getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Calendar createdTime) {
		this.createdTime = createdTime;
	}

	public Calendar getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Calendar createdDate) {
		this.createdDate = createdDate;
	}

	public String toString() {
		return ">>>>>>>>>>" + getId() + getEmailId() + getFirstName()
				+ getLastName() + getMobileNumber() + "<<<<<<<<<<<<<";
	}
}