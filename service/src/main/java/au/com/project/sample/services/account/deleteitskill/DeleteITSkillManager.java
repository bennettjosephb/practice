package au.com.project.sample.services.account.deleteitskill;

import org.springframework.beans.factory.annotation.Autowired;

import au.com.project.sample.process.ITSkillController;
import au.com.project.sample.process.impl.dto.ITSkillDTO;
import au.com.project.sample.services.model.ITSkillInfo;

public class DeleteITSkillManager {

	@Autowired
	private ITSkillController itSkillController;

	private ITSkillDTO updateITSkillDTO(
			DeleteITSkillRequest deleteITSkillRequest) {
		ITSkillDTO itSkillDTO = new ITSkillDTO();

		ITSkillInfo itSkillInfo = deleteITSkillRequest.getMessage()
				.getITSkillInfo();

		itSkillDTO.setApplicantId(itSkillInfo.getApplicantId());
		itSkillDTO.setExperienceMonth(itSkillInfo.getExperienceMonth());
		itSkillDTO.setExperienceYear(itSkillInfo.getExperienceYear());
		itSkillDTO.setLastUsed(itSkillInfo.getLastUsed());
		itSkillDTO.setName(itSkillInfo.getName());
		itSkillDTO.setVersion(itSkillInfo.getVersion());

		return itSkillDTO;
	}

	public DeleteITSkillResponse deleteITSkillResponse(
			DeleteITSkillRequest deleteITSkillRequest) {
		DeleteITSkillResponse deleteITSkillResponse = new DeleteITSkillResponse();

		deleteITSkillResponse.setMessage(new DeleteITSkillResponse.Message());

		itSkillController.deleteITSkill(updateITSkillDTO(deleteITSkillRequest));

		deleteITSkillResponse.getMessage().setStatus(true);

		return deleteITSkillResponse;
	}

	public ITSkillController getItSkillController() {
		return itSkillController;
	}

	public void setItSkillController(ITSkillController itSkillController) {
		this.itSkillController = itSkillController;
	}
}
