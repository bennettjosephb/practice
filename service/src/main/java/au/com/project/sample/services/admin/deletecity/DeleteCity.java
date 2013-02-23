package au.com.project.sample.services.admin.deletecity;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.5.2
 * 2013-02-24T02:20:54.448+11:00
 * Generated source version: 2.5.2
 *
 */
@WebService(targetNamespace = "http://www.sample.project.com.au/services/admin/DeleteCity/v1", name = "DeleteCity")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface DeleteCity {

    @WebResult(name = "deleteCityResponse", targetNamespace = "http://www.sample.project.com.au/services/admin/DeleteCity/DeleteCityResponse/v1", partName = "response")
    @WebMethod(operationName = "DeleteCity", action = "http://www.sample.project.com.au/services/admin/DeleteCity/v1")
    public au.com.project.sample.services.admin.deletecity.DeleteCityResponse deleteCity(
        @WebParam(partName = "request", name = "deleteCityRequest", targetNamespace = "http://www.sample.project.com.au/services/admin/DeleteCity/DeleteCityRequest/v1")
        au.com.project.sample.services.admin.deletecity.DeleteCityRequest request
    ) throws au.com.project.sample.common.message.TechnicalFault, au.com.project.sample.common.message.BusinessFault;
}
