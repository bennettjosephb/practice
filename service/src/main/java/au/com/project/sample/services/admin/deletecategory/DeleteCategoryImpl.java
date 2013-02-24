package au.com.project.sample.services.admin.deletecategory;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;

import org.springframework.beans.factory.annotation.Autowired;

import au.com.project.sample.common.message.BusinessFault;
import au.com.project.sample.common.message.TechnicalFault;

public class DeleteCategoryImpl implements DeleteCategory {

	@Autowired
	private DeleteCategoryManager deleteCategoryManager;

	@WebResult(name = "deleteCategoryResponse", targetNamespace = "http://www.sample.project.com.au/services/admin/DeleteCategory/DeleteCategoryResponse/v1", partName = "response")
	@WebMethod(operationName = "DeleteCategory", action = "http://www.sample.project.com.au/services/admin/DeleteCategory/v1")
	public DeleteCategoryResponse deleteCategory(
			@WebParam(partName = "request", name = "deleteCategoryRequest", targetNamespace = "http://www.sample.project.com.au/services/admin/DeleteCategory/DeleteCategoryRequest/v1") DeleteCategoryRequest request)
			throws TechnicalFault, BusinessFault {
		return deleteCategoryManager.deleteCategoryResponse(request);
	}

	public DeleteCategoryManager getDeleteCategoryManager() {
		return deleteCategoryManager;
	}

	public void setDeleteCategoryManager(
			DeleteCategoryManager deleteCategoryManager) {
		this.deleteCategoryManager = deleteCategoryManager;
	}

}
