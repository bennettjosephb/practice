package au.com.project.sample.services.admin.getcategory;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;

import org.springframework.beans.factory.annotation.Autowired;

import au.com.project.sample.common.message.BusinessFault;
import au.com.project.sample.common.message.TechnicalFault;

public class GetCategoryImpl implements GetCategory {

	@Autowired
	private GetCategoryManager getCategoryManager;

	@WebResult(name = "getCategoryResponse", targetNamespace = "http://www.sample.project.com.au/services/admin/GetCategory/GetCategoryResponse/v1", partName = "response")
	@WebMethod(operationName = "GetCategory", action = "http://www.sample.project.com.au/services/admin/GetCategory/v1")
	public GetCategoryResponse getCategory(
			@WebParam(partName = "request", name = "getCategoryRequest", targetNamespace = "http://www.sample.project.com.au/services/admin/GetCategory/GetCategoryRequest/v1") GetCategoryRequest request)
			throws BusinessFault, TechnicalFault {
		return getCategoryManager.getCategoryResponse(request);
	}

	public GetCategoryManager getGetCategoryManager() {
		return getCategoryManager;
	}

	public void setGetCategoryManager(GetCategoryManager getCategoryManager) {
		this.getCategoryManager = getCategoryManager;
	}

}
