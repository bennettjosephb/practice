package au.com.project.sample.services.account.createemploymentsummary;

import org.springframework.beans.factory.annotation.Autowired;

import au.com.project.sample.process.EmploymentSummaryController;
import au.com.project.sample.process.impl.dto.EmploymentSummaryDTO;
import au.com.project.sample.services.model.EmploymentSummaryInfo;

public class CreateEmploymentSummaryManager {

	@Autowired
	private EmploymentSummaryController employmentSummaryController;

	private EmploymentSummaryDTO updateEmploymentSummaryDTO(
			CreateEmploymentSummaryRequest createEmploymentSummaryRequest) {
		EmploymentSummaryDTO employmentSummaryDTO = new EmploymentSummaryDTO();

		EmploymentSummaryInfo employmentSummaryInfo = createEmploymentSummaryRequest
				.getMessage().getEmploymentSummaryInfo();
		
		employmentSummaryDTO.setDesignation(employmentSummaryInfo
				.getDesignation());
		employmentSummaryDTO.setEntityName(employmentSummaryInfo
				.getEntityName());
		employmentSummaryDTO.setFromDate(employmentSummaryInfo.getFromDate());
		employmentSummaryDTO.setJoiningDesignation(employmentSummaryInfo.getJoiningDesignation());
		employmentSummaryDTO.setJoiningSalary(employmentSummaryInfo
				.getJoiningSalary());
		employmentSummaryDTO.setLeavingDesignation(employmentSummaryInfo
				.getLeavingDesignation());
		employmentSummaryDTO.setLeavingSalary(employmentSummaryInfo.getLeavingSalary());
		employmentSummaryDTO.setSalary(employmentSummaryInfo.getSalary());
		employmentSummaryDTO.setTodate(employmentSummaryInfo.getTodate());
		

		return employmentSummaryDTO;
	}

	public CreateEmploymentSummaryResponse createEmploymentSummaryResponse(
			CreateEmploymentSummaryRequest createEmploymentSummaryRequest) {
		CreateEmploymentSummaryResponse createEmploymentSummaryResponse = new CreateEmploymentSummaryResponse();

		createEmploymentSummaryResponse
				.setMessage(new CreateEmploymentSummaryResponse.Message());

		employmentSummaryController
				.createEmploymentSummary(updateEmploymentSummaryDTO(createEmploymentSummaryRequest));

		createEmploymentSummaryResponse.getMessage().setStatus(true);

		return createEmploymentSummaryResponse;
	}

	public EmploymentSummaryController getEmploymentSummaryController() {
		return employmentSummaryController;
	}

	public void setEmploymentSummaryController(
			EmploymentSummaryController employmentSummaryController) {
		this.employmentSummaryController = employmentSummaryController;
	}

}
