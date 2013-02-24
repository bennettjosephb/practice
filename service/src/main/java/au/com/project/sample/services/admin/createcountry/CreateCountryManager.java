package au.com.project.sample.services.admin.createcountry;

import org.springframework.beans.factory.annotation.Autowired;

import au.com.project.sample.process.CountryController;
import au.com.project.sample.process.impl.dto.CountryDTO;
import au.com.project.sample.services.model.CountryInfo;

public class CreateCountryManager {

	@Autowired
	private CountryController countryController;

	private CountryDTO updateCountryDTO(CreateCountryRequest createCountryRequest) {
		CountryDTO countryDTO = new CountryDTO();
		CountryInfo country = createCountryRequest.getMessage().getCountryInfo();
		countryDTO.setCode(country.getCode());
		countryDTO.setName(country.getName());
		return countryDTO;
	}

	public CreateCountryResponse createCountryResponse(
			CreateCountryRequest createCountryRequest) {

		CreateCountryResponse createCountryResponse = new CreateCountryResponse();

		createCountryResponse.setMessage(new CreateCountryResponse.Message());

		countryController.createCountry(updateCountryDTO(createCountryRequest));

		createCountryResponse.getMessage().setStatus(true);

		return createCountryResponse;

	}

	public CountryController getCountryController() {
		return countryController;
	}

	public void setCountryController(CountryController countryController) {
		this.countryController = countryController;
	}
}
