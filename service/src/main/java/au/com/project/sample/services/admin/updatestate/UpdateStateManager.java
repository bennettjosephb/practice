package au.com.project.sample.services.admin.updatestate;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import au.com.project.sample.process.StateController;
import au.com.project.sample.process.impl.dto.StateDTO;
import au.com.project.sample.services.admin.updatestate.UpdateStateManager;
import au.com.project.sample.services.admin.updatestate.UpdateStateRequest;
import au.com.project.sample.services.admin.updatestate.UpdateStateResponse;
import au.com.project.sample.services.model.StateInfo;

public class UpdateStateManager {
	

	private static Logger log = Logger.getLogger(UpdateStateManager.class);

	@Autowired
	private StateController stateController;

	private StateDTO updateStateInfoDTO(
			UpdateStateRequest updateStateRequest) {
		StateDTO categoryInfoDTO = new StateDTO();

		StateInfo categoryInfo = updateStateRequest.getMessage()
				.getStateInfo();
		categoryInfoDTO.setCode(categoryInfo.getCode());
		categoryInfoDTO.setName(categoryInfo.getName());

		return categoryInfoDTO;
	}

	public UpdateStateResponse updateStateResponse(
			UpdateStateRequest updateStateRequest) {
		UpdateStateResponse updateStateResponse = new UpdateStateResponse();

		updateStateResponse.setMessage(new UpdateStateResponse.Message());

		stateController
				.updateState(updateStateInfoDTO(updateStateRequest));

		updateStateResponse.getMessage().setStatus(true);

		return updateStateResponse;
	}

	public StateController getStateController() {
		return stateController;
	}

	public void setStateController(StateController stateController) {
		this.stateController = stateController;
	}


	

}
