package au.com.project.sample.services.admin.updaterole;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import au.com.project.sample.process.AuthenticationRoleController;
import au.com.project.sample.process.impl.dto.AuthenticationRoleDTO;
import au.com.project.sample.services.model.RoleInfo;

public class UpdateRoleManager {


	private static Logger log = Logger.getLogger(UpdateRoleManager.class);

	@Autowired
	private AuthenticationRoleController authenticationRoleController;

	private AuthenticationRoleDTO updateRoleInfoDTO(
			UpdateRoleRequest updateRoleRequest) {
		AuthenticationRoleDTO categoryInfoDTO = new AuthenticationRoleDTO();

		RoleInfo categoryInfo = updateRoleRequest.getMessage()
				.getRoleInfo();
		categoryInfoDTO.setCode(categoryInfo.getCode());
		categoryInfoDTO.setName(categoryInfo.getName());

		return categoryInfoDTO;
	}

	public UpdateRoleResponse updateRoleResponse(
			UpdateRoleRequest updateRoleRequest) {
		UpdateRoleResponse updateRoleResponse = new UpdateRoleResponse();

		updateRoleResponse.setMessage(new UpdateRoleResponse.Message());

		authenticationRoleController
				.updateAuthenticationRole(updateRoleInfoDTO(updateRoleRequest));

		updateRoleResponse.getMessage().setStatus(true);

		return updateRoleResponse;
	}

	public AuthenticationRoleController getRoleController() {
		return authenticationRoleController;
	}

	public void setRoleController(AuthenticationRoleController authenticationRoleController) {
		this.authenticationRoleController = authenticationRoleController;
	}


}
