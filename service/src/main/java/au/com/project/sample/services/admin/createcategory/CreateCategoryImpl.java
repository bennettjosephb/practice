package au.com.project.sample.services.admin.createcategory;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import au.com.project.sample.common.message.BusinessFault;
import au.com.project.sample.common.message.TechnicalFault;
import au.com.project.sample.persistence.impl.jpa.CategoryDAOImpl;

public class CreateCategoryImpl implements CreateCategory {

	private static Logger log = Logger.getLogger(CategoryDAOImpl.class);

	@Autowired
	private CreateCategoryManager createCategoryManager;

	@WebResult(name = "createCategoryResponse", targetNamespace = "http://www.sample.project.com.au/services/admin/CreateCategory/CreateCategoryResponse/v1", partName = "response")
	@WebMethod(operationName = "CreateCategory", action = "http://www.sample.project.com.au/services/admin/CreateCategory/v1")
	public CreateCategoryResponse createCategory(
			@WebParam(partName = "request", name = "createCategoryRequest", targetNamespace = "http://www.sample.project.com.au/services/admin/CreateCategory/CreateCategoryRequest/v1") CreateCategoryRequest request)
			throws TechnicalFault, BusinessFault {
		return createCategoryManager.createCategoryResponse(request);
	}

	public CreateCategoryManager getCreateCategoryManager() {
		return createCategoryManager;
	}

	public void setCreateCategoryManager(
			CreateCategoryManager createCategoryManager) {
		this.createCategoryManager = createCategoryManager;
	}

}
