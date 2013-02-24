package au.com.project.sample.services.admin.getrole;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;

import org.springframework.beans.factory.annotation.Autowired;

import au.com.project.sample.common.message.BusinessFault;
import au.com.project.sample.common.message.TechnicalFault;

public class GetRoleImpl implements GetRole {
	
	@Autowired
	private GetRoleManager getRoleManager;

	@WebResult(name = "getRoleResponse", targetNamespace = "http://www.sample.project.com.au/services/admin/GetRole/GetRoleResponse/v1", partName = "response")
	@WebMethod(operationName = "GetRole", action = "http://www.sample.project.com.au/services/admin/GetRole/v1")
	public GetRoleResponse getRole(
			@WebParam(partName = "request", name = "getRoleRequest", targetNamespace = "http://www.sample.project.com.au/services/admin/GetRole/GetRoleRequest/v1") GetRoleRequest request)
			throws BusinessFault, TechnicalFault {
		return getRoleManager.getRoleResponse(request);
	}

	public GetRoleManager getGetRoleManager() {
		return getRoleManager;
	}

	public void setGetRoleManager(GetRoleManager getRoleManager) {
		this.getRoleManager = getRoleManager;
	}

}
