package au.com.project.sample.services.admin.createdesignation;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import au.com.project.sample.process.DesignationController;
import au.com.project.sample.process.impl.dto.DesignationDTO;
import au.com.project.sample.services.model.DesignationInfo;

public class CreateDesignationManager {

	private static Logger log = Logger
			.getLogger(CreateDesignationManager.class);

	@Autowired
	private DesignationController designationController;

	private DesignationDTO updateDesignationInfoDTO(
			CreateDesignationRequest createDesignationRequest) {
		DesignationDTO designationInfoDTO = new DesignationDTO();

		DesignationInfo designationInfo = createDesignationRequest.getMessage()
				.getDesignationInfo();
		designationInfoDTO.setCode(designationInfo.getCode());
		designationInfoDTO.setName(designationInfo.getName());

		return designationInfoDTO;
	}

	public CreateDesignationResponse createDesignationResponse(
			CreateDesignationRequest createDesignationRequest) {
		CreateDesignationResponse createDesignationResponse = new CreateDesignationResponse();

		createDesignationResponse
				.setMessage(new CreateDesignationResponse.Message());

		designationController
				.createDesignation(updateDesignationInfoDTO(createDesignationRequest));
		
		createDesignationResponse.getMessage().setStatus(true);

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
