package au.com.project.sample.services.account.createaccount;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;

import au.com.project.sample.common.message.BusinessFault;
import au.com.project.sample.common.message.TechnicalFault;

public class CreateAccountImpl implements CreateAccount {

	public CreateAccountImpl() {
		// TODO Auto-generated constructor stub
	}

	@WebResult(name = "createAccountResponse", targetNamespace = "http://www.sample.project.com.au/services/account/CreateAccount/CreateAccountResponse/v1", partName = "response")
	@WebMethod(operationName = "CreateAccount", action = "http://www.sample.project.com.au/services/account/CreateAccount/v1")
	public CreateAccountResponse createAccount(
			@WebParam(partName = "request", name = "createAccountRequest", targetNamespace = "http://www.sample.project.com.au/services/account/CreateAccount/CreateAccountRequest/v1") CreateAccountRequest request)
			throws BusinessFault, TechnicalFault {
		// TODO Auto-generated method stub
		return null;
	}

}
