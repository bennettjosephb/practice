package au.com.project.sample.services.admin.updatestate;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;

import au.com.project.sample.common.message.BusinessFault;
import au.com.project.sample.common.message.TechnicalFault;

public class UpdateStateImpl implements UpdateState {

	@WebResult(name = "updateStateResponse", targetNamespace = "http://www.sample.project.com.au/services/admin/UpdateState/UpdateStateResponse/v1", partName = "response")
	@WebMethod(operationName = "UpdateState", action = "http://www.sample.project.com.au/services/admin/UpdateState/v1")
	public UpdateStateResponse updateState(
			@WebParam(partName = "request", name = "updateStateRequest", targetNamespace = "http://www.sample.project.com.au/services/admin/UpdateState/UpdateStateRequest/v1") UpdateStateRequest request)
			throws TechnicalFault, BusinessFault {
		// TODO Auto-generated method stub
		return null;
	}

}
