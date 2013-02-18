package au.com.project.sample.services.admin.createcurrency;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;

import au.com.project.sample.common.message.BusinessFault;
import au.com.project.sample.common.message.TechnicalFault;

public class CreateCurrencyImpl implements CreateCurrency {

	private CreateCurrencyManager createCurrencyManager;

	@WebResult(name = "createCurrencyResponse", targetNamespace = "http://www.sample.project.com.au/services/admin/CreateCurrency/CreateCurrencyResponse/v1", partName = "response")
	@WebMethod(operationName = "CreateCurrency", action = "http://www.sample.project.com.au/services/admin/CreateCurrency/v1")
	public CreateCurrencyResponse createCurrency(
			@WebParam(partName = "request", name = "createCurrencyRequest", targetNamespace = "http://www.sample.project.com.au/services/admin/CreateCurrency/CreateCurrencyRequest/v1") CreateCurrencyRequest request)
			throws TechnicalFault, BusinessFault {
		return createCurrencyManager.createCurrencyResponse(request);
	}

	public CreateCurrencyManager getCreateCurrencyManager() {
		return createCurrencyManager;
	}

	public void setCreateCurrencyManager(
			CreateCurrencyManager createCurrencyManager) {
		this.createCurrencyManager = createCurrencyManager;
	}

}
