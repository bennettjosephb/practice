package au.com.project.sample.services.admin.createstate;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;

import org.springframework.beans.factory.annotation.Autowired;

import au.com.project.sample.common.message.BusinessFault;
import au.com.project.sample.common.message.TechnicalFault;

public class CreateStateImpl implements CreateState {

	@Autowired
	private CreateStateManager createStateManager;

	@WebResult(name = "createStateResponse", targetNamespace = "http://www.sample.project.com.au/services/admin/CreateState/CreateStateResponse/v1", partName = "response")
	@WebMethod(operationName = "CreateState", action = "http://www.sample.project.com.au/services/admin/CreateState/v1")
	public CreateStateResponse createState(
			@WebParam(partName = "request", name = "createStateRequest", targetNamespace = "http://www.sample.project.com.au/services/admin/CreateState/CreateStateRequest/v1") CreateStateRequest request)
			throws TechnicalFault, BusinessFault {
		return createStateManager.createStateResponse(request);
	}

}
