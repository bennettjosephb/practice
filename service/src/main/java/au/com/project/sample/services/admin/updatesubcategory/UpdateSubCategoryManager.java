package au.com.project.sample.services.admin.updatesubcategory;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import au.com.project.sample.process.SubCategoryController;
import au.com.project.sample.process.impl.dto.SubCategoryDTO;
import au.com.project.sample.services.model.SubCategoryInfo;

public class UpdateSubCategoryManager {

	private static Logger log = Logger.getLogger(UpdateSubCategoryManager.class);

	@Autowired
	private SubCategoryController subCategoryController;

	private SubCategoryDTO updateSubCategoryInfoDTO(
			UpdateSubCategoryRequest updateSubCategoryRequest) {
		SubCategoryDTO categoryInfoDTO = new SubCategoryDTO();

		SubCategoryInfo categoryInfo = updateSubCategoryRequest.getMessage()
				.getSubCategoryInfo();
		categoryInfoDTO.setCode(categoryInfo.getCode());
		categoryInfoDTO.setName(categoryInfo.getName());

		return categoryInfoDTO;
	}

	public UpdateSubCategoryResponse updateSubCategoryResponse(
			UpdateSubCategoryRequest updateSubCategoryRequest) {
		UpdateSubCategoryResponse updateSubCategoryResponse = new UpdateSubCategoryResponse();

		updateSubCategoryResponse.setMessage(new UpdateSubCategoryResponse.Message());

		subCategoryController
				.updateSubCategory(updateSubCategoryInfoDTO(updateSubCategoryRequest));

		updateSubCategoryResponse.getMessage().setStatus(true);

		return updateSubCategoryResponse;
	}

	public SubCategoryController getSubCategoryController() {
		return subCategoryController;
	}

	public void setSubCategoryController(SubCategoryController subCategoryController) {
		this.subCategoryController = subCategoryController;
	}

}
