package au.com.project.sample.process.impl.dto;

import java.util.Calendar;

import au.com.project.sample.services.model.EducationType;

public class EducationSummaryDTO {

	private long id;
	private Calendar fromDate;
	private Calendar todate;
	private String courseName;
	private int passingYear;
	private String institute;
	private String specialization;
	private EducationType educationType;

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

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getPassingYear() {
		return passingYear;
	}

	public void setPassingYear(int passingYear) {
		this.passingYear = passingYear;
	}

	public String getInstitute() {
		return institute;
	}

	public void setInstitute(String institute) {
		this.institute = institute;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public EducationType getEducationType() {
		return educationType;
	}

	public void setEducationType(EducationType educationType) {
		this.educationType = educationType;
	}
}
