package com.gwt.sample.client.login.createaccount;

import com.gwtplatform.dispatch.shared.ActionImpl;

public class CreateAccountAction extends ActionImpl<CreateAccountActionResult> {

	private String username;
	private String password;
	private String confirmPassword;

	public Integer getDate() {
		return date;
	}

	private Integer date;
	private Integer month;
	private Integer year;
	private String gender;
	private String location;
	private String phoneNumber;
	private String firstName;
	private String lastName;

	@SuppressWarnings("unused")
	private CreateAccountAction() {
		// For serialization only
	}

	@Override
	public boolean isSecured() {
		return false;
	}

	public CreateAccountAction(String username, String password,
			String confirmPassword, Integer date, Integer month, Integer year,
			String gender, String location, String phoneNumber,
			String firstName, String lastName) {
		this.username = username;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.date = date;
		this.month = month;
		this.year = year;
		this.gender = gender;
		this.location = location;
		this.phoneNumber = phoneNumber;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public void setDate(Integer date) {
		this.date = date;
	}

	public Integer getMonth() {
		return month;
	}

	public void setMonth(Integer month) {
		this.month = month;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public String getGender() {
		return gender;
	}

	public String getLocation() {
		return location;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
}
