package au.com.project.sample.services.admin.createcountry;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;

import org.springframework.beans.factory.annotation.Autowired;

import au.com.project.sample.common.message.BusinessFault;
import au.com.project.sample.common.message.TechnicalFault;

public class CreateCountryImpl implements CreateCountry{
	
	@Autowired
	private CreateCountryManager createCountryManager;

	@WebResult(name = "createCountryResponse", targetNamespace = "http://www.sample.project.com.au/services/admin/CreateCountry/CreateCountryResponse/v1", partName = "response")
	@WebMethod(operationName = "CreateCountry", action = "http://www.sample.project.com.au/services/admin/CreateCountry/v1")
	public CreateCountryResponse createCountry(
			@WebParam(partName = "request", name = "createCountryRequest", targetNamespace = "http://www.sample.project.com.au/services/admin/CreateCountry/CreateCountryRequest/v1") CreateCountryRequest request)
			throws TechnicalFault, BusinessFault {
		return createCountryManager.createCountryResponse(request);
	}

	public CreateCountryManager getCreateCountryManager() {
		return createCountryManager;
	}

	public void setCreateCountryManager(CreateCountryManager createCountryManager) {
		this.createCountryManager = createCountryManager;
	}

}
