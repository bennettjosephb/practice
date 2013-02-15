package au.com.project.sample.registration.services.deletecity;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;

import au.com.project.sample.common.message.BusinessFault;
import au.com.project.sample.common.message.TechnicalFault;

public class DeleteCityImpl implements DeleteCity {

	@WebResult(name = "deleteCityResponse", targetNamespace = "http://www.sample.project.com.au/registration/services/DeleteCity/DeleteCityResponse/v1", partName = "response")
	@WebMethod(operationName = "DeleteCity", action = "http://www.sample.project.com.au/registration/services/DeleteCity/v1")
	public DeleteCityResponse deleteCity(
			@WebParam(partName = "request", name = "deleteCityRequest", targetNamespace = "http://www.sample.project.com.au/registration/services/DeleteCity/DeleteCityRequest/v1") DeleteCityRequest request)
			throws TechnicalFault, BusinessFault {
		// TODO Auto-generated method stub
		return null;
	}

}
