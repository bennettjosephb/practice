package au.com.project.sample.services.admin.createcity;

import org.springframework.beans.factory.annotation.Autowired;

import au.com.project.sample.process.CityController;
import au.com.project.sample.process.impl.dto.CityDTO;
import au.com.project.sample.process.impl.dto.StateDTO;
import au.com.project.sample.services.model.CityInfo;
import au.com.project.sample.services.model.StateInfo;

public class CreateCityManager {

	@Autowired
	private CityController cityController;

	private CityDTO updateCityDTO(CreateCityRequest createCityRequest) {
		CityDTO cityDTO = new CityDTO();
		
		CityInfo city = createCityRequest.getMessage().getCityInfo();
		cityDTO.setCode(city.getCode());
		cityDTO.setName(city.getName());
		
		StateInfo state = createCityRequest.getMessage().getCityInfo().getStateInfo();
		
		StateDTO stateDTO = new StateDTO();
		stateDTO.setCode(state.getCode());
		
		cityDTO.setStateDTO(stateDTO);
		
		return cityDTO;
	}

	public CreateCityResponse createCityResponse(CreateCityRequest createCityRequest) {
		CreateCityResponse createCityResponse = new CreateCityResponse();
		
		createCityResponse.setMessage(new CreateCityResponse.Message());
		
		cityController.createCity(updateCityDTO(createCityRequest));
		
		createCityResponse.getMessage().setStatus(true);
		
		return createCityResponse;
	}

	public CityController getCityController() {
		return cityController;
	}

	public void setCityController(CityController cityController) {
		this.cityController = cityController;
	}
}
