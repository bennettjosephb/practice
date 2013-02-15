package au.com.project.sample.registration.services.getstate;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;

import au.com.project.sample.common.message.BusinessFault;
import au.com.project.sample.common.message.TechnicalFault;

public class GetStateImplementation implements GetState {

	@WebResult(name = "getStateResponse", targetNamespace = "http://www.sample.project.com.au/registration/services/GetState/GetStateResponse/v1", partName = "response")
	@WebMethod(operationName = "GetState", action = "http://www.sample.project.com.au/registration/services/GetState/v1")
	public GetStateResponse getState(
			@WebParam(partName = "request", name = "getStateRequest", targetNamespace = "http://www.sample.project.com.au/registration/services/GetState/GetStateRequest/v1") GetStateRequest request)
			throws BusinessFault, TechnicalFault {
		
		return new GetStateResponse();
	}

}
