package au.com.project.sample.services.account.createaccount;

import au.com.project.sample.process.CreateAccountController;
import au.com.project.sample.process.impl.dto.StateDTO;
import au.com.project.sample.process.impl.dto.UserInfoDTO;
import au.com.project.sample.registration.model.State;
import au.com.project.sample.services.model.UserInfo;

public class CreateAccountManager {

	private CreateAccountController createAccountController;

	private UserInfoDTO updateUserInfoDTO(CreateAccountRequest createAccountRequest) {
		UserInfoDTO userInfoDTO = new UserInfoDTO();

		UserInfo userInfo = createAccountRequest.getMessage().getUserInfo();
		userInfoDTO.setFirstName(userInfo.getFirstName());
		userInfoDTO.setLastName(userInfo.getLastName());
		userInfoDTO.setConfirmPassword(userInfo.getConfirmPassword());
		userInfoDTO.setLastName(userInfo.getEmailId());
		userInfoDTO.setLocation(userInfo.getLocation());
		userInfoDTO.setPassword(userInfo.getPassword());
		userInfoDTO.setPhoneNumber(userInfo.getPhoneNumber());
		userInfoDTO.setUsername(userInfo.getUsername());
		userInfoDTO.setDateOfBirth(userInfo.getDateOfBirth());
		userInfoDTO.setGender(userInfo.getGender());

		
		return userInfoDTO;
	}

	public CreateAccountResponse createAccountResponse(CreateAccountRequest createAccountRequest) {
		CreateAccountResponse createAccountResponse = new CreateAccountResponse();

		createAccountResponse.setMessage(new CreateAccountResponse.Message());

		createAccountController.createAccount(updateUserInfoDTO(createAccountRequest));

		createAccountResponse.getMessage().setStatus(true);

		return createAccountResponse;
	}

	public CreateAccountController getCreateAccountController() {
		return createAccountController;
	}

	public void setCreateAccountController(CreateAccountController createAccountController) {
		this.createAccountController = createAccountController;
	}

}
