package au.com.project.sample.services.admin.getsubcategory;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import au.com.project.sample.process.SubCategoryController;
import au.com.project.sample.process.impl.dto.SubCategoryDTO;
import au.com.project.sample.services.model.SubCategoryInfo;

public class GetSubCategoryManager {

	@Autowired
	private SubCategoryController stateController;

	private List<SubCategoryInfo> updateSubCategoryInfo(List<SubCategoryDTO> getSubCategoryRequest) {
		List<SubCategoryInfo> currencyInfo = new ArrayList<SubCategoryInfo>();
		// SubCategoryInfo currency = getSubCategoryRequest.getMessage().getSubCategoryInfo();
		// currencyDTO.setCode(currency.getCode());
		// currencyDTO.setName(currency.getName());
		return currencyInfo;
	}

	public GetSubCategoryResponse getSubCategoryResponse(GetSubCategoryRequest getSubCategoryRequest) {

		GetSubCategoryResponse getSubCategoryResponse = new GetSubCategoryResponse();

		getSubCategoryResponse.setMessage(new GetSubCategoryResponse.Message());

		// updateSubCategoryInfo(currencyController.findAllSubCategory());

		getSubCategoryResponse.getMessage().getSubcategories()
				.addAll(updateSubCategoryInfo(stateController.findAllSubCategory()));

		// getSubCategoryResponse.getMessage().setStatus(true);

		return getSubCategoryResponse;

	}

	public SubCategoryController getSubCategoryController() {
		return stateController;
	}

	public void setSubCategoryController(SubCategoryController stateController) {
		this.stateController = stateController;
	}
}
