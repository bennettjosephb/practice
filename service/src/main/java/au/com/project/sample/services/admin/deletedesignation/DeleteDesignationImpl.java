package au.com.project.sample.services.admin.deletedesignation;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;

import org.springframework.beans.factory.annotation.Autowired;

import au.com.project.sample.common.message.BusinessFault;
import au.com.project.sample.common.message.TechnicalFault;

public class DeleteDesignationImpl implements DeleteDesignation {

	@Autowired
	private DeleteDesignationManager deleteDesignationManager;

	@WebResult(name = "deleteDesignationResponse", targetNamespace = "http://www.sample.project.com.au/services/admin/DeleteDesignation/DeleteDesignationResponse/v1", partName = "response")
	@WebMethod(operationName = "DeleteDesignation", action = "http://www.sample.project.com.au/services/admin/DeleteDesignation/v1")
	public DeleteDesignationResponse deleteDesignation(
			@WebParam(partName = "request", name = "deleteDesignationRequest", targetNamespace = "http://www.sample.project.com.au/services/admin/DeleteDesignation/DeleteDesignationRequest/v1") DeleteDesignationRequest request)
			throws TechnicalFault, BusinessFault {
		return deleteDesignationManager.deleteDesignationResponse(request);
	}

	public DeleteDesignationManager getDeleteDesignationManager() {
		return deleteDesignationManager;
	}

	public void setDeleteDesignationManager(
			DeleteDesignationManager deleteDesignationManager) {
		this.deleteDesignationManager = deleteDesignationManager;
	}

}
