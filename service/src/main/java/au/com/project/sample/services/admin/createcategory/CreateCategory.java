package au.com.project.sample.services.admin.createcategory;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.5.2
 * 2013-02-20T20:47:14.200+11:00
 * Generated source version: 2.5.2
 * 
 */
@WebService(targetNamespace = "http://www.sample.project.com.au/services/admin/CreateCategory/v1", name = "CreateCategory")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface CreateCategory {

    @WebResult(name = "createCategoryResponse", targetNamespace = "http://www.sample.project.com.au/services/admin/CreateCategory/CreateCategoryResponse/v1", partName = "response")
    @WebMethod(operationName = "CreateCategory", action = "http://www.sample.project.com.au/services/admin/CreateCategory/v1")
    public au.com.project.sample.services.admin.createcategory.CreateCategoryResponse createCategory(
        @WebParam(partName = "request", name = "createCategoryRequest", targetNamespace = "http://www.sample.project.com.au/services/admin/CreateCategory/CreateCategoryRequest/v1")
        au.com.project.sample.services.admin.createcategory.CreateCategoryRequest request
    ) throws au.com.project.sample.common.message.TechnicalFault, au.com.project.sample.common.message.BusinessFault;
}