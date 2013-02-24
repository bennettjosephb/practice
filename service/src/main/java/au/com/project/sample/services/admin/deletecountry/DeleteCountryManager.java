package au.com.project.sample.services.admin.deletecountry;

import org.springframework.beans.factory.annotation.Autowired;

import au.com.project.sample.process.CountryController;
import au.com.project.sample.process.impl.dto.CountryDTO;
import au.com.project.sample.services.model.CountryInfo;

public class DeleteCountryManager {

	@Autowired
	private CountryController countryController;

	private CountryDTO updateCountryDTO(
			DeleteCountryRequest deleteCountryRequest) {
		CountryDTO countryDTO = new CountryDTO();
		CountryInfo country = deleteCountryRequest.getMessage().getCountry();
		countryDTO.setCode(country.getCode());
		countryDTO.setName(country.getName());
		return countryDTO;
	}

	public DeleteCountryResponse deleteCountryResponse(
			DeleteCountryRequest deleteCountryRequest) {

		DeleteCountryResponse deleteCountryResponse = new DeleteCountryResponse();

		deleteCountryResponse.setMessage(new DeleteCountryResponse.Message());

		countryController.deleteCountry(updateCountryDTO(deleteCountryRequest));

		deleteCountryResponse.getMessage().setStatus(true);

		return deleteCountryResponse;

	}

	public CountryController getCountryController() {
		return countryController;
	}

	public void setCountryController(CountryController countryController) {
		this.countryController = countryController;
	}
}
