package au.com.project.sample.services.admin.createcity;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;

import org.springframework.beans.factory.annotation.Autowired;

import au.com.project.sample.common.message.BusinessFault;
import au.com.project.sample.common.message.TechnicalFault;

public class CreateCityImpl implements CreateCity {

	@Autowired
	private CreateCityManager createCityManager;

	@WebResult(name = "createCityResponse", targetNamespace = "http://www.sample.project.com.au/services/admin/CreateCity/CreateCityResponse/v1", partName = "response")
	@WebMethod(operationName = "CreateCity", action = "http://www.sample.project.com.au/services/admin/CreateCity/v1")
	public CreateCityResponse createCity(
			@WebParam(partName = "request", name = "createCityRequest", targetNamespace = "http://www.sample.project.com.au/services/admin/CreateCity/CreateCityRequest/v1") CreateCityRequest request)
			throws TechnicalFault, BusinessFault {
		return createCityManager.createCityResponse(request);
	}

	public CreateCityManager getCreateCityManager() {
		return createCityManager;
	}

	public void setCreateCityManager(CreateCityManager createCityManager) {
		this.createCityManager = createCityManager;
	}

}
