package au.com.project.sample.services.account.deleteitskill;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;

import au.com.project.sample.common.message.BusinessFault;
import au.com.project.sample.common.message.TechnicalFault;

public class DeleteITSkillImpl implements DeleteITSkill {
	
	private DeleteITSkillManager deleteITSkillManager;

	@WebResult(name = "deleteITSkillResponse", targetNamespace = "http://www.sample.project.com.au/services/account/DeleteITSkill/DeleteITSkillResponse/v1", partName = "response")
	@WebMethod(operationName = "DeleteITSkill", action = "http://www.sample.project.com.au/services/account/DeleteITSkill/v1")
	public DeleteITSkillResponse deleteITSkill(
			@WebParam(partName = "request", name = "deleteITSkillRequest", targetNamespace = "http://www.sample.project.com.au/services/account/DeleteITSkill/DeleteITSkillRequest/v1") DeleteITSkillRequest request)
			throws BusinessFault, TechnicalFault {
		// TODO Auto-generated method stub
		return null;
	}

	public DeleteITSkillManager getDeleteITSkillManager() {
		return deleteITSkillManager;
	}

	public void setDeleteITSkillManager(DeleteITSkillManager deleteITSkillManager) {
		this.deleteITSkillManager = deleteITSkillManager;
	}

}
