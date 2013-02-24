package au.com.project.sample.services.admin.getcategory;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import au.com.project.sample.process.CategoryController;
import au.com.project.sample.process.impl.dto.CategoryDTO;
import au.com.project.sample.services.model.CategoryInfo;

public class GetCategoryManager {

	private static Logger log = Logger.getLogger(GetCategoryManager.class);

	@Autowired
	private CategoryController categoryController;

	private CategoryDTO updateCategoryInfoDTO(
			GetCategoryRequest getCategoryRequest) {
		CategoryDTO categoryInfoDTO = new CategoryDTO();

		CategoryInfo categoryInfo = getCategoryRequest.getMessage()
				.getCategoryInfo();
		categoryInfoDTO.setCode(categoryInfo.getCode());
		categoryInfoDTO.setName(categoryInfo.getName());

		return categoryInfoDTO;
	}

	private List<CategoryInfo> populateCategoryInfo(
			List<CategoryDTO> categoryDTO) {
		List<CategoryInfo> categoryInfos = new ArrayList<CategoryInfo>();

		return categoryInfos;

	}

	public GetCategoryResponse getCategoryResponse(
			GetCategoryRequest getCategoryRequest) {
		GetCategoryResponse getCategoryResponse = new GetCategoryResponse();

		getCategoryResponse.setMessage(new GetCategoryResponse.Message());

		getCategoryResponse
				.getMessage()
				.getCategories()
				.addAll(populateCategoryInfo(categoryController
						.findAllCategory()));

		getCategoryResponse.getMessage().setStatus(true);

		return getCategoryResponse;
	}

	public CategoryController getCategoryController() {
		return categoryController;
	}

	public void setCategoryController(CategoryController categoryController) {
		this.categoryController = categoryController;
	}

}
