package au.com.project.sample.registration.services.deletestate;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;

import au.com.project.sample.common.message.BusinessFault;
import au.com.project.sample.common.message.TechnicalFault;

public class DeleteStateImpl implements DeleteState {

	@WebResult(name = "deleteStateResponse", targetNamespace = "http://www.sample.project.com.au/registration/services/DeleteState/DeleteStateResponse/v1", partName = "response")
	@WebMethod(operationName = "DeleteState", action = "http://www.sample.project.com.au/registration/services/DeleteState/v1")
	public DeleteStateResponse deleteState(
			@WebParam(partName = "request", name = "deleteStateRequest", targetNamespace = "http://www.sample.project.com.au/registration/services/DeleteState/DeleteStateRequest/v1") DeleteStateRequest request)
			throws TechnicalFault, BusinessFault {
		// TODO Auto-generated method stub
		return null;
	}

}
