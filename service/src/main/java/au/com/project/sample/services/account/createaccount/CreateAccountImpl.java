package au.com.project.sample.services.account.createaccount;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;

import org.springframework.beans.factory.annotation.Autowired;

import au.com.project.sample.common.message.BusinessFault;
import au.com.project.sample.common.message.TechnicalFault;

public class CreateAccountImpl implements CreateAccount {
	
	@Autowired
	private CreateAccountManager createAccountManager;

	public CreateAccountImpl() {
	}

	@WebResult(name = "createAccountResponse", targetNamespace = "http://www.sample.project.com.au/services/account/CreateAccount/CreateAccountResponse/v1", partName = "response")
	@WebMethod(operationName = "CreateAccount", action = "http://www.sample.project.com.au/services/account/CreateAccount/v1")
	public CreateAccountResponse createAccount(
			@WebParam(partName = "request", name = "createAccountRequest", targetNamespace = "http://www.sample.project.com.au/services/account/CreateAccount/CreateAccountRequest/v1") CreateAccountRequest request)
			throws BusinessFault, TechnicalFault {
		return createAccountManager.createAccountResponse(request);
	}

	public CreateAccountManager getCreateAccountManager() {
		return createAccountManager;
	}

	public void setCreateAccountManager(CreateAccountManager createAccountManager) {
		this.createAccountManager = createAccountManager;
	}

}
