package au.com.project.sample.services.admin.updatecurrency;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;

import org.springframework.beans.factory.annotation.Autowired;

import au.com.project.sample.common.message.BusinessFault;
import au.com.project.sample.common.message.TechnicalFault;

public class UpdateCurrencyImpl implements UpdateCurrency{
	
	@Autowired
	private UpdateCurrencyManager updateCurrencyManager;

	@WebResult(name = "updateCurrencyResponse", targetNamespace = "http://www.sample.project.com.au/services/admin/UpdateCurrency/UpdateCurrencyResponse/v1", partName = "response")
	@WebMethod(operationName = "UpdateCurrency", action = "http://www.sample.project.com.au/services/admin/UpdateCurrency/v1")
	public UpdateCurrencyResponse updateCurrency(
			@WebParam(partName = "request", name = "updateCurrencyRequest", targetNamespace = "http://www.sample.project.com.au/services/admin/UpdateCurrency/UpdateCurrencyRequest/v1") UpdateCurrencyRequest request)
			throws BusinessFault, TechnicalFault {
		return updateCurrencyManager.updateCurrencyResponse(request);
	}

	public UpdateCurrencyManager getUpdateCurrencyManager() {
		return updateCurrencyManager;
	}

	public void setUpdateCurrencyManager(UpdateCurrencyManager updateCurrencyManager) {
		this.updateCurrencyManager = updateCurrencyManager;
	}

}
