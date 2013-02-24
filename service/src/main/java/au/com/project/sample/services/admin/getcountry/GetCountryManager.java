package au.com.project.sample.services.admin.getcountry;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import au.com.project.sample.process.CountryController;
import au.com.project.sample.process.impl.dto.CountryDTO;
import au.com.project.sample.services.model.CountryInfo;

public class GetCountryManager {

	@Autowired
	private CountryController countryController;

	private List<CountryInfo> updateCountryInfo(List<CountryDTO> getCountryRequest) {
		List<CountryInfo> countryInfo = new ArrayList<CountryInfo>();
//		CountryInfo country = getCountryRequest.getMessage().getCountryInfo();
//		countryDTO.setCode(country.getCode());
//		countryDTO.setName(country.getName());
		return countryInfo;
	}

	public GetCountryResponse getCountryResponse(
			GetCountryRequest getCountryRequest) {

		GetCountryResponse getCountryResponse = new GetCountryResponse();

		getCountryResponse.setMessage(new GetCountryResponse.Message());

//		updateCountryInfo(countryController.findAllCountry());
		
		getCountryResponse.getMessage().getCountryInfo().addAll(updateCountryInfo(countryController.findAllCountry()));

//		getCountryResponse.getMessage().setStatus(true);

		return getCountryResponse;

	}

	public CountryController getCountryController() {
		return countryController;
	}

	public void setCountryController(CountryController countryController) {
		this.countryController = countryController;
	}
}
