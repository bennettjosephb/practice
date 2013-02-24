package au.com.project.sample.services.admin.updatedesignation;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;

import org.springframework.beans.factory.annotation.Autowired;

import au.com.project.sample.common.message.BusinessFault;
import au.com.project.sample.common.message.TechnicalFault;

public class UpdateDesignationImpl implements UpdateDesignation {

	@Autowired
	private UpdateDesignationManager updateDesignationManager;
	
	@WebResult(name = "updateDesignationResponse", targetNamespace = "http://www.sample.project.com.au/services/admin/UpdateDesignation/UpdateDesignationResponse/v1", partName = "response")
	@WebMethod(operationName = "UpdateDesignation", action = "http://www.sample.project.com.au/services/admin/UpdateDesignation/v1")
	public UpdateDesignationResponse updateDesignation(
			@WebParam(partName = "request", name = "updateDesignationRequest", targetNamespace = "http://www.sample.project.com.au/services/admin/UpdateDesignation/UpdateDesignationRequest/v1") UpdateDesignationRequest request)
			throws TechnicalFault, BusinessFault {
		return updateDesignationManager.updateDesignationResponse(request);
	}

	public UpdateDesignationManager getUpdateDesignationManager() {
		return updateDesignationManager;
	}

	public void setUpdateDesignationManager(
			UpdateDesignationManager updateDesignationManager) {
		this.updateDesignationManager = updateDesignationManager;
	}

}
