package au.com.project.sample.services.admin.updatecategory;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import au.com.project.sample.process.CategoryController;
import au.com.project.sample.process.impl.dto.CategoryDTO;
import au.com.project.sample.services.model.CategoryInfo;

public class UpdateCategoryManager {

	private static Logger log = Logger.getLogger(UpdateCategoryManager.class);

	@Autowired
	private CategoryController categoryController;

	private CategoryDTO updateCategoryInfoDTO(
			UpdateCategoryRequest updateCategoryRequest) {
		CategoryDTO categoryInfoDTO = new CategoryDTO();

		CategoryInfo categoryInfo = updateCategoryRequest.getMessage()
				.getCategoryInfo();
		categoryInfoDTO.setCode(categoryInfo.getCode());
		categoryInfoDTO.setName(categoryInfo.getName());

		return categoryInfoDTO;
	}

	public UpdateCategoryResponse updateCategoryResponse(
			UpdateCategoryRequest updateCategoryRequest) {
		UpdateCategoryResponse updateCategoryResponse = new UpdateCategoryResponse();

		updateCategoryResponse.setMessage(new UpdateCategoryResponse.Message());

		categoryController
				.updateCategory(updateCategoryInfoDTO(updateCategoryRequest));

		updateCategoryResponse.getMessage().setStatus(true);

		return updateCategoryResponse;
	}

	public CategoryController getCategoryController() {
		return categoryController;
	}

	public void setCategoryController(CategoryController categoryController) {
		this.categoryController = categoryController;
	}

}
