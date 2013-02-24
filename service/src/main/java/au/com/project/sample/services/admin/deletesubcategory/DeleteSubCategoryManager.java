package au.com.project.sample.services.admin.deletesubcategory;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import au.com.project.sample.process.SubCategoryController;
import au.com.project.sample.process.impl.dto.CategoryDTO;
import au.com.project.sample.process.impl.dto.SubCategoryDTO;
import au.com.project.sample.services.model.CategoryInfo;
import au.com.project.sample.services.model.SubCategoryInfo;

public class DeleteSubCategoryManager {

	private static Logger log = Logger
			.getLogger(DeleteSubCategoryManager.class);

	@Autowired
	private SubCategoryController subCategoryController;

	private SubCategoryDTO updateSubCategoryInfoDTO(
			DeleteSubCategoryRequest deleteSubCategoryRequest) {
		SubCategoryDTO subCategoryDTO = new SubCategoryDTO();

		SubCategoryInfo subCategoryInfo = deleteSubCategoryRequest.getMessage()
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

	public DeleteSubCategoryResponse deleteSubCategoryResponse(
			DeleteSubCategoryRequest deleteSubCategoryRequest) {

		DeleteSubCategoryResponse deleteSubCategoryResponse = new DeleteSubCategoryResponse();

		deleteSubCategoryResponse
				.setMessage(new DeleteSubCategoryResponse.Message());

		subCategoryController
				.deleteSubCategory(updateSubCategoryInfoDTO(deleteSubCategoryRequest));

		deleteSubCategoryResponse.getMessage().setStatus(true);

		return deleteSubCategoryResponse;
	}

	public SubCategoryController getSubCategoryController() {
		return subCategoryController;
	}

	public void setSubCategoryController(
			SubCategoryController subCategoryController) {
		this.subCategoryController = subCategoryController;
	}

}
