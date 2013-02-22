package au.com.project.sample.services.account.updateemploymentsummary;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;

import au.com.project.sample.common.message.BusinessFault;
import au.com.project.sample.common.message.TechnicalFault;

public class UpdateEmploymentSummaryImpl implements UpdateEmploymentSummary {

	@WebResult(name = "updateEmploymentSummaryResponse", targetNamespace = "http://www.sample.project.com.au/services/account/UpdateEmploymentSummary/UpdateEmploymentSummaryResponse/v1", partName = "response")
	@WebMethod(operationName = "UpdateEmploymentSummary", action = "http://www.sample.project.com.au/services/account/UpdateEmploymentSummary/v1")
	public UpdateEmploymentSummaryResponse updateEmploymentSummary(
			@WebParam(partName = "request", name = "updateEmploymentSummaryRequest", targetNamespace = "http://www.sample.project.com.au/services/account/UpdateEmploymentSummary/UpdateEmploymentSummaryRequest/v1") UpdateEmploymentSummaryRequest request)
			throws TechnicalFault, BusinessFault {
		// TODO Auto-generated method stub
		return null;
	}

}
