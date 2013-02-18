package au.com.project.sample.services.admin.createrole;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;

import au.com.project.sample.common.message.BusinessFault;
import au.com.project.sample.common.message.TechnicalFault;

public class CreateRoleImpl implements CreateRole {
	
	CreateRoleManager createRoleManager;

	@WebResult(name = "createRoleResponse", targetNamespace = "http://www.sample.project.com.au/services/admin/CreateRole/CreateRoleResponse/v1", partName = "response")
	@WebMethod(operationName = "CreateRole", action = "http://www.sample.project.com.au/services/admin/CreateRole/v1")
	public CreateRoleResponse createRole(
			@WebParam(partName = "request", name = "createRoleRequest", targetNamespace = "http://www.sample.project.com.au/services/admin/CreateRole/CreateRoleRequest/v1") CreateRoleRequest request)
			throws TechnicalFault, BusinessFault {
		// TODO Auto-generated method stub
		return null;
	}

	public CreateRoleManager getCreateRoleManager() {
		return createRoleManager;
	}

	public void setCreateRoleManager(CreateRoleManager createRoleManager) {
		this.createRoleManager = createRoleManager;
	}

}
