package au.com.project.sample.services.account.updateitskill;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;

import org.springframework.beans.factory.annotation.Autowired;

import au.com.project.sample.common.message.BusinessFault;
import au.com.project.sample.common.message.TechnicalFault;

public class UpdateITSkillImpl implements UpdateITSkill {

	@Autowired
	private UpdateITSkillManager updateITSkillManager;
	
	@WebResult(name = "updateITSkillResponse", targetNamespace = "http://www.sample.project.com.au/services/account/UpdateITSkill/UpdateITSkillResponse/v1", partName = "response")
	@WebMethod(operationName = "UpdateITSkill", action = "http://www.sample.project.com.au/services/account/UpdateITSkill/v1")
	public UpdateITSkillResponse updateITSkill(
			@WebParam(partName = "request", name = "updateITSkillRequest", targetNamespace = "http://www.sample.project.com.au/services/account/UpdateITSkill/UpdateITSkillRequest/v1") UpdateITSkillRequest request)
			throws BusinessFault, TechnicalFault {
		return updateITSkillManager.updateITSkillResponse(request);
	}

	public UpdateITSkillManager getUpdateITSkillManager() {
		return updateITSkillManager;
	}

	public void setUpdateITSkillManager(UpdateITSkillManager updateITSkillManager) {
		this.updateITSkillManager = updateITSkillManager;
	}

}
