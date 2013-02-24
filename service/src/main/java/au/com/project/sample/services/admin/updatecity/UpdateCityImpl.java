package au.com.project.sample.services.admin.updatecity;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;

import org.springframework.beans.factory.annotation.Autowired;

import au.com.project.sample.common.message.BusinessFault;
import au.com.project.sample.common.message.TechnicalFault;

public class UpdateCityImpl implements UpdateCity {

	@Autowired
	private UpdateCityManager updateCityManager;
	
	@WebResult(name = "updateCityResponse", targetNamespace = "http://www.sample.project.com.au/services/admin/UpdateCity/UpdateCityResponse/v1", partName = "response")
	@WebMethod(operationName = "UpdateCity", action = "http://www.sample.project.com.au/services/admin/UpdateCity/v1")
	public UpdateCityResponse updateCity(
			@WebParam(partName = "request", name = "updateCityRequest", targetNamespace = "http://www.sample.project.com.au/services/admin/UpdateCity/UpdateCityRequest/v1") UpdateCityRequest request)
			throws BusinessFault, TechnicalFault {
		return updateCityManager.updateCityResponse(request);
	}

	public UpdateCityManager getUpdateCityManager() {
		return updateCityManager;
	}

	public void setUpdateCityManager(UpdateCityManager updateCityManager) {
		this.updateCityManager = updateCityManager;
	}

}
