package au.com.project.sample.registration.services.savecountry;

import org.springframework.beans.factory.annotation.Autowired;

import au.com.project.sample.process.CountryController;
import au.com.project.sample.process.impl.dto.CountryDTO;
import au.com.project.sample.registration.model.Country;

public class SaveCountryManager {

	@Autowired
	private CountryController countryController;

	private CountryDTO updateCountryDTO(SaveCountryRequest saveCountryRequest) {
		CountryDTO countryDTO = new CountryDTO();
		Country country = saveCountryRequest.getMessage().getCountry();
		countryDTO.setCode(country.getCode());
		countryDTO.setName(country.getName());
		return countryDTO;
	}

	public SaveCountryResponse saveCountryResponse(
			SaveCountryRequest saveCountryRequest) {

		SaveCountryResponse saveCountryResponse = new SaveCountryResponse();

		saveCountryResponse.setMessage(new SaveCountryResponse.Message());

		countryController.createCountry(updateCountryDTO(saveCountryRequest));

		saveCountryResponse.getMessage().setStatus(true);

		return saveCountryResponse;

	}

	public CountryController getCountryController() {
		return countryController;
	}

	public void setCountryController(CountryController countryController) {
		this.countryController = countryController;
	}

}
