package au.com.project.sample.process.impl.dto;

import java.util.Calendar;

import au.com.project.sample.services.model.SalaryInfo;

public class EmploymentSummaryDTO {

	private long id;
	private Calendar fromDate;
	private Calendar todate;
	private String entityName;
	private String designation;
	private String joiningDesignation;
	private String leavingDesignation;
    private SalaryInfo salary;
    private SalaryInfo joiningSalary;
    private SalaryInfo leavingSalary;

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

	public SalaryInfo getSalary() {
		return salary;
	}

	public void setSalary(SalaryInfo salary) {
		this.salary = salary;
	}

	public SalaryInfo getJoiningSalary() {
		return joiningSalary;
	}

	public void setJoiningSalary(SalaryInfo joiningSalary) {
		this.joiningSalary = joiningSalary;
	}

	public SalaryInfo getLeavingSalary() {
		return leavingSalary;
	}

	public void setLeavingSalary(SalaryInfo leavingSalary) {
		this.leavingSalary = leavingSalary;
	}

}
