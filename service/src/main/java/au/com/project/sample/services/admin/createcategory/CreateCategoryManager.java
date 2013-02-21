package au.com.project.sample.services.admin.createcategory;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import au.com.project.sample.process.CategoryController;
import au.com.project.sample.process.impl.dto.CategoryDTO;
import au.com.project.sample.services.model.CategoryInfo;

public class CreateCategoryManager {

	private static Logger log = Logger.getLogger(CreateCategoryManager.class);

	@Autowired
	private CategoryController categoryController;

	private CategoryDTO updateCategoryInfoDTO(
			CreateCategoryRequest createCategoryRequest) {
		CategoryDTO categoryInfoDTO = new CategoryDTO();

		CategoryInfo categoryInfo = createCategoryRequest.getMessage()
				.getCategoryInfo();
		categoryInfoDTO.setCode(categoryInfo.getCode());
		categoryInfoDTO.setName(categoryInfo.getName());

		return categoryInfoDTO;
	}

	public CreateCategoryResponse createCategoryResponse(
			CreateCategoryRequest createCategoryRequest) {
		CreateCategoryResponse createCategoryResponse = new CreateCategoryResponse();

		createCategoryResponse.setMessage(new CreateCategoryResponse.Message());

		categoryController
				.createCategory(updateCategoryInfoDTO(createCategoryRequest));

		createCategoryResponse.getMessage().setStatus(true);

		return createCategoryResponse;
	}

	public CategoryController getCategoryController() {
		return categoryController;
	}

	public void setCategoryController(CategoryController categoryController) {
		this.categoryController = categoryController;
	}

}
