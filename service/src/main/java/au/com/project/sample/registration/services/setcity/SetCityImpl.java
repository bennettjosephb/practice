package au.com.project.sample.registration.services.setcity;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;

import au.com.project.sample.common.message.BusinessFault;
import au.com.project.sample.common.message.TechnicalFault;

public class SetCityImpl implements SetCity {

	@WebResult(name = "setCityResponse", targetNamespace = "http://www.sample.project.com.au/registration/services/SetCity/SetCityResponse/v1", partName = "response")
	@WebMethod(operationName = "SetCity", action = "http://www.sample.project.com.au/registration/services/SetCity/v1")
	public SetCityResponse setCity(
			@WebParam(partName = "request", name = "setCityRequest", targetNamespace = "http://www.sample.project.com.au/registration/services/SetCity/SetCityRequest/v1") SetCityRequest request)
			throws BusinessFault, TechnicalFault {
		// TODO Auto-generated method stub
		return null;
	}

}
