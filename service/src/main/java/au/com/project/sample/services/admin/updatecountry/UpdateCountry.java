package au.com.project.sample.services.admin.updatecountry;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.5.2
 * 2013-02-24T02:22:02.055+11:00
 * Generated source version: 2.5.2
 *
 */
@WebService(targetNamespace = "http://www.sample.project.com.au/services/admin/UpdateCountry/v1", name = "UpdateCountry")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface UpdateCountry {

    @WebResult(name = "updateCountryResponse", targetNamespace = "http://www.sample.project.com.au/services/admin/UpdateCountry/UpdateCountryResponse/v1", partName = "response")
    @WebMethod(operationName = "UpdateCountry", action = "http://www.sample.project.com.au/services/admin/UpdateCountry/v1")
    public au.com.project.sample.services.admin.updatecountry.UpdateCountryResponse updateCountry(
        @WebParam(partName = "request", name = "updateCountryRequest", targetNamespace = "http://www.sample.project.com.au/services/admin/UpdateCountry/UpdateCountryRequest/v1")
        au.com.project.sample.services.admin.updatecountry.UpdateCountryRequest request
    ) throws au.com.project.sample.common.message.TechnicalFault, au.com.project.sample.common.message.BusinessFault;
}