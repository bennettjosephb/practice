/*
 * To change this template, choose Tools | Templates
 * and open the template in the updateor.
 */
package au.com.project.sample.process.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import au.com.project.sample.domain.EducationSummary;
import au.com.project.sample.persistence.EducationSummaryDAO;
import au.com.project.sample.process.EducationSummaryController;
import au.com.project.sample.process.impl.dto.EducationSummaryDTO;
import au.com.project.sample.services.model.EducationType;

/**
 *
 * @author SONY
 */
public class EducationSummaryControllerImpl implements
		EducationSummaryController {

	@Autowired
	private EducationSummaryDAO educationSummaryDAO;

	private EducationSummary populateEducationSummary(
			EducationSummaryDTO educationSummaryDTO) {
		EducationSummary educationSummary = new EducationSummary();

		educationSummary.setCourseName(educationSummaryDTO.getCourseName());
		if (EducationType.FULL_TIME == educationSummaryDTO.getEducationType()) {
			educationSummary
					.setEducationType(au.com.project.sample.domain.EducationType.FULL_TIME);
		} else if (EducationType.PART_TIME == educationSummaryDTO
				.getEducationType()) {
			educationSummary
					.setEducationType(au.com.project.sample.domain.EducationType.PART_TIME);

		} else if (EducationType.DISTANCE_EDUCATION == educationSummaryDTO
				.getEducationType()) {
			educationSummary
					.setEducationType(au.com.project.sample.domain.EducationType.DISTANCE_EDUCATION);

		} else if (EducationType.OTHER == educationSummaryDTO
				.getEducationType()) {
			educationSummary
					.setEducationType(au.com.project.sample.domain.EducationType.OTHER);

		}
		educationSummary.setFromDate(educationSummaryDTO.getFromDate());
		educationSummary.setInstitute(educationSummaryDTO.getInstitute());
		educationSummary.setPassingYear(educationSummaryDTO.getPassingYear());
		educationSummary.setSpecialization(educationSummaryDTO
				.getSpecialization());
		educationSummary.setToDate(educationSummaryDTO.getTodate());

		return educationSummary;
	}

	public void createEducationSummary(EducationSummaryDTO educationSummaryDTO) {

		educationSummaryDAO
				.createEducationSummary(populateEducationSummary(educationSummaryDTO));

	}

	public void updateEducationSummary(EducationSummaryDTO educationSummaryDTO) {
	}

	public void deleteEducationSummary(EducationSummaryDTO educationSummaryDTO) {
	}

	public EducationSummaryDTO findEducationSummary(Object id) {
		return null;
	}

	public List<EducationSummaryDTO> findAllEducationSummary() {
		return null;
	}

	public List<EducationSummaryDTO> findRangeEducationSummary(int[] range) {
		return null;
	}

	public int countEducationSummary() {
		return 0;
	}

}
