package au.com.project.sample.services.admin.getstate;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;

import au.com.project.sample.common.message.BusinessFault;
import au.com.project.sample.common.message.TechnicalFault;

public class GetStateImpl implements GetState {

	@WebResult(name = "getStateResponse", targetNamespace = "http://www.sample.project.com.au/services/admin/GetState/GetStateResponse/v1", partName = "response")
	@WebMethod(operationName = "GetState", action = "http://www.sample.project.com.au/services/admin/GetState/v1")
	public GetStateResponse getState(
			@WebParam(partName = "request", name = "getStateRequest", targetNamespace = "http://www.sample.project.com.au/services/admin/GetState/GetStateRequest/v1") GetStateRequest request)
			throws TechnicalFault, BusinessFault {
		// TODO Auto-generated method stub
		return null;
	}

}
