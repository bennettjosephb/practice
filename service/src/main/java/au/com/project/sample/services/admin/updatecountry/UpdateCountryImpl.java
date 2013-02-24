package au.com.project.sample.services.admin.updatecountry;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;

import org.springframework.beans.factory.annotation.Autowired;

import au.com.project.sample.common.message.BusinessFault;
import au.com.project.sample.common.message.TechnicalFault;

public class UpdateCountryImpl implements UpdateCountry {

	@Autowired
	private UpdateCountryManager updateCountryManager;

	@WebResult(name = "updateCountryResponse", targetNamespace = "http://www.sample.project.com.au/services/admin/UpdateCountry/UpdateCountryResponse/v1", partName = "response")
	@WebMethod(operationName = "UpdateCountry", action = "http://www.sample.project.com.au/services/admin/UpdateCountry/v1")
	public UpdateCountryResponse updateCountry(
			@WebParam(partName = "request", name = "updateCountryRequest", targetNamespace = "http://www.sample.project.com.au/services/admin/UpdateCountry/UpdateCountryRequest/v1") UpdateCountryRequest request)
			throws TechnicalFault, BusinessFault {
		return updateCountryManager.updateCountryResponse(request);
	}

	public UpdateCountryManager getUpdateCountryManager() {
		return updateCountryManager;
	}

	public void setUpdateCountryManager(UpdateCountryManager updateCountryManager) {
		this.updateCountryManager = updateCountryManager;
	}

}
