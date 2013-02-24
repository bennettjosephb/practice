package au.com.project.sample.services.admin.getcurrency;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;

import org.springframework.beans.factory.annotation.Autowired;

import au.com.project.sample.common.message.BusinessFault;
import au.com.project.sample.common.message.TechnicalFault;

public class GetCurrencyImpl implements GetCurrency {

	@Autowired
	private GetCurrencyManager getCurrencyManager;

	@WebResult(name = "getCurrencyResponse", targetNamespace = "http://www.sample.project.com.au/services/admin/GetCurrency/GetCurrencyResponse/v1", partName = "response")
	@WebMethod(operationName = "GetCurrency", action = "http://www.sample.project.com.au/services/admin/GetCurrency/v1")
	public GetCurrencyResponse getCurrency(
			@WebParam(partName = "request", name = "getCurrencyRequest", targetNamespace = "http://www.sample.project.com.au/services/admin/GetCurrency/GetCurrencyRequest/v1") GetCurrencyRequest request)
			throws TechnicalFault, BusinessFault {
		return getCurrencyManager.getCurrencyResponse(request);
	}

	public GetCurrencyManager getGetCurrencyManager() {
		return getCurrencyManager;
	}

	public void setGetCurrencyManager(GetCurrencyManager getCurrencyManager) {
		this.getCurrencyManager = getCurrencyManager;
	}

}
