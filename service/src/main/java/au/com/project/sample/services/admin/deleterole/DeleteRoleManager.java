package au.com.project.sample.services.admin.deleterole;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import au.com.project.sample.process.AuthenticationRoleController;
import au.com.project.sample.process.impl.dto.AuthenticationRoleDTO;
import au.com.project.sample.services.model.RoleInfo;

public class DeleteRoleManager {

	private static Logger log = Logger.getLogger(DeleteRoleManager.class);

	@Autowired
	private AuthenticationRoleController authenticationRoleController;

	public DeleteRoleResponse deleteRoleResponse(
			DeleteRoleRequest deleteRoleRequest) {
		DeleteRoleResponse deleteRoleResponse = new DeleteRoleResponse();

		deleteRoleResponse.setMessage(new DeleteRoleResponse.Message());

		authenticationRoleController
				.deleteAuthenticationRole(populateRoleInfoDTO(deleteRoleRequest));

		deleteRoleResponse.getMessage().setStatus(true);

		return deleteRoleResponse;
	}

	private AuthenticationRoleDTO populateRoleInfoDTO(
			DeleteRoleRequest deleteRoleRequest) {
		AuthenticationRoleDTO authenticationRoleDTO = new AuthenticationRoleDTO();

		RoleInfo roleInfo = deleteRoleRequest.getMessage().getRoleInfo();

		authenticationRoleDTO.setCode(roleInfo.getCode());
		authenticationRoleDTO.setName(roleInfo.getName());
		authenticationRoleDTO.setValue(roleInfo.getValue());

		return authenticationRoleDTO;
	}

	public AuthenticationRoleController getAuthenticationRoleController() {
		return authenticationRoleController;
	}

	public void setAuthenticationRoleController(
			AuthenticationRoleController authenticationRoleController) {
		this.authenticationRoleController = authenticationRoleController;
	}

}
