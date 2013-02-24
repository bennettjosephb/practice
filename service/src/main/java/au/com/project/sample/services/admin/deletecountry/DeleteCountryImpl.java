package au.com.project.sample.services.admin.deletecountry;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;

import org.springframework.beans.factory.annotation.Autowired;

import au.com.project.sample.common.message.BusinessFault;
import au.com.project.sample.common.message.TechnicalFault;

public class DeleteCountryImpl implements DeleteCountry {

	@Autowired
	private DeleteCountryManager deleteCountryManager;

	@WebResult(name = "deleteCountryResponse", targetNamespace = "http://www.sample.project.com.au/services/admin/DeleteCountry/v1", partName = "response")
	@WebMethod(operationName = "DeleteCountry", action = "http://www.sample.project.com.au/services/admin/DeleteCountry/v1")
	public DeleteCountryResponse deleteCountry(
			@WebParam(partName = "request", name = "deleteCountryRequest", targetNamespace = "http://www.sample.project.com.au/services/admin/DeleteCountry/v1") DeleteCountryRequest request)
			throws TechnicalFault, BusinessFault {
		return deleteCountryManager.deleteCountryResponse(request);
	}

	public DeleteCountryManager getDeleteCountryManager() {
		return deleteCountryManager;
	}

	public void setDeleteCountryManager(
			DeleteCountryManager deleteCountryManager) {
		this.deleteCountryManager = deleteCountryManager;
	}

}
