package au.com.project.sample.services.admin.updaterole;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;

import org.springframework.beans.factory.annotation.Autowired;

import au.com.project.sample.common.message.BusinessFault;
import au.com.project.sample.common.message.TechnicalFault;

public class UpdateRoleImpl implements UpdateRole {

	@Autowired
	private UpdateRoleManager updateRoleManager;

	@WebResult(name = "updateRoleResponse", targetNamespace = "http://www.sample.project.com.au/services/admin/UpdateRole/UpdateRoleResponse/v1", partName = "response")
	@WebMethod(operationName = "UpdateRole", action = "http://www.sample.project.com.au/services/admin/UpdateRole/v1")
	public UpdateRoleResponse updateRole(
			@WebParam(partName = "request", name = "updateRoleRequest", targetNamespace = "http://www.sample.project.com.au/services/admin/UpdateRole/UpdateRoleRequest/v1") UpdateRoleRequest request)
			throws TechnicalFault, BusinessFault {
		return updateRoleManager.updateRoleResponse(request);
	}

	public UpdateRoleManager getUpdateRoleManager() {
		return updateRoleManager;
	}

	public void setUpdateRoleManager(UpdateRoleManager updateRoleManager) {
		this.updateRoleManager = updateRoleManager;
	}

}
