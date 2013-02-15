package au.com.project.sample.registration.services.setcountry;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;

import au.com.project.sample.common.message.BusinessFault;
import au.com.project.sample.common.message.TechnicalFault;

public class SetCountryImpl implements SetCountry {

	@WebResult(name = "setCountryResponse", targetNamespace = "http://www.sample.project.com.au/registration/services/SetCountry/v1", partName = "response")
	@WebMethod(operationName = "SetCountry", action = "http://www.sample.project.com.au/registration/services/SetCountry/v1")
	public SetCountryResponse setCountry(
			@WebParam(partName = "request", name = "setCountryRequest", targetNamespace = "http://www.sample.project.com.au/registration/services/SetCountry/v1") SetCountryRequest request)
			throws BusinessFault, TechnicalFault {
		// TODO Auto-generated method stub
		return null;
	}

}
