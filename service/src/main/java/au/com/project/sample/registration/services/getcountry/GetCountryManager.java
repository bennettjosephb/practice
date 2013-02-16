package au.com.project.sample.registration.services.getcountry;

import java.util.ArrayList;
import java.util.List;

import au.com.project.sample.process.CountryController;
import au.com.project.sample.process.impl.dto.CountryDTO;
import au.com.project.sample.registration.model.Country;

public class GetCountryManager {

	private CountryController countryController;

	private List<Country> updateCountryDTO(List<CountryDTO> countryList) {

		List<Country> countries = new ArrayList<Country>();

		for (CountryDTO countryDTO : countryList) {
			
			Country country = new Country();
			country.setCode(countryDTO.getCode());
			country.setId(countryDTO.getId().toString());
			country.setName(countryDTO.getName());
			countries.add(country);

		}

		return countries;
	}

	public GetCountryResponse getCountryResponse(
			GetCountryRequest getCountryRequest) {
		GetCountryResponse getCountryResponse = new GetCountryResponse();

		getCountryResponse.setMessage(new GetCountryResponse.Message());

		List<CountryDTO> countryList = countryController.findAllCountry();// createCountry(updateCountryDTO(getCountryRequest));

		getCountryResponse.getMessage().getCountry()
				.addAll(updateCountryDTO(countryList));

		return getCountryResponse;

	}

	public CountryController getCountryController() {
		return countryController;
	}

	public void setCountryController(CountryController countryController) {
		this.countryController = countryController;
	}
}
