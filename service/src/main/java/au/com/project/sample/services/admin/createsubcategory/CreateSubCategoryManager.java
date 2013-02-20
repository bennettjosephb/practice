package au.com.project.sample.services.admin.createsubcategory;

import au.com.project.sample.process.SubCategoryController;

public class CreateSubCategoryManager {

	private SubCategoryController subCategoryController;

	public CreateSubCategoryResponse createSubCategoryResponse(
			CreateSubCategoryRequest createSubCategoryRequest) {

		CreateSubCategoryResponse createSubCategoryResponse = new CreateSubCategoryResponse();

		createSubCategoryResponse
				.setMessage(new CreateSubCategoryResponse.Message());

		subCategoryController.createSubCategory(null);
		
		return createSubCategoryResponse;
	}

	public SubCategoryController getSubCategoryController() {
		return subCategoryController;
	}

	public void setSubCategoryController(SubCategoryController subCategoryController) {
		this.subCategoryController = subCategoryController;
	}

}