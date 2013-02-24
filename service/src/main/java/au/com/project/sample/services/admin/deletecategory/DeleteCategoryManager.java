package au.com.project.sample.services.admin.deletecategory;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import au.com.project.sample.process.CategoryController;
import au.com.project.sample.process.impl.dto.CategoryDTO;
import au.com.project.sample.services.model.CategoryInfo;

public class DeleteCategoryManager {

	private static Logger log = Logger.getLogger(DeleteCategoryManager.class);

	@Autowired
	private CategoryController categoryController;

	private CategoryDTO updateCategoryInfoDTO(
			DeleteCategoryRequest deleteCategoryRequest) {
		CategoryDTO categoryInfoDTO = new CategoryDTO();

		CategoryInfo categoryInfo = deleteCategoryRequest.getMessage()
				.getCategoryInfo();
		categoryInfoDTO.setCode(categoryInfo.getCode());
		categoryInfoDTO.setName(categoryInfo.getName());

		return categoryInfoDTO;
	}

	public DeleteCategoryResponse deleteCategoryResponse(
			DeleteCategoryRequest deleteCategoryRequest) {
		DeleteCategoryResponse deleteCategoryResponse = new DeleteCategoryResponse();

		deleteCategoryResponse.setMessage(new DeleteCategoryResponse.Message());

		categoryController
				.deleteCategory(updateCategoryInfoDTO(deleteCategoryRequest));

		deleteCategoryResponse.getMessage().setStatus(true);

		return deleteCategoryResponse;
	}

	public CategoryController getCategoryController() {
		return categoryController;
	}

	public void setCategoryController(CategoryController categoryController) {
		this.categoryController = categoryController;
	}


}
