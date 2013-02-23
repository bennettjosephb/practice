package au.com.project.sample.services.account.createitskill;

import org.springframework.beans.factory.annotation.Autowired;

import au.com.project.sample.process.ITSkillController;
import au.com.project.sample.process.impl.dto.ITSkillDTO;
import au.com.project.sample.services.model.itskillinfo.v1.ITSkillInfo;

public class CreateITSkillManager {

	@Autowired
	private ITSkillController itSkillController;

	private ITSkillDTO updateITSkillDTO(
			CreateITSkillRequest createITSkillRequest) {
		ITSkillDTO itSkillDTO = new ITSkillDTO();

		ITSkillInfo itSkillInfo = createITSkillRequest.getMessage()
				.getITSkillInfo();

		itSkillDTO.setApplicantId(itSkillInfo.getApplicantId());
		itSkillDTO.setExperienceMonth(itSkillInfo.getExperienceMonth());
		itSkillDTO.setExperienceYear(itSkillInfo.getExperienceYear());
		itSkillDTO.setLastUsed(itSkillInfo.getLastUsed());
		itSkillDTO.setName(itSkillInfo.getName());
		itSkillDTO.setVersion(itSkillInfo.getVersion());

		return itSkillDTO;
	}

	public CreateITSkillResponse createITSkillResponse(
			CreateITSkillRequest createITSkillRequest) {
		CreateITSkillResponse createITSkillResponse = new CreateITSkillResponse();

		createITSkillResponse.setMessage(new CreateITSkillResponse.Message());

		itSkillController.createITSkill(updateITSkillDTO(createITSkillRequest));

		createITSkillResponse.getMessage().setStatus(true);

		return createITSkillResponse;
	}

	public ITSkillController getItSkillController() {
		return itSkillController;
	}

	public void setItSkillController(ITSkillController itSkillController) {
		this.itSkillController = itSkillController;
	}
}
