package au.com.project.sample.services.admin.deletestate;

import org.springframework.beans.factory.annotation.Autowired;

import au.com.project.sample.process.StateController;
import au.com.project.sample.process.impl.dto.CountryDTO;
import au.com.project.sample.process.impl.dto.StateDTO;
import au.com.project.sample.services.model.CountryInfo;
import au.com.project.sample.services.model.StateInfo;

public class DeleteStateManager {

	@Autowired
	private StateController stateController;

	private StateDTO populateStateDTO(DeleteStateRequest deleteStateRequest) {
		StateDTO stateDTO = new StateDTO();
		StateInfo state = deleteStateRequest.getMessage().getStateInfo();

		stateDTO.setCode(state.getCode());
		stateDTO.setName(state.getName());

		CountryInfo country = deleteStateRequest.getMessage().getStateInfo()
				.getCountryInfo();

		CountryDTO countryDTO = new CountryDTO();
		countryDTO.setCode(country.getCode());

		stateDTO.setCountryDTO(countryDTO);
		return stateDTO;
	}

	public DeleteStateResponse deleteStateResponse(
			DeleteStateRequest deleteStateRequest) {

		DeleteStateResponse deleteStateResponse = new DeleteStateResponse();

		deleteStateResponse.setMessage(new DeleteStateResponse.Message());

		stateController.deleteState(populateStateDTO(deleteStateRequest));

		deleteStateResponse.getMessage().setStatus(true);

		return deleteStateResponse;

	}

	public StateController getStateController() {
		return stateController;
	}

	public void setStateController(StateController stateController) {
		this.stateController = stateController;
	}

}
