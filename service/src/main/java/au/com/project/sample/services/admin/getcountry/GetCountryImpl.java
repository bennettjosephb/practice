package au.com.project.sample.services.admin.getcountry;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;

import au.com.project.sample.common.message.BusinessFault;
import au.com.project.sample.common.message.TechnicalFault;

public class GetCountryImpl implements GetCountry {

	@WebResult(name = "getCountryResponse", targetNamespace = "http://www.sample.project.com.au/services/admin/GetCountry/GetCountryResponse/v1", partName = "response")
	@WebMethod(operationName = "GetCountry", action = "http://www.sample.project.com.au/services/admin/GetCountry/v1")
	public GetCountryResponse getCountry(
			@WebParam(partName = "request", name = "getCountryRequest", targetNamespace = "http://www.sample.project.com.au/services/admin/GetCountry/GetCountryRequest/v1") GetCountryRequest request)
			throws BusinessFault, TechnicalFault {
		// TODO Auto-generated method stub
		return null;
	}

}
