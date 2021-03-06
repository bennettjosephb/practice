package au.com.project.sample.services.admin.createcity;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.5.2
 * 2013-02-24T02:20:22.193+11:00
 * Generated source version: 2.5.2
 * 
 */
@WebService(targetNamespace = "http://www.sample.project.com.au/services/admin/CreateCity/v1", name = "CreateCity")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface CreateCity {

    @WebResult(name = "createCityResponse", targetNamespace = "http://www.sample.project.com.au/services/admin/CreateCity/CreateCityResponse/v1", partName = "response")
    @WebMethod(operationName = "CreateCity", action = "http://www.sample.project.com.au/services/admin/CreateCity/v1")
    public au.com.project.sample.services.admin.createcity.CreateCityResponse createCity(
        @WebParam(partName = "request", name = "createCityRequest", targetNamespace = "http://www.sample.project.com.au/services/admin/CreateCity/CreateCityRequest/v1")
        au.com.project.sample.services.admin.createcity.CreateCityRequest request
    ) throws au.com.project.sample.common.message.TechnicalFault, au.com.project.sample.common.message.BusinessFault;
}
