package com.gwt.sample.client.login.createaccount;

import com.gwtplatform.dispatch.shared.Result;
import java.lang.Boolean;

public class CreateAccountActionResult implements Result {

	private Boolean status;
	private String description;

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@SuppressWarnings("unused")
	private CreateAccountActionResult() {
		// For serialization only
	}

	public CreateAccountActionResult(Boolean status, String description) {
		this.status = status;
		this.description = description;
	}

}
