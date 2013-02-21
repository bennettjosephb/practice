package au.com.project.sample.services.admin.createsubcategory;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import au.com.project.sample.process.SubCategoryController;
import au.com.project.sample.process.impl.dto.CategoryDTO;
import au.com.project.sample.process.impl.dto.SubCategoryDTO;
import au.com.project.sample.services.model.CategoryInfo;
import au.com.project.sample.services.model.SubCategoryInfo;

public class CreateSubCategoryManager {

	private static Logger log = Logger
			.getLogger(CreateSubCategoryManager.class);

	@Autowired
	private SubCategoryController subCategoryController;

	private SubCategoryDTO updateSubCategoryInfoDTO(
			CreateSubCategoryRequest createSubCategoryRequest) {
		SubCategoryDTO subCategoryDTO = new SubCategoryDTO();

		SubCategoryInfo subCategoryInfo = createSubCategoryRequest.getMessage()
				.getSubCategoryInfo();
		CategoryInfo categoryInfo = subCategoryInfo.getCategoryInfo();

		CategoryDTO categoryDTO = new CategoryDTO();

		categoryDTO.setCode(categoryInfo.getCode());
		categoryDTO.setName(categoryInfo.getName());

		subCategoryDTO.setCode(subCategoryInfo.getCode());
		subCategoryDTO.setName(subCategoryInfo.getName());
		subCategoryDTO.setCategoryDTO(categoryDTO);

		return subCategoryDTO;
	}

	public CreateSubCategoryResponse createSubCategoryResponse(
			CreateSubCategoryRequest createSubCategoryRequest) {

		CreateSubCategoryResponse createSubCategoryResponse = new CreateSubCategoryResponse();

		createSubCategoryResponse
				.setMessage(new CreateSubCategoryResponse.Message());

		subCategoryController
				.createSubCategory(updateSubCategoryInfoDTO(createSubCategoryRequest));

		createSubCategoryResponse.getMessage().setStatus(true);

		return createSubCategoryResponse;
	}

	public SubCategoryController getSubCategoryController() {
		return subCategoryController;
	}

	public void setSubCategoryController(
			SubCategoryController subCategoryController) {
		this.subCategoryController = subCategoryController;
	}

}