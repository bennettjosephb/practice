package au.com.project.sample.services.admin.deletedesignation;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import au.com.project.sample.process.DesignationController;
import au.com.project.sample.process.impl.dto.DesignationDTO;
import au.com.project.sample.services.model.DesignationInfo;

public class DeleteDesignationManager {

	private static Logger log = Logger
			.getLogger(DeleteDesignationManager.class);

	@Autowired
	private DesignationController designationController;

	private DesignationDTO updateDesignationInfoDTO(
			DeleteDesignationRequest deleteDesignationRequest) {
		DesignationDTO designationInfoDTO = new DesignationDTO();

		DesignationInfo designationInfo = deleteDesignationRequest.getMessage()
				.getDesignationInfo();
		designationInfoDTO.setCode(designationInfo.getCode());
		designationInfoDTO.setName(designationInfo.getName());

		return designationInfoDTO;
	}

	public DeleteDesignationResponse deleteDesignationResponse(
			DeleteDesignationRequest deleteDesignationRequest) {
		DeleteDesignationResponse deleteDesignationResponse = new DeleteDesignationResponse();

		deleteDesignationResponse
				.setMessage(new DeleteDesignationResponse.Message());

		designationController
				.deleteDesignation(updateDesignationInfoDTO(deleteDesignationRequest));

		deleteDesignationResponse.getMessage().setStatus(true);

		return deleteDesignationResponse;
	}

	public DesignationController getDesignationController() {
		return designationController;
	}

	public void setDesignationController(
			DesignationController designationController) {
		this.designationController = designationController;
	}

}
