package au.com.project.sample.registration.services.deletecountry;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;

import au.com.project.sample.common.message.BusinessFault;
import au.com.project.sample.common.message.TechnicalFault;

public class DeleteCountryImpl implements DeleteCountry {

	@WebResult(name = "deleteCountryResponse", targetNamespace = "http://www.sample.project.com.au/registration/services/DeleteCountry/v1", partName = "response")
	@WebMethod(operationName = "DeleteCountry", action = "http://www.sample.project.com.au/registration/services/DeleteCountry/v1")
	public DeleteCountryResponse deleteCountry(
			@WebParam(partName = "request", name = "deleteCountryRequest", targetNamespace = "http://www.sample.project.com.au/registration/services/DeleteCountry/v1") DeleteCountryRequest request)
			throws BusinessFault, TechnicalFault {
		// TODO Auto-generated method stub
		return null;
	}

}
