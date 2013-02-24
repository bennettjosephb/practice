package au.com.project.sample.services.admin.getcity;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;

import org.springframework.beans.factory.annotation.Autowired;

import au.com.project.sample.common.message.BusinessFault;
import au.com.project.sample.common.message.TechnicalFault;

public class GetCityImpl implements GetCity {
	
	@Autowired
	private GetCityManager getCityManager;

	@WebResult(name = "getCityResponse", targetNamespace = "http://www.sample.project.com.au/services/admin/GetCity/GetCityResponse/v1", partName = "response")
	@WebMethod(operationName = "GetCity", action = "http://www.sample.project.com.au/services/admin/GetCity/v1")
	public GetCityResponse getCity(
			@WebParam(partName = "request", name = "getCityRequest", targetNamespace = "http://www.sample.project.com.au/services/admin/GetCity/GetCityRequest/v1") GetCityRequest request)
			throws TechnicalFault, BusinessFault {
		return getCityManager.getCityResponse(request);
	}

}
