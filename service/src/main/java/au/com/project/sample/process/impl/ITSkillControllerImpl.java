/*
 * To change this template, choose Tools | Templates
 * and open the template in the updateor.
 */
package au.com.project.sample.process.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import au.com.project.sample.domain.Applicant;
import au.com.project.sample.domain.ITSkill;
import au.com.project.sample.persistence.ApplicantDAO;
import au.com.project.sample.persistence.ITSkillDAO;
import au.com.project.sample.process.ITSkillController;
import au.com.project.sample.process.impl.dto.ITSkillDTO;

/**
 *
 * @author SONY
 */
public class ITSkillControllerImpl implements ITSkillController {

	@Autowired
	private ITSkillDAO itSkillDAO;

	@Autowired
	private ApplicantDAO applicantDAO;

	private ITSkillDTO populateITSkillDTO(ITSkill iTSkill) {
		ITSkillDTO itSkillDTO = new ITSkillDTO();
		itSkillDTO.setApplicantId(iTSkill.getApplicant().getId());
		itSkillDTO.setExperienceMonth(iTSkill.getExperienceMonth());
		itSkillDTO.setExperienceYear(iTSkill.getExperienceYear());
		itSkillDTO.setId(iTSkill.getId());
		itSkillDTO.setLastUsed(iTSkill.getLastUsed());
		itSkillDTO.setName(iTSkill.getName());
		itSkillDTO.setVersion(iTSkill.getVersion());
		return itSkillDTO;
	}

	private ITSkill populateITSkill(ITSkillDTO iTSkillDTO) {
		Applicant applicant = applicantDAO.findApplicant(iTSkillDTO
				.getApplicantId());
		ITSkill itSkill = new ITSkill();
		itSkill.setExperienceMonth(iTSkillDTO.getExperienceMonth());
		itSkill.setExperienceYear(iTSkillDTO.getExperienceYear());
		itSkill.setId(iTSkillDTO.getId());
		itSkill.setLastUsed(iTSkillDTO.getLastUsed());
		itSkill.setName(iTSkillDTO.getName());
		itSkill.setVersion(iTSkillDTO.getVersion());
		itSkill.setApplicant(applicant);
		return itSkill;
	}

	public ITSkillDTO createITSkill(ITSkillDTO iTSkillDTO) {
		return populateITSkillDTO(itSkillDAO
				.createITSkill(populateITSkill(iTSkillDTO)));
	}

	public ITSkillDTO updateITSkill(ITSkillDTO iTSkillDTO) {
		return populateITSkillDTO(itSkillDAO
				.updateITSkill(populateITSkill(iTSkillDTO)));
	}

	public void deleteITSkill(ITSkillDTO iTSkillDTO) {
		itSkillDAO
		.deleteITSkill(populateITSkill(iTSkillDTO));
	}

	public ITSkillDTO findITSkill(Object id) {
		return null;
	}

	public List<ITSkillDTO> findAllITSkill() {
		return null;
	}

	public List<ITSkillDTO> findRangeITSkill(int[] range) {
		return null;
	}

	public int countITSkill() {
		return 0;
	}

	public ITSkillDAO getItSkillDAO() {
		return itSkillDAO;
	}

	public void setItSkillDAO(ITSkillDAO itSkillDAO) {
		this.itSkillDAO = itSkillDAO;
	}

}
