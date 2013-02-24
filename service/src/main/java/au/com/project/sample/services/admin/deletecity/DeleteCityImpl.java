package au.com.project.sample.services.admin.deletecity;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;

import org.springframework.beans.factory.annotation.Autowired;

import au.com.project.sample.common.message.BusinessFault;
import au.com.project.sample.common.message.TechnicalFault;

public class DeleteCityImpl implements DeleteCity {

	@Autowired
	private DeleteCityManager deleteCityManager;

	@WebResult(name = "deleteCityResponse", targetNamespace = "http://www.sample.project.com.au/services/admin/DeleteCity/DeleteCityResponse/v1", partName = "response")
	@WebMethod(operationName = "DeleteCity", action = "http://www.sample.project.com.au/services/admin/DeleteCity/v1")
	public DeleteCityResponse deleteCity(
			@WebParam(partName = "request", name = "deleteCityRequest", targetNamespace = "http://www.sample.project.com.au/services/admin/DeleteCity/DeleteCityRequest/v1") DeleteCityRequest request)
			throws TechnicalFault, BusinessFault {
		return deleteCityManager.deleteCityResponse(request);
	}

}
