package com.gwt.sample.client.content.action;

import com.gwtplatform.dispatch.shared.ActionImpl;

public class ContactDetails extends ActionImpl<ContactDetailsResult> {

	private String temporaryStreet1;
	private String temporaryStreet2;
	private String temporaryCity;
	private String temporaryState;
	private String temporaryZipCode;
	private String temporaryCountry;
	private String permanentStreet1;
	private String permanentStreet2;
	private String permanentCity;
	private String permanentState;
	private String permanentZipCode;
	private String permanentCountry;
	private String faxNumber;
	private String homeNumber;
	private String workNumber;
	private String mobileNumber;
	private String eMailId;
	private String copyAddress;

	@SuppressWarnings("unused")
	private ContactDetails() {
	}

	@Override
	public boolean isSecured() {
		return false;
	}

	public ContactDetails(String temporaryStreet1, String temporaryStreet2,
			String temporaryCity, String temporaryState,
			String temporaryZipCode, String temporaryCountry,
			String permanentStreet1, String permanentStreet2,
			String permanentCity, String permanentState,
			String permanentZipCode, String permanentCountry, String faxNumber,
			String homeNumber, String workNumber, String mobileNumber, String eMailId, 
			String copyAddress) {
		this.temporaryStreet1 = temporaryStreet1;
		this.temporaryStreet2 = temporaryStreet2;
		this.temporaryCity = temporaryCity;
		this.temporaryState = temporaryState;
		this.temporaryZipCode = temporaryZipCode;
		this.temporaryCountry = temporaryCountry;
		this.permanentStreet1 = permanentStreet1;
		this.permanentStreet2 = permanentStreet2;
		this.permanentCity = permanentCity;
		this.permanentState = permanentState;
		this.permanentZipCode = permanentZipCode;
		this.permanentCountry = permanentCountry;
		this.faxNumber = faxNumber;
		this.homeNumber = homeNumber;
		this.workNumber = workNumber;
		this.mobileNumber = mobileNumber;
		this.eMailId = eMailId;
		this.copyAddress = copyAddress;
	}

	public String getFaxNumber() {
		return faxNumber;
	}

	public void setFaxNumber(String faxNumber) {
		this.faxNumber = faxNumber;
	}

	public String getHomeNumber() {
		return homeNumber;
	}

	public void setHomeNumber(String homeNumber) {
		this.homeNumber = homeNumber;
	}

	public String getWorkNumber() {
		return workNumber;
	}

	public void setWorkNumber(String workNumber) {
		this.workNumber = workNumber;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getCopyAddress() {
		return copyAddress;
	}

	public void setCopyAddress(String copyAddress) {
		this.copyAddress = copyAddress;
	}

	public String getTemporaryStreet1() {
		return temporaryStreet1;
	}

	public void setTemporaryStreet1(String temporaryStreet1) {
		this.temporaryStreet1 = temporaryStreet1;
	}

	public String getTemporaryStreet2() {
		return temporaryStreet2;
	}

	public void setTemporaryStreet2(String temporaryStreet2) {
		this.temporaryStreet2 = temporaryStreet2;
	}

	public String getTemporaryCity() {
		return temporaryCity;
	}

	public void setTemporaryCity(String temporaryCity) {
		this.temporaryCity = temporaryCity;
	}

	public String getTemporaryState() {
		return temporaryState;
	}

	public void setTemporaryState(String temporaryState) {
		this.temporaryState = temporaryState;
	}

	public String getTemporaryZipCode() {
		return temporaryZipCode;
	}

	public void setTemporaryZipCode(String temporaryZipCode) {
		this.temporaryZipCode = temporaryZipCode;
	}

	public String getTemporaryCountry() {
		return temporaryCountry;
	}

	public void setTemporaryCountry(String temporaryCountry) {
		this.temporaryCountry = temporaryCountry;
	}

	public String getPermanentStreet1() {
		return permanentStreet1;
	}

	public void setPermanentStreet1(String permanentStreet1) {
		this.permanentStreet1 = permanentStreet1;
	}

	public String getPermanentStreet2() {
		return permanentStreet2;
	}

	public void setPermanentStreet2(String permanentStreet2) {
		this.permanentStreet2 = permanentStreet2;
	}

	public String getPermanentCity() {
		return permanentCity;
	}

	public void setPermanentCity(String permanentCity) {
		this.permanentCity = permanentCity;
	}

	public String getPermanentState() {
		return permanentState;
	}

	public void setPermanentState(String permanentState) {
		this.permanentState = permanentState;
	}

	public String getPermanentZipCode() {
		return permanentZipCode;
	}

	public void setPermanentZipCode(String permanentZipCode) {
		this.permanentZipCode = permanentZipCode;
	}

	public String getPermanentCountry() {
		return permanentCountry;
	}

	public void setPermanentCountry(String permanentCountry) {
		this.permanentCountry = permanentCountry;
	}

	public String geteMailId() {
		return eMailId;
	}

	public void seteMailId(String eMailId) {
		this.eMailId = eMailId;
	}

}
