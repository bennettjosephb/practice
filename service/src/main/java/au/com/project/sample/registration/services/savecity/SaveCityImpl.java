package au.com.project.sample.registration.services.savecity;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;

import org.springframework.beans.factory.annotation.Autowired;

import au.com.project.sample.common.message.BusinessFault;
import au.com.project.sample.common.message.TechnicalFault;

public class SaveCityImpl implements SaveCity {

	@Autowired
	private SaveCityManager saveCityManager;

//	@WebResult(name = "saveCityResponse", targetNamespace = "http://www.sample.project.com.au/registration/services/SaveCity/SaveCityResponse/v1", partName = "response")
//	@WebMethod(operationName = "SaveCity", action = "http://www.sample.project.com.au/registration/services/SaveCity/v1")
//	public SaveCityResponse saveCity(
//			@WebParam(partName = "request", name = "saveCityRequest", targetNamespace = "http://www.sample.project.com.au/registration/services/SaveCity/SaveCityRequest/v1") SaveCityRequest request)
//			throws TechnicalFault, BusinessFault {
//		return saveCityManager.saveCityResponse(request);
//	}

	public SaveCityManager getSaveCityManager() {
		return saveCityManager;
	}

	public void setSaveCityManager(SaveCityManager saveCityManager) {
		this.saveCityManager = saveCityManager;
	}

	@WebResult(name = "saveCityResponse", targetNamespace = "http://www.sample.project.com.au/registration/services/SaveCity/SaveCityResponse/v1", partName = "response")
	@WebMethod(operationName = "SaveCity", action = "http://www.sample.project.com.au/registration/services/SaveCity/v1")
	public SaveCityResponse saveCity(
			@WebParam(partName = "request", name = "saveCityRequest", targetNamespace = "http://www.sample.project.com.au/registration/services/SaveCity/SaveCityRequest/v1") SaveCityRequest request)
			throws TechnicalFault, BusinessFault {
		return saveCityManager.saveCityResponse(request);
	}

}
