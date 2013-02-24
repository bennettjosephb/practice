package au.com.project.sample.services.admin.deletesubcategory;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;

import org.springframework.beans.factory.annotation.Autowired;

import au.com.project.sample.common.message.BusinessFault;
import au.com.project.sample.common.message.TechnicalFault;

public class DeleteSubCategoryImpl implements DeleteSubCategory {

	@Autowired
	private DeleteSubCategoryManager deleteSubCategoryManager;

	@WebResult(name = "deleteSubCategoryResponse", targetNamespace = "http://www.sample.project.com.au/services/admin/DeleteSubCategory/DeleteSubCategoryResponse/v1", partName = "response")
	@WebMethod(operationName = "DeleteSubCategory", action = "http://www.sample.project.com.au/services/admin/DeleteSubCategory/v1")
	public DeleteSubCategoryResponse deleteSubCategory(
			@WebParam(partName = "request", name = "deleteSubCategoryRequest", targetNamespace = "http://www.sample.project.com.au/services/admin/DeleteSubCategory/DeleteSubCategoryRequest/v1") DeleteSubCategoryRequest request)
			throws TechnicalFault, BusinessFault {
		return deleteSubCategoryManager.deleteSubCategoryResponse(request);
	}

	public DeleteSubCategoryManager getDeleteSubCategoryManager() {
		return deleteSubCategoryManager;
	}

	public void setDeleteSubCategoryManager(
			DeleteSubCategoryManager deleteSubCategoryManager) {
		this.deleteSubCategoryManager = deleteSubCategoryManager;
	}

}
