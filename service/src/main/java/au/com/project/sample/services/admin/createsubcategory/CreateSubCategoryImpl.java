package au.com.project.sample.services.admin.createsubcategory;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import au.com.project.sample.common.message.BusinessFault;
import au.com.project.sample.common.message.TechnicalFault;
import au.com.project.sample.process.impl.DesignationControllerImpl;

public class CreateSubCategoryImpl implements CreateSubCategory {

	private static Logger log = Logger
			.getLogger(CreateSubCategoryImpl.class);
	
	@Autowired
	private CreateSubCategoryManager createSubCategoryManager;

	@WebResult(name = "createSubCategoryResponse", targetNamespace = "http://www.sample.project.com.au/services/admin/CreateSubCategory/CreateSubCategoryResponse/v1", partName = "response")
	@WebMethod(operationName = "CreateSubCategory", action = "http://www.sample.project.com.au/services/admin/CreateSubCategory/v1")
	public CreateSubCategoryResponse createSubCategory(
			@WebParam(partName = "request", name = "createSubCategoryRequest", targetNamespace = "http://www.sample.project.com.au/services/admin/CreateSubCategory/CreateSubCategoryRequest/v1") CreateSubCategoryRequest request)
			throws TechnicalFault, BusinessFault {
		return createSubCategoryManager.createSubCategoryResponse(request);
	}

	public CreateSubCategoryManager getCreateSubCategoryManager() {
		return createSubCategoryManager;
	}

	public void setCreateSubCategoryManager(
			CreateSubCategoryManager createSubCategoryManager) {
		this.createSubCategoryManager = createSubCategoryManager;
	}

}
