package au.com.project.sample.services.admin.getsubcategory;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;

import au.com.project.sample.common.message.BusinessFault;
import au.com.project.sample.common.message.TechnicalFault;

public class GetSubCategoryImpl implements GetSubCategory {

	@WebResult(name = "getSubCategoryResponse", targetNamespace = "http://www.sample.project.com.au/services/admin/GetSubCategory/GetSubCategoryResponse/v1", partName = "response")
	@WebMethod(operationName = "GetSubCategory", action = "http://www.sample.project.com.au/services/admin/GetSubCategory/v1")
	public GetSubCategoryResponse getSubCategory(
			@WebParam(partName = "request", name = "getSubCategoryRequest", targetNamespace = "http://www.sample.project.com.au/services/admin/GetSubCategory/GetSubCategoryRequest/v1") GetSubCategoryRequest request)
			throws TechnicalFault, BusinessFault {
		// TODO Auto-generated method stub
		return null;
	}

}
