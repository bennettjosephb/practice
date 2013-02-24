package au.com.project.sample.services.admin.updatesubcategory;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;

import au.com.project.sample.common.message.BusinessFault;
import au.com.project.sample.common.message.TechnicalFault;

public class UpdateSubCategoryImpl implements UpdateSubCategory {

	@WebResult(name = "updateSubCategoryResponse", targetNamespace = "http://www.sample.project.com.au/services/admin/UpdateSubCategory/UpdateSubCategoryResponse/v1", partName = "response")
	@WebMethod(operationName = "UpdateSubCategory", action = "http://www.sample.project.com.au/services/admin/UpdateSubCategory/v1")
	public UpdateSubCategoryResponse updateSubCategory(
			@WebParam(partName = "request", name = "updateSubCategoryRequest", targetNamespace = "http://www.sample.project.com.au/services/admin/UpdateSubCategory/UpdateSubCategoryRequest/v1") UpdateSubCategoryRequest request)
			throws BusinessFault, TechnicalFault {
		// TODO Auto-generated method stub
		return null;
	}

}
