package au.com.project.sample.services.admin.createstate;

import org.springframework.beans.factory.annotation.Autowired;

import au.com.project.sample.process.StateController;
import au.com.project.sample.process.impl.dto.CountryDTO;
import au.com.project.sample.process.impl.dto.StateDTO;
import au.com.project.sample.services.model.CountryInfo;
import au.com.project.sample.services.model.StateInfo;

public class CreateStateManager {

	@Autowired
	private StateController stateController;

	private StateDTO populateStateDTO(CreateStateRequest createStateRequest) {
		StateDTO stateDTO = new StateDTO();
		StateInfo state = createStateRequest.getMessage().getStateInfo();

		stateDTO.setCode(state.getCode());
		stateDTO.setName(state.getName());

		CountryInfo country = createStateRequest.getMessage().getStateInfo()
				.getCountryInfo();

		CountryDTO countryDTO = new CountryDTO();
		countryDTO.setCode(country.getCode());

		stateDTO.setCountryDTO(countryDTO);
		return stateDTO;
	}

	public CreateStateResponse createStateResponse(
			CreateStateRequest createStateRequest) {

		CreateStateResponse createStateResponse = new CreateStateResponse();

		createStateResponse.setMessage(new CreateStateResponse.Message());

		stateController.createState(populateStateDTO(createStateRequest));

		createStateResponse.getMessage().setStatus(true);

		return createStateResponse;

	}

	public StateController getStateController() {
		return stateController;
	}

	public void setStateController(StateController stateController) {
		this.stateController = stateController;
	}

}
