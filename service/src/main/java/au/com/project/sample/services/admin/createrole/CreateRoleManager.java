package au.com.project.sample.services.admin.createrole;

import au.com.project.sample.process.AuthenticationRoleController;
import au.com.project.sample.process.impl.dto.AuthenticationRoleDTO;

public class CreateRoleManager {

	private AuthenticationRoleController authenticationRoleController;

	public CreateRoleResponse createRoleResponse(
			CreateRoleRequest createRoleRequest) {
		CreateRoleResponse createRoleResponse = new CreateRoleResponse();

		createRoleResponse.setMessage(new CreateRoleResponse.Message());

		authenticationRoleController.createAuthenticationRole(updateRoleInfoDTO(createRoleRequest));

		createRoleResponse.getMessage().setStatus(true);

		return createRoleResponse;
	}

	private AuthenticationRoleDTO updateRoleInfoDTO(
			CreateRoleRequest createRoleRequest) {
		
		
		return null;
	}

	public AuthenticationRoleController getAuthenticationRoleController() {
		return authenticationRoleController;
	}

	public void setAuthenticationRoleController(
			AuthenticationRoleController authenticationRoleController) {
		this.authenticationRoleController = authenticationRoleController;
	}

}
