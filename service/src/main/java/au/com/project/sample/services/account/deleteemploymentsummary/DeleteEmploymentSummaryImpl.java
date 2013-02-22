package au.com.project.sample.services.account.deleteemploymentsummary;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;

import au.com.project.sample.common.message.BusinessFault;
import au.com.project.sample.common.message.TechnicalFault;

public class DeleteEmploymentSummaryImpl implements DeleteEmploymentSummary {

	@WebResult(name = "deleteEmploymentSummaryResponse", targetNamespace = "http://www.sample.project.com.au/services/account/DeleteEmploymentSummary/DeleteEmploymentSummaryResponse/v1", partName = "response")
	@WebMethod(operationName = "DeleteEmploymentSummary", action = "http://www.sample.project.com.au/services/account/DeleteEmploymentSummary/v1")
	public DeleteEmploymentSummaryResponse deleteEmploymentSummary(
			@WebParam(partName = "request", name = "deleteEmploymentSummaryRequest", targetNamespace = "http://www.sample.project.com.au/services/account/DeleteEmploymentSummary/DeleteEmploymentSummaryRequest/v1") DeleteEmploymentSummaryRequest request)
			throws BusinessFault, TechnicalFault {
		// TODO Auto-generated method stub
		return null;
	}

}
