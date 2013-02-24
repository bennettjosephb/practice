package au.com.project.sample.services.admin.updatecountry;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import au.com.project.sample.process.CountryController;
import au.com.project.sample.process.impl.dto.CountryDTO;
import au.com.project.sample.services.model.CountryInfo;

public class UpdateCountryManager {

	private static Logger log = Logger.getLogger(UpdateCountryManager.class);

	@Autowired
	private CountryController countryController;

	private CountryDTO updateCountryInfoDTO(
			UpdateCountryRequest updateCountryRequest) {
		CountryDTO categoryInfoDTO = new CountryDTO();

		CountryInfo categoryInfo = updateCountryRequest.getMessage()
				.getCountryInfo();
		categoryInfoDTO.setCode(categoryInfo.getCode());
		categoryInfoDTO.setName(categoryInfo.getName());

		return categoryInfoDTO;
	}

	public UpdateCountryResponse updateCountryResponse(
			UpdateCountryRequest updateCountryRequest) {
		UpdateCountryResponse updateCountryResponse = new UpdateCountryResponse();

		updateCountryResponse.setMessage(new UpdateCountryResponse.Message());

		countryController
				.updateCountry(updateCountryInfoDTO(updateCountryRequest));

		updateCountryResponse.getMessage().setStatus(true);

		return updateCountryResponse;
	}

	public CountryController getCountryController() {
		return countryController;
	}

	public void setCountryController(CountryController countryController) {
		this.countryController = countryController;
	}


}
