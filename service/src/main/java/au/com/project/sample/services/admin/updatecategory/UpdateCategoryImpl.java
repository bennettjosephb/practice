package au.com.project.sample.services.admin.updatecategory;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;

import org.springframework.beans.factory.annotation.Autowired;

import au.com.project.sample.common.message.BusinessFault;
import au.com.project.sample.common.message.TechnicalFault;

public class UpdateCategoryImpl implements UpdateCategory {

	@Autowired
	private UpdateCategoryManager updateCategoryManager;

	@WebResult(name = "updateCategoryResponse", targetNamespace = "http://www.sample.project.com.au/services/admin/UpdateCategory/UpdateCategoryResponse/v1", partName = "response")
	@WebMethod(operationName = "UpdateCategory", action = "http://www.sample.project.com.au/services/admin/UpdateCategory/v1")
	public UpdateCategoryResponse updateCategory(
			@WebParam(partName = "request", name = "updateCategoryRequest", targetNamespace = "http://www.sample.project.com.au/services/admin/UpdateCategory/UpdateCategoryRequest/v1") UpdateCategoryRequest request)
			throws BusinessFault, TechnicalFault {
		return updateCategoryManager.updateCategoryResponse(request);
	}

	public UpdateCategoryManager getUpdateCategoryManager() {
		return updateCategoryManager;
	}

	public void setUpdateCategoryManager(
			UpdateCategoryManager updateCategoryManager) {
		this.updateCategoryManager = updateCategoryManager;
	}

}
