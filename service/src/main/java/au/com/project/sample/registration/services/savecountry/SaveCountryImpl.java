package au.com.project.sample.registration.services.savecountry;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;

import au.com.project.sample.common.message.BusinessFault;
import au.com.project.sample.common.message.TechnicalFault;

public class SaveCountryImpl implements SaveCountry {

	private SaveCountryManager saveCountryManager;

//	@WebResult(name = "saveCountryResponse", targetNamespace = "http://www.sample.project.com.au/registration/services/SaveCountry/v1", partName = "response")
//	@WebMethod(operationName = "SaveCountry", action = "http://www.sample.project.com.au/registration/services/SaveCountry/v1")
//	public SaveCountryResponse saveCountry(
//			@WebParam(partName = "request", name = "saveCountryRequest", targetNamespace = "http://www.sample.project.com.au/registration/services/SaveCountry/v1") SaveCountryRequest request)
//			throws BusinessFault, TechnicalFault {
//		return saveCountryManager.saveCountryResponse(request);
//	}

	public SaveCountryManager getSaveCountryManager() {
		return saveCountryManager;
	}

	public void setSaveCountryManager(SaveCountryManager saveCountryManager) {
		this.saveCountryManager = saveCountryManager;
	}

	@WebResult(name = "saveCountryResponse", targetNamespace = "http://www.sample.project.com.au/registration/services/SaveCountry/v1", partName = "response")
	@WebMethod(operationName = "SaveCountry", action = "http://www.sample.project.com.au/registration/services/SaveCountry/v1")
	public SaveCountryResponse saveCountry(
			@WebParam(partName = "request", name = "saveCountryRequest", targetNamespace = "http://www.sample.project.com.au/registration/services/SaveCountry/v1") SaveCountryRequest request)
			throws BusinessFault, TechnicalFault {
		return saveCountryManager.saveCountryResponse(request);
	}

}
