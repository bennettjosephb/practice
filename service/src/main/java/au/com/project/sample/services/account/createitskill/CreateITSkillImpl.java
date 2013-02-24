package au.com.project.sample.services.account.createitskill;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;

import org.springframework.beans.factory.annotation.Autowired;

import au.com.project.sample.common.message.BusinessFault;
import au.com.project.sample.common.message.TechnicalFault;

public class CreateITSkillImpl implements CreateITSkill {

	@Autowired
	private CreateITSkillManager createITSkillManager;

	@WebResult(name = "createITSkillResponse", targetNamespace = "http://www.sample.project.com.au/services/account/CreateITSkill/CreateITSkillResponse/v1", partName = "response")
	@WebMethod(operationName = "CreateITSkill", action = "http://www.sample.project.com.au/services/account/CreateITSkill/v1")
	public CreateITSkillResponse createITSkill(
			@WebParam(partName = "request", name = "createITSkillRequest", targetNamespace = "http://www.sample.project.com.au/services/account/CreateITSkill/CreateITSkillRequest/v1") CreateITSkillRequest request)
			throws TechnicalFault, BusinessFault {
		return createITSkillManager.createITSkillResponse(request);
	}

	public CreateITSkillManager getCreateITSkillManager() {
		return createITSkillManager;
	}

	public void setCreateITSkillManager(
			CreateITSkillManager createITSkillManager) {
		this.createITSkillManager = createITSkillManager;
	}

}
