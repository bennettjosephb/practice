package au.com.project.sample.registration.services.savestate;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;

import org.springframework.beans.factory.annotation.Autowired;

import au.com.project.sample.common.message.BusinessFault;
import au.com.project.sample.common.message.TechnicalFault;

public class SaveStateImpl implements SaveState {

	@Autowired
	private SaveStateManager saveStateManager;

//	@WebResult(name = "saveStateResponse", targetNamespace = "http://www.sample.project.com.au/registration/services/SaveState/SaveStateResponse/v1", partName = "response")
//	@WebMethod(operationName = "SaveState", action = "http://www.sample.project.com.au/registration/services/SaveState/v1")
//	public SaveStateResponse saveState(
//			@WebParam(partName = "request", name = "saveStateRequest", targetNamespace = "http://www.sample.project.com.au/registration/services/SaveState/SaveStateRequest/v1") SaveStateRequest request)
//			throws BusinessFault, TechnicalFault {
//		return saveStateManager.saveStateResponse(request);
//	}

	public SaveStateManager getSaveStateManager() {
		return saveStateManager;
	}

	public void setSaveStateManager(SaveStateManager saveStateManager) {
		this.saveStateManager = saveStateManager;
	}

	@WebResult(name = "saveStateResponse", targetNamespace = "http://www.sample.project.com.au/registration/services/SaveState/SaveStateResponse/v1", partName = "response")
	@WebMethod(operationName = "SaveState", action = "http://www.sample.project.com.au/registration/services/SaveState/v1")
	public SaveStateResponse saveState(
			@WebParam(partName = "request", name = "saveStateRequest", targetNamespace = "http://www.sample.project.com.au/registration/services/SaveState/SaveStateRequest/v1") SaveStateRequest request)
			throws BusinessFault, TechnicalFault {
		return saveStateManager.saveStateResponse(request);
	}

}
