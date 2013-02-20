package au.com.project.sample.services.admin.createsubcategory;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;

import au.com.project.sample.common.message.BusinessFault;
import au.com.project.sample.common.message.TechnicalFault;

public class CreateSubCategoryImpl implements CreateSubCategory {

	private CreateSubCategoryManager createSubCategoryManager;

	@WebResult(name = "createSubCategoryResponse", targetNamespace = "http://www.sample.project.com.au/services/admin/CreateSubCategory/CreateSubCategoryResponse/v1", partName = "response")
	@WebMethod(operationName = "CreateSubCategory", action = "http://www.sample.project.com.au/services/admin/CreateSubCategory/v1")
	public CreateSubCategoryResponse createSubCategory(
			@WebParam(partName = "request", name = "createSubCategoryRequest", targetNamespace = "http://www.sample.project.com.au/services/admin/CreateSubCategory/CreateSubCategoryRequest/v1") CreateSubCategoryRequest request)
			throws TechnicalFault, BusinessFault {
		return null;
	}

	public CreateSubCategoryManager getCreateSubCategoryManager() {
		return createSubCategoryManager;
	}

	public void setCreateSubCategoryManager(
			CreateSubCategoryManager createSubCategoryManager) {
		this.createSubCategoryManager = createSubCategoryManager;
	}

}
