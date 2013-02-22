package au.com.project.sample.services.account.createeducationsummary;

import org.springframework.beans.factory.annotation.Autowired;

import au.com.project.sample.process.EducationSummaryController;
import au.com.project.sample.process.impl.dto.EducationSummaryDTO;
import au.com.project.sample.services.model.EducationSummaryInfo;

/**
 * This class was generated by Apache CXF 2.5.2 2013-02-21T21:05:01.353+11:00
 * Generated source version: 2.5.2
 * 
 */
public class CreateEducationSummaryManager {
	
	@Autowired
	EducationSummaryController educationSummaryController;

	private EducationSummaryDTO updateEducationSummaryDTO(
			CreateEducationSummaryRequest createEducationSummaryRequest) {
		EducationSummaryDTO educationSummaryDTO = new EducationSummaryDTO();

		EducationSummaryInfo educationSummaryInfo = createEducationSummaryRequest.getMessage()
				.getEducationSummaryInfo();
		educationSummaryDTO.setCourseName(educationSummaryInfo.getCourseName());
		educationSummaryDTO.setEducationType(educationSummaryInfo.getEducationType());
		educationSummaryDTO.setFromDate(educationSummaryInfo.getFromDate());
		educationSummaryDTO.setInstitute(educationSummaryInfo.getInstitute());
		educationSummaryDTO.setPassingYear(educationSummaryInfo.getPassingYear());
		educationSummaryDTO.setSpecialization(educationSummaryInfo.getSpecialization());
		educationSummaryDTO.setTodate(educationSummaryInfo.getTodate());

		return educationSummaryDTO;
	}

	public CreateEducationSummaryResponse createEducationSummaryResponse(
			CreateEducationSummaryRequest createEducationSummaryRequest) {
		CreateEducationSummaryResponse createEducationSummaryResponse = new CreateEducationSummaryResponse();

		createEducationSummaryResponse
				.setMessage(new CreateEducationSummaryResponse.Message());

		educationSummaryController
				.createEducationSummary(updateEducationSummaryDTO(createEducationSummaryRequest));

		createEducationSummaryResponse.getMessage().setStatus(true);

		return createEducationSummaryResponse;
	}

	public EducationSummaryController getEducationSummaryController() {
		return educationSummaryController;
	}

	public void setEducationSummaryController(
			EducationSummaryController educationSummaryController) {
		this.educationSummaryController = educationSummaryController;
	}

}
