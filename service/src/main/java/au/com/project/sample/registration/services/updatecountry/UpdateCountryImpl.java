package au.com.project.sample.registration.services.updatecountry;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;

import au.com.project.sample.common.message.BusinessFault;
import au.com.project.sample.common.message.TechnicalFault;

public class UpdateCountryImpl implements UpdateCountry {

	@WebResult(name = "updateCountryResponse", targetNamespace = "http://www.sample.project.com.au/registration/services/UpdateCountry/v1", partName = "response")
	@WebMethod(operationName = "UpdateCountry", action = "http://www.sample.project.com.au/registration/services/UpdateCountry/v1")
	public UpdateCountryResponse updateCountry(
			@WebParam(partName = "request", name = "updateCountryRequest", targetNamespace = "http://www.sample.project.com.au/registration/services/UpdateCountry/v1") UpdateCountryRequest request)
			throws TechnicalFault, BusinessFault {
		// TODO Auto-generated method stub
		return null;
	}

}
