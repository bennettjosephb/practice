package au.com.project.sample.registration.services.getcountry;

import au.com.project.sample.common.message.BusinessFault;
import au.com.project.sample.common.message.TechnicalFault;

public class GetCountryImplementation implements GetCountry {
	
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