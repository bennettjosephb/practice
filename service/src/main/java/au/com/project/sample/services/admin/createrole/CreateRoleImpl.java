package au.com.project.sample.services.admin.createrole;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;

import org.apache.log4j.Logger;

import au.com.project.sample.common.message.BusinessFault;
import au.com.project.sample.common.message.TechnicalFault;
import au.com.project.sample.process.impl.CountryControllerImpl;

public class CreateRoleImpl implements CreateRole {

	private static Logger log = Logger.getLogger(CreateRoleImpl.class);

	CreateRoleManager createRoleManager;

	@WebResult(name = "createRoleResponse", targetNamespace = "http://www.sample.project.com.au/services/admin/CreateRole/CreateRoleResponse/v1", partName = "response")
	@WebMethod(operationName = "CreateRole", action = "http://www.sample.project.com.au/services/admin/CreateRole/v1")
	public CreateRoleResponse createRole(
			@WebParam(partName = "request", name = "createRoleRequest", targetNamespace = "http://www.sample.project.com.au/services/admin/CreateRole/CreateRoleRequest/v1") CreateRoleRequest request)
			throws TechnicalFault, BusinessFault {
		return createRoleManager.createRoleResponse(request);
	}

	public CreateRoleManager getCreateRoleManager() {
		return createRoleManager;
	}

	public void setCreateRoleManager(CreateRoleManager createRoleManager) {
		this.createRoleManager = createRoleManager;
	}

}
