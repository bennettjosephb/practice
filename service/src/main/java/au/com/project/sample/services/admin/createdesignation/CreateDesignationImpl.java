package au.com.project.sample.services.admin.createdesignation;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;

import org.apache.log4j.Logger;

import au.com.project.sample.common.message.BusinessFault;
import au.com.project.sample.common.message.TechnicalFault;
import au.com.project.sample.process.impl.CategoryControllerImpl;

public class CreateDesignationImpl implements CreateDesignation {

	private static Logger log = Logger.getLogger(CreateDesignationImpl.class);

	private CreateDesignationManager createDesignationManager;

	@WebResult(name = "createDesignationResponse", targetNamespace = "http://www.sample.project.com.au/services/admin/CreateDesignation/CreateDesignationResponse/v1", partName = "response")
	@WebMethod(operationName = "CreateDesignation", action = "http://www.sample.project.com.au/services/admin/CreateDesignation/v1")
	public CreateDesignationResponse createDesignation(
			@WebParam(partName = "request", name = "createDesignationRequest", targetNamespace = "http://www.sample.project.com.au/services/admin/CreateDesignation/CreateDesignationRequest/v1") CreateDesignationRequest request)
			throws BusinessFault, TechnicalFault {
		return createDesignationManager.createDesignationResponse(request);
	}

	public CreateDesignationManager getCreateDesignationManager() {
		return createDesignationManager;
	}

	public void setCreateDesignationManager(
			CreateDesignationManager createDesignationManager) {
		this.createDesignationManager = createDesignationManager;
	}

}