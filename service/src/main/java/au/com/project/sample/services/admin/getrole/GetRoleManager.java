package au.com.project.sample.services.admin.getrole;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import au.com.project.sample.process.AuthenticationRoleController;
import au.com.project.sample.process.impl.dto.AuthenticationRoleDTO;
import au.com.project.sample.services.model.RoleInfo;

public class GetRoleManager {


	@Autowired
	private AuthenticationRoleController authenticationRoleController;

	private List<RoleInfo> updateRoleInfo(List<AuthenticationRoleDTO> getRoleRequest) {
		List<RoleInfo> currencyInfo = new ArrayList<RoleInfo>();
//		RoleInfo currency = getRoleRequest.getMessage().getRoleInfo();
//		currencyDTO.setCode(currency.getCode());
//		currencyDTO.setName(currency.getName());
		return currencyInfo;
	}

	public GetRoleResponse getRoleResponse(
			GetRoleRequest getRoleRequest) {

		GetRoleResponse getRoleResponse = new GetRoleResponse();

		getRoleResponse.setMessage(new GetRoleResponse.Message());

//		updateRoleInfo(currencyController.findAllRole());
		
		getRoleResponse.getMessage().getRoles().addAll(updateRoleInfo(authenticationRoleController.findAllAuthenticationRole()));

//		getRoleResponse.getMessage().setStatus(true);

		return getRoleResponse;

	}

	public AuthenticationRoleController getRoleController() {
		return authenticationRoleController;
	}

	public void setRoleController(AuthenticationRoleController authenticationRoleController) {
		this.authenticationRoleController = authenticationRoleController;
	}
}
