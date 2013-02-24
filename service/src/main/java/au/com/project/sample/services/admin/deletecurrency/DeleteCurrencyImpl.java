package au.com.project.sample.services.admin.deletecurrency;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;

import org.springframework.beans.factory.annotation.Autowired;

import au.com.project.sample.common.message.BusinessFault;
import au.com.project.sample.common.message.TechnicalFault;

public class DeleteCurrencyImpl implements DeleteCurrency {

	@Autowired
	private DeleteCurrencyManager deleteCurrencyManager;

	@WebResult(name = "deleteCurrencyResponse", targetNamespace = "http://www.sample.project.com.au/services/admin/DeleteCurrency/DeleteCurrencyResponse/v1", partName = "response")
	@WebMethod(operationName = "DeleteCurrency", action = "http://www.sample.project.com.au/services/admin/DeleteCurrency/v1")
	public DeleteCurrencyResponse deleteCurrency(
			@WebParam(partName = "request", name = "deleteCurrencyRequest", targetNamespace = "http://www.sample.project.com.au/services/admin/DeleteCurrency/DeleteCurrencyRequest/v1") DeleteCurrencyRequest request)
			throws TechnicalFault, BusinessFault {
		return deleteCurrencyManager.deleteCurrencyResponse(request);
	}

}
