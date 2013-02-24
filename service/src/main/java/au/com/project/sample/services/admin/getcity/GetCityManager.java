package au.com.project.sample.services.admin.getcity;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import au.com.project.sample.process.CityController;
import au.com.project.sample.process.impl.dto.CityDTO;
import au.com.project.sample.services.model.CityInfo;

public class GetCityManager {

	private static Logger log = Logger.getLogger(GetCityManager.class);

	@Autowired
	private CityController categoryController;

	private CityDTO updateCityInfoDTO(
			GetCityRequest getCityRequest) {
		CityDTO categoryInfoDTO = new CityDTO();

//		CityInfo categoryInfo = getCityRequest.getMessage()
//				.getCityInfo();
//		categoryInfoDTO.setCode(categoryInfo.getCode());
//		categoryInfoDTO.setName(categoryInfo.getName());

		return categoryInfoDTO;
	}

	private List<CityInfo> populateCityInfo(
			List<CityDTO> categoryDTO) {
		List<CityInfo> categoryInfos = new ArrayList<CityInfo>();

		return categoryInfos;

	}

	public GetCityResponse getCityResponse(
			GetCityRequest getCityRequest) {
		GetCityResponse getCityResponse = new GetCityResponse();

		getCityResponse.setMessage(new GetCityResponse.Message());

		getCityResponse
				.getMessage()
				.getCityInfo()
				.addAll(populateCityInfo(categoryController
						.findAllCity()));

//		getCityResponse.getMessage().setStatus(true);

		return getCityResponse;
	}

	public CityController getCityController() {
		return categoryController;
	}

	public void setCityController(CityController categoryController) {
		this.categoryController = categoryController;
	}

}
