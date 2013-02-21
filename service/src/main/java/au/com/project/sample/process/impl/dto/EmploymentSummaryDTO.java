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
	private int salary;
	private int joiningSalary;
	private int leavingSalary;

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

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getJoiningSalary() {
		return joiningSalary;
	}

	public void setJoiningSalary(int joiningSalary) {
		this.joiningSalary = joiningSalary;
	}

	public int getLeavingSalary() {
		return leavingSalary;
	}

	public void setLeavingSalary(int leavingSalary) {
		this.leavingSalary = leavingSalary;
	}

}
