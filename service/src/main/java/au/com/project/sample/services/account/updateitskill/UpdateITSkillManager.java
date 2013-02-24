package au.com.project.sample.services.account.updateitskill;

import org.springframework.beans.factory.annotation.Autowired;

import au.com.project.sample.process.ITSkillController;
import au.com.project.sample.process.impl.dto.ITSkillDTO;
import au.com.project.sample.services.model.ITSkillInfo;

public class UpdateITSkillManager {

	@Autowired
	private ITSkillController itSkillController;

	private ITSkillDTO populateITSkillDTO(
			UpdateITSkillRequest updateITSkillRequest) {
		ITSkillDTO itSkillDTO = new ITSkillDTO();

		ITSkillInfo itSkillInfo = updateITSkillRequest.getMessage()
				.getITSkillInfo();

		itSkillDTO.setApplicantId(itSkillInfo.getApplicantId());
		itSkillDTO.setExperienceMonth(itSkillInfo.getExperienceMonth());
		itSkillDTO.setId(itSkillInfo.getId());
		itSkillDTO.setExperienceYear(itSkillInfo.getExperienceYear());
		itSkillDTO.setLastUsed(itSkillInfo.getLastUsed());
		itSkillDTO.setName(itSkillInfo.getName());
		itSkillDTO.setVersion(itSkillInfo.getVersion());

		return itSkillDTO;
	}

	public UpdateITSkillResponse updateITSkillResponse(
			UpdateITSkillRequest updateITSkillRequest) {
		UpdateITSkillResponse updateITSkillResponse = new UpdateITSkillResponse();

		updateITSkillResponse.setMessage(new UpdateITSkillResponse.Message());

		itSkillController
				.updateITSkill(populateITSkillDTO(updateITSkillRequest));

		updateITSkillResponse.getMessage().setStatus(true);

		return updateITSkillResponse;
	}

	public ITSkillController getItSkillController() {
		return itSkillController;
	}

	public void setItSkillController(ITSkillController itSkillController) {
		this.itSkillController = itSkillController;
	}

}
