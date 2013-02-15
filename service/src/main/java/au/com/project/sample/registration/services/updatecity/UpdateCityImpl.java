package au.com.project.sample.registration.services.updatecity;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;

import au.com.project.sample.common.message.BusinessFault;
import au.com.project.sample.common.message.TechnicalFault;

public class UpdateCityImpl implements UpdateCity {

	@WebResult(name = "updateCityResponse", targetNamespace = "http://www.sample.project.com.au/registration/services/UpdateCity/UpdateCityResponse/v1", partName = "response")
	@WebMethod(operationName = "UpdateCity", action = "http://www.sample.project.com.au/registration/services/UpdateCity/v1")
	public UpdateCityResponse updateCity(
			@WebParam(partName = "request", name = "updateCityRequest", targetNamespace = "http://www.sample.project.com.au/registration/services/UpdateCity/UpdateCityRequest/v1") UpdateCityRequest request)
			throws BusinessFault, TechnicalFault {
		// TODO Auto-generated method stub
		return null;
	}

}
