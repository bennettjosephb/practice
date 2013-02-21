package au.com.project.sample.registration.services.getcountry;

import org.springframework.beans.factory.annotation.Autowired;

import au.com.project.sample.common.message.BusinessFault;
import au.com.project.sample.common.message.TechnicalFault;

public class GetCountryImplementation implements GetCountry {
	
	@Autowired
	private GetCountryManager getCountryManager;

	public GetCountryResponse getCountry(GetCountryRequest request)
			throws BusinessFault, TechnicalFault {
		return this.getCountryManager.getCountryResponse(request);
	}

	public GetCountryManager getGetCountryManager() {
		return getCountryManager;
	}

	public void setGetCountryManager(GetCountryManager getCountryManager) {
		this.getCountryManager = getCountryManager;
	}
}