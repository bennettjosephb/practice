package au.com.project.sample.domain;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Entity implementation class for Entity: JobDetail
 * 
 */
@Entity
@Table(name = "PROJECT_JOB_DETAIL")
public class JobDetail implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "JOB_DET_ID")
	private Long id;

	@Column(name = "JOB_DET_TITLE")
	private String title;

	@Column(name = "JOB_DET_ADVERTISER")
	private String advertiser;

	@Column(name = "JOB_DET_ADV_LINK")
	private String advertiserLink;

	@Column(name = "JOB_DET_ADDRESS")
	private Address address;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "JOB_REQ_SKIL_ID")
	private List<JobSkillSet> requiredSkills;

	@Column(name = "JOB_DET_COMMENTS")
	private String comment;

	@Column(name = "JOB_DET_TIME")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar time;

	@Column(name = "JOB_DET_JOB_LOCATION")
	private String jobLocation;

	@Column(name = "JOB_DET_WORK_TYPE")
	private String workType;

	@Column(name = "JOB_DET_CATEGORY")
	private Category category;

	@Column(name = "JOB_DET_SUB_CATEGORY")
	private SubCategory subCategory;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "JOB_DES_SKIL_ID")
	private List<JobSkillSet> desirableSkills;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "JOB_KEY_SKIL_ID")
	private List<JobSkillSet> keySkills;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "SAL_ID")
	private Salary salary;

	private static final long serialVersionUID = 1L;

	public JobDetail() {
		super();
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAdvertiser() {
		return this.advertiser;
	}

	public void setAdvertiser(String advertiser) {
		this.advertiser = advertiser;
	}

	public String getAdvertiserLink() {
		return this.advertiserLink;
	}

	public void setAdvertiserLink(String advertiserLink) {
		this.advertiserLink = advertiserLink;
	}

	public Address getAddress() {
		return this.address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<JobSkillSet> getRequiredSkills() {
		return this.requiredSkills;
	}

	public void setRequiredSkills(List<JobSkillSet> requiredSkills) {
		this.requiredSkills = requiredSkills;
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Calendar getTime() {
		return this.time;
	}

	public void setTime(Calendar time) {
		this.time = time;
	}

	public String getJobLocation() {
		return this.jobLocation;
	}

	public void setJobLocation(String jobLocation) {
		this.jobLocation = jobLocation;
	}

	public String getWorkType() {
		return this.workType;
	}

	public void setWorkType(String workType) {
		this.workType = workType;
	}

	public Category getCategory() {
		return this.category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public SubCategory getSubCategory() {
		return this.subCategory;
	}

	public void setSubCategory(SubCategory subCategory) {
		this.subCategory = subCategory;
	}

	public List<JobSkillSet> getDesirableSkills() {
		return this.desirableSkills;
	}

	public void setDesirableSkills(List<JobSkillSet> desirableSkills) {
		this.desirableSkills = desirableSkills;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<JobSkillSet> getKeySkills() {
		return keySkills;
	}

	public void setKeySkills(List<JobSkillSet> keySkills) {
		this.keySkills = keySkills;
	}

	public Salary getSalary() {
		return salary;
	}

	public void setSalary(Salary salary) {
		this.salary = salary;
	}

}