package au.com.project.sample.registration.services.savecity;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.5.2
 * 2013-02-05T13:42:52.324+11:00
 * Generated source version: 2.5.2
 * 
 */
@WebService(targetNamespace = "http://www.sample.project.com.au/registration/services/SaveCity/v1", name = "SaveCity")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface SaveCity {

    @WebResult(name = "saveCityResponse", targetNamespace = "http://www.sample.project.com.au/registration/services/SaveCity/SaveCityResponse/v1", partName = "response")
    @WebMethod(operationName = "SaveCity", action = "http://www.sample.project.com.au/registration/services/SaveCity/v1")
    public au.com.project.sample.registration.services.savecity.SaveCityResponse saveCity(
        @WebParam(partName = "request", name = "saveCityRequest", targetNamespace = "http://www.sample.project.com.au/registration/services/SaveCity/SaveCityRequest/v1")
        au.com.project.sample.registration.services.savecity.SaveCityRequest request
    ) throws au.com.project.sample.common.message.TechnicalFault, au.com.project.sample.common.message.BusinessFault;
}
