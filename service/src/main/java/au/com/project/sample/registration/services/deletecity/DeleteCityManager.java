package au.com.project.sample.registration.services.deletecity;

import org.springframework.beans.factory.annotation.Autowired;

import au.com.project.sample.process.CityController;
import au.com.project.sample.process.impl.dto.CityDTO;
import au.com.project.sample.process.impl.dto.StateDTO;
import au.com.project.sample.services.admin.deletecity.DeleteCityRequest;
import au.com.project.sample.services.admin.deletecity.DeleteCityResponse;
import au.com.project.sample.services.model.CityInfo;
import au.com.project.sample.services.model.StateInfo;

public class DeleteCityManager {

	@Autowired
	private CityController cityController;

	private CityDTO updateCityDTO(DeleteCityRequest deleteCityRequest) {
		CityDTO cityDTO = new CityDTO();

		CityInfo city = deleteCityRequest.getMessage().getCityInfo();
		cityDTO.setCode(city.getCode());
		cityDTO.setName(city.getName());

		StateInfo state = deleteCityRequest.getMessage().getCityInfo()
				.getStateInfo();

		StateDTO stateDTO = new StateDTO();
		stateDTO.setCode(state.getCode());

		cityDTO.setStateDTO(stateDTO);

		return cityDTO;
	}

	public DeleteCityResponse deleteCityResponse(
			DeleteCityRequest deleteCityRequest) {
		DeleteCityResponse deleteCityResponse = new DeleteCityResponse();

		deleteCityResponse.setMessage(new DeleteCityResponse.Message());

		cityController.deleteCity(updateCityDTO(deleteCityRequest));

		deleteCityResponse.getMessage().setStatus(true);

		return deleteCityResponse;
	}

	public CityController getCityController() {
		return cityController;
	}

	public void setCityController(CityController cityController) {
		this.cityController = cityController;
	}
}
