package au.com.project.sample.registration.services.setstate;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;

import au.com.project.sample.common.message.BusinessFault;
import au.com.project.sample.common.message.TechnicalFault;

public class SetStateImpl implements SetState {

	@WebResult(name = "setStateResponse", targetNamespace = "http://www.sample.project.com.au/registration/services/SetState/SetStateResponse/v1", partName = "response")
	@WebMethod(operationName = "SetState", action = "http://www.sample.project.com.au/registration/services/SetState/v1")
	public SetStateResponse setState(
			@WebParam(partName = "request", name = "setStateRequest", targetNamespace = "http://www.sample.project.com.au/registration/services/SetState/SetStateRequest/v1") SetStateRequest request)
			throws TechnicalFault, BusinessFault {
		// TODO Auto-generated method stub
		return null;
	}

}
