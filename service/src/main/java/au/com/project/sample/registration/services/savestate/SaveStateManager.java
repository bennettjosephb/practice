package au.com.project.sample.registration.services.savestate;

import org.springframework.beans.factory.annotation.Autowired;

import au.com.project.sample.process.StateController;
import au.com.project.sample.process.impl.dto.CountryDTO;
import au.com.project.sample.process.impl.dto.StateDTO;
import au.com.project.sample.registration.model.Country;
import au.com.project.sample.registration.model.State;

public class SaveStateManager {

	@Autowired
	private StateController stateController;

	private StateDTO updateStateDTO(SaveStateRequest saveStateRequest) {
		StateDTO stateDTO = new StateDTO();
		State state = saveStateRequest.getMessage().getState();

		stateDTO.setCode(state.getCode());
		stateDTO.setName(state.getName());

		Country country = saveStateRequest.getMessage().getState().getCountry();

		CountryDTO countryDTO = new CountryDTO();
		countryDTO.setCode(country.getCode());

		stateDTO.setCountryDTO(countryDTO);
		return stateDTO;
	}

	public SaveStateResponse saveStateResponse(SaveStateRequest saveStateRequest) {

		SaveStateResponse saveStateResponse = new SaveStateResponse();

		saveStateResponse.setMessage(new SaveStateResponse.Message());

		stateController.createState(updateStateDTO(saveStateRequest));

		saveStateResponse.getMessage().setStatus(true);

		return saveStateResponse;

	}

	public StateController getStateController() {
		return stateController;
	}

	public void setStateController(StateController stateController) {
		this.stateController = stateController;
	}

}
