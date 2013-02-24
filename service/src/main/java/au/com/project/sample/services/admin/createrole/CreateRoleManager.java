package au.com.project.sample.services.admin.createrole;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import au.com.project.sample.process.AuthenticationRoleController;
import au.com.project.sample.process.impl.dto.AuthenticationRoleDTO;
import au.com.project.sample.services.model.RoleInfo;

public class CreateRoleManager {
	
	private static Logger log = Logger.getLogger(CreateRoleManager.class);

	@Autowired
	private AuthenticationRoleController authenticationRoleController;

	public CreateRoleResponse createRoleResponse(
			CreateRoleRequest createRoleRequest) {
		CreateRoleResponse createRoleResponse = new CreateRoleResponse();

		createRoleResponse.setMessage(new CreateRoleResponse.Message());

		authenticationRoleController
				.createAuthenticationRole(populateRoleInfoDTO(createRoleRequest));

		createRoleResponse.getMessage().setStatus(true);

		return createRoleResponse;
	}

	private AuthenticationRoleDTO populateRoleInfoDTO(
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
