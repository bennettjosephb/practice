package au.com.project.sample.services.admin.deleterole;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;

import org.springframework.beans.factory.annotation.Autowired;

import au.com.project.sample.common.message.BusinessFault;
import au.com.project.sample.common.message.TechnicalFault;

public class DeleteRoleImpl implements DeleteRole {

	@Autowired
	private DeleteRoleManager deleteRoleManager;

	@WebResult(name = "deleteRoleResponse", targetNamespace = "http://www.sample.project.com.au/services/admin/DeleteRole/DeleteRoleResponse/v1", partName = "response")
	@WebMethod(operationName = "DeleteRole", action = "http://www.sample.project.com.au/services/admin/DeleteRole/v1")
	public DeleteRoleResponse deleteRole(
			@WebParam(partName = "request", name = "deleteRoleRequest", targetNamespace = "http://www.sample.project.com.au/services/admin/DeleteRole/DeleteRoleRequest/v1") DeleteRoleRequest request)
			throws TechnicalFault, BusinessFault {
		return deleteRoleManager.deleteRoleResponse(request);
	}

	public DeleteRoleManager getDeleteRoleManager() {
		return deleteRoleManager;
	}

	public void setDeleteRoleManager(DeleteRoleManager deleteRoleManager) {
		this.deleteRoleManager = deleteRoleManager;
	}

}
