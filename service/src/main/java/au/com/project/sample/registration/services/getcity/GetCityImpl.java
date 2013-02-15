package au.com.project.sample.registration.services.getcity;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;

import au.com.project.sample.common.message.BusinessFault;
import au.com.project.sample.common.message.TechnicalFault;

public class GetCityImpl implements GetCity {

	@Override
	@WebResult(name = "getCityResponse", targetNamespace = "http://www.sample.project.com.au/registration/services/GetCity/GetCityResponse/v1", partName = "response")
	@WebMethod(operationName = "GetCity", action = "http://www.sample.project.com.au/registration/services/GetCity/v1")
	public GetCityResponse getCity(
			@WebParam(partName = "request", name = "getCityRequest", targetNamespace = "http://www.sample.project.com.au/registration/services/GetCity/GetCityRequest/v1") GetCityRequest request)
			throws TechnicalFault, BusinessFault {
		// TODO Auto-generated method stub
		return null;
	}

}
