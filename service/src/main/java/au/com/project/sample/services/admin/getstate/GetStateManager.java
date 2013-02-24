package au.com.project.sample.services.admin.getstate;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import au.com.project.sample.process.StateController;
import au.com.project.sample.process.impl.dto.StateDTO;
import au.com.project.sample.services.model.StateInfo;

public class GetStateManager {

	@Autowired
	private StateController stateController;

	private List<StateInfo> updateStateInfo(List<StateDTO> getStateRequest) {
		List<StateInfo> currencyInfo = new ArrayList<StateInfo>();
		// StateInfo currency = getStateRequest.getMessage().getStateInfo();
		// currencyDTO.setCode(currency.getCode());
		// currencyDTO.setName(currency.getName());
		return currencyInfo;
	}

	public GetStateResponse getStateResponse(GetStateRequest getStateRequest) {

		GetStateResponse getStateResponse = new GetStateResponse();

		getStateResponse.setMessage(new GetStateResponse.Message());

		// updateStateInfo(currencyController.findAllState());

		getStateResponse.getMessage().getStateInfo()
				.addAll(updateStateInfo(stateController.findAllStates()));

		// getStateResponse.getMessage().setStatus(true);

		return getStateResponse;

	}

	public StateController getStateController() {
		return stateController;
	}

	public void setStateController(StateController stateController) {
		this.stateController = stateController;
	}
}
