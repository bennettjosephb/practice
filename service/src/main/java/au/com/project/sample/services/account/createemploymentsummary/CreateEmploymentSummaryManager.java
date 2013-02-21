package au.com.project.sample.services.account.createemploymentsummary;

import org.springframework.beans.factory.annotation.Autowired;

import au.com.project.sample.process.EmploymentRoleController;
import au.com.project.sample.process.EmploymentSummaryController;

public class CreateEmploymentSummaryManager {
	
	@Autowired
	private EmploymentSummaryController employmentSummaryController;

	public EmploymentSummaryController getEmploymentSummaryController() {
		return employmentSummaryController;
	}

	public void setEmploymentSummaryController(
			EmploymentSummaryController employmentSummaryController) {
		this.employmentSummaryController = employmentSummaryController;
	}

}
