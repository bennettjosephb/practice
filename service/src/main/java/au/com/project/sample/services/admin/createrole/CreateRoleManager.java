package au.com.project.sample.services.admin.createrole;

import org.apache.log4j.Logger;

import au.com.project.sample.process.AuthenticationRoleController;
import au.com.project.sample.process.impl.dto.AuthenticationRoleDTO;
import au.com.project.sample.services.model.RoleInfo;

public class CreateRoleManager {
	
	private static Logger log = Logger.getLogger(CreateRoleManager.class);

	private AuthenticationRoleController authenticationRoleController;

	public CreateRoleResponse createRoleResponse(
			CreateRoleRequest createRoleRequest) {
		CreateRoleResponse createRoleResponse = new CreateRoleResponse();

		createRoleResponse.setMessage(new CreateRoleResponse.Message());

		authenticationRoleController
				.createAuthenticationRole(updateRoleInfoDTO(createRoleRequest));

		createRoleResponse.getMessage().setStatus(true);

		return createRoleResponse;
	}

	private AuthenticationRoleDTO updateRoleInfoDTO(
			CreateRoleRequest createRoleRequest) {
		AuthenticationRoleDTO authenticationRoleDTO = new AuthenticationRoleDTO();

		RoleInfo roleInfo = createRoleRequest.getMessage().getRoleInfo();

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
