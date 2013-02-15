package au.com.project.sample.registration.services.savecountry;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.5.2
 * 2013-02-05T13:42:57.109+11:00
 * Generated source version: 2.5.2
 * 
 */
@WebService(targetNamespace = "http://www.sample.project.com.au/registration/services/SaveCountry/v1", name = "SaveCountry")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface SaveCountry {

    @WebResult(name = "saveCountryResponse", targetNamespace = "http://www.sample.project.com.au/registration/services/SaveCountry/v1", partName = "response")
    @WebMethod(operationName = "SaveCountry", action = "http://www.sample.project.com.au/registration/services/SaveCountry/v1")
    public au.com.project.sample.registration.services.savecountry.SaveCountryResponse saveCountry(
        @WebParam(partName = "request", name = "saveCountryRequest", targetNamespace = "http://www.sample.project.com.au/registration/services/SaveCountry/v1")
        au.com.project.sample.registration.services.savecountry.SaveCountryRequest request
    ) throws au.com.project.sample.common.message.BusinessFault, au.com.project.sample.common.message.TechnicalFault;
}
