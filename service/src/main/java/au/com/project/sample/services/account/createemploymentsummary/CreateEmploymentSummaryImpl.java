package au.com.project.sample.services.account.createemploymentsummary;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;

import org.springframework.beans.factory.annotation.Autowired;

import au.com.project.sample.common.message.BusinessFault;
import au.com.project.sample.common.message.TechnicalFault;

public class CreateEmploymentSummaryImpl implements CreateEmploymentSummary {

	@Autowired
	private CreateEmploymentSummaryManager createEmploymentSummaryManager;
	
	@WebResult(name = "createEmploymentSummaryResponse", targetNamespace = "http://www.sample.project.com.au/services/account/CreateEmploymentSummary/CreateEmploymentSummaryResponse/v1", partName = "response")
	@WebMethod(operationName = "CreateEmploymentSummary", action = "http://www.sample.project.com.au/services/account/CreateEmploymentSummary/v1")
	public CreateEmploymentSummaryResponse createEmploymentSummary(
			@WebParam(partName = "request", name = "createEmploymentSummaryRequest", targetNamespace = "http://www.sample.project.com.au/services/account/CreateEmploymentSummary/CreateEmploymentSummaryRequest/v1") CreateEmploymentSummaryRequest request)
			throws BusinessFault, TechnicalFault {
		// TODO Auto-generated method stub
		return null;
	}

	public CreateEmploymentSummaryManager getCreateEmploymentSummaryManager() {
		return createEmploymentSummaryManager;
	}

	public void setCreateEmploymentSummaryManager(
			CreateEmploymentSummaryManager createEmploymentSummaryManager) {
		this.createEmploymentSummaryManager = createEmploymentSummaryManager;
	}

}
