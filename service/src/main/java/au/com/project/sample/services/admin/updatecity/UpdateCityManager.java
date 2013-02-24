package au.com.project.sample.services.admin.updatecity;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import au.com.project.sample.process.CityController;
import au.com.project.sample.process.impl.dto.CityDTO;
import au.com.project.sample.services.model.CityInfo;

public class UpdateCityManager {
	
	private static Logger log = Logger.getLogger(UpdateCityManager.class);

	@Autowired
	private CityController cityController;

	private CityDTO updateCityInfoDTO(
			UpdateCityRequest updateCityRequest) {
		CityDTO categoryInfoDTO = new CityDTO();

		CityInfo categoryInfo = updateCityRequest.getMessage()
				.getCityInfo();
		categoryInfoDTO.setCode(categoryInfo.getCode());
		categoryInfoDTO.setName(categoryInfo.getName());

		return categoryInfoDTO;
	}

	public UpdateCityResponse updateCityResponse(
			UpdateCityRequest updateCityRequest) {
		UpdateCityResponse updateCityResponse = new UpdateCityResponse();

		updateCityResponse.setMessage(new UpdateCityResponse.Message());

		cityController
				.updateCity(updateCityInfoDTO(updateCityRequest));

		updateCityResponse.getMessage().setStatus(true);

		return updateCityResponse;
	}

	public CityController getCityController() {
		return cityController;
	}

	public void setCityController(CityController cityController) {
		this.cityController = cityController;
	}


}
