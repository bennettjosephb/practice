package au.com.project.sample.process.impl.dto;

import java.util.Calendar;

public class EmploymentSummaryDTO {

	private long id;
	private Calendar fromDate;
	private Calendar todate;
	private String entityName;
	private String designation;
	private String joiningDesignation;
	private String leavingDesignation;
	private SalaryDTO salary;
	private SalaryDTO joiningSalary;
	private SalaryDTO leavingSalary;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Calendar getFromDate() {
		return fromDate;
	}

	public void setFromDate(Calendar fromDate) {
		this.fromDate = fromDate;
	}

	public Calendar getTodate() {
		return todate;
	}

	public void setTodate(Calendar todate) {
		this.todate = todate;
	}

	public String getEntityName() {
		return entityName;
	}

	public void setEntityName(String entityName) {
		this.entityName = entityName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getJoiningDesignation() {
		return joiningDesignation;
	}

	public void setJoiningDesignation(String joiningDesignation) {
		this.joiningDesignation = joiningDesignation;
	}

	public String getLeavingDesignation() {
		return leavingDesignation;
	}

	public void setLeavingDesignation(String leavingDesignation) {
		this.leavingDesignation = leavingDesignation;
	}

	public SalaryDTO getSalary() {
		return salary;
	}

	public void setSalary(SalaryDTO salary) {
		this.salary = salary;
	}

	public SalaryDTO getJoiningSalary() {
		return joiningSalary;
	}

	public void setJoiningSalary(SalaryDTO joiningSalary) {
		this.joiningSalary = joiningSalary;
	}

	public SalaryDTO getLeavingSalary() {
		return leavingSalary;
	}

	public void setLeavingSalary(SalaryDTO leavingSalary) {
		this.leavingSalary = leavingSalary;
	}

}
