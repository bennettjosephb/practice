package au.com.project.sample.services.admin.getdesignation;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;

import org.springframework.beans.factory.annotation.Autowired;

import au.com.project.sample.common.message.BusinessFault;
import au.com.project.sample.common.message.TechnicalFault;

public class GetDesignationImpl implements GetDesignation {

	@Autowired
	private GetDesignationManager getDesignationManager;

	@WebResult(name = "getDesignationResponse", targetNamespace = "http://www.sample.project.com.au/services/admin/GetDesignation/GetDesignationResponse/v1", partName = "response")
	@WebMethod(operationName = "GetDesignation", action = "http://www.sample.project.com.au/services/admin/GetDesignation/v1")
	public GetDesignationResponse getDesignation(
			@WebParam(partName = "request", name = "getDesignationRequest", targetNamespace = "http://www.sample.project.com.au/services/admin/GetDesignation/GetDesignationRequest/v1") GetDesignationRequest request)
			throws TechnicalFault, BusinessFault {
		return getDesignationManager.getDesignationResponse(request);
	}

	public GetDesignationManager getGetDesignationManager() {
		return getDesignationManager;
	}

	public void setGetDesignationManager(
			GetDesignationManager getDesignationManager) {
		this.getDesignationManager = getDesignationManager;
	}

}
