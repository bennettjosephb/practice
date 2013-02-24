package au.com.project.sample.services.admin.updatedesignation;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import au.com.project.sample.process.DesignationController;
import au.com.project.sample.process.impl.dto.DesignationDTO;
import au.com.project.sample.services.model.DesignationInfo;

public class UpdateDesignationManager {
	private static Logger log = Logger.getLogger(UpdateDesignationManager.class);

	@Autowired
	private DesignationController designationController;

	private DesignationDTO updateDesignationInfoDTO(
			UpdateDesignationRequest updateDesignationRequest) {
		DesignationDTO categoryInfoDTO = new DesignationDTO();

		DesignationInfo categoryInfo = updateDesignationRequest.getMessage()
				.getDesignationInfo();
		categoryInfoDTO.setCode(categoryInfo.getCode());
		categoryInfoDTO.setName(categoryInfo.getName());

		return categoryInfoDTO;
	}

	public UpdateDesignationResponse updateDesignationResponse(
			UpdateDesignationRequest updateDesignationRequest) {
		UpdateDesignationResponse updateDesignationResponse = new UpdateDesignationResponse();

		updateDesignationResponse.setMessage(new UpdateDesignationResponse.Message());

		designationController
				.updateDesignation(updateDesignationInfoDTO(updateDesignationRequest));

		updateDesignationResponse.getMessage().setStatus(true);

		return updateDesignationResponse;
	}

	public DesignationController getDesignationController() {
		return designationController;
	}

	public void setDesignationController(DesignationController designationController) {
		this.designationController = designationController;
	}


}
