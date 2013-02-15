package au.com.project.sample.registration.services.savecity;

import au.com.project.sample.process.CityController;
import au.com.project.sample.process.impl.dto.CityDTO;
import au.com.project.sample.process.impl.dto.StateDTO;
import au.com.project.sample.registration.model.City;
import au.com.project.sample.registration.model.State;

public class SaveCityManager {

	private CityController cityController;

	private CityDTO updateCityDTO(SaveCityRequest saveCityRequest) {
		CityDTO cityDTO = new CityDTO();
		
		City city = saveCityRequest.getMessage().getCity();
		cityDTO.setCode(city.getCode());
		cityDTO.setName(city.getName());
		
		State state = saveCityRequest.getMessage().getCity().getState();
		
		StateDTO stateDTO = new StateDTO();
		stateDTO.setCode(state.getCode());
		
		cityDTO.setStateDTO(stateDTO);
		
		return cityDTO;
	}

	public SaveCityResponse saveCityResponse(SaveCityRequest saveCityRequest) {
		SaveCityResponse saveCityResponse = new SaveCityResponse();
		
		saveCityResponse.setMessage(new SaveCityResponse.Message());
		
		cityController.createCity(updateCityDTO(saveCityRequest));
		
		saveCityResponse.getMessage().setStatus(true);
		
		return saveCityResponse;
	}

	public CityController getCityController() {
		return cityController;
	}

	public void setCityController(CityController cityController) {
		this.cityController = cityController;
	}
}
