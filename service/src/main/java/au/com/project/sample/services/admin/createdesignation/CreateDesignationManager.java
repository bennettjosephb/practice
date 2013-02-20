package au.com.project.sample.services.admin.createdesignation;

import au.com.project.sample.process.DesignationController;

public class CreateDesignationManager {

	private DesignationController designationController;

	public CreateDesignationResponse createDesignationResponse(
			CreateDesignationRequest createDesignationRequest) {
		CreateDesignationResponse createDesignationResponse = new CreateDesignationResponse();

		createDesignationResponse
				.setMessage(new CreateDesignationResponse.Message());

		designationController.createDesignation(null);

		return createDesignationResponse;
	}

	public DesignationController getDesignationController() {
		return designationController;
	}

	public void setDesignationController(
			DesignationController designationController) {
		this.designationController = designationController;
	}

}
