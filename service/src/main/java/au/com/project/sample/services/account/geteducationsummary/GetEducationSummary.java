package au.com.project.sample.services.account.geteducationsummary;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.5.2
 * 2013-03-09T00:42:39.869+11:00
 * Generated source version: 2.5.2
 * 
 */
@WebService(targetNamespace = "http://www.sample.project.com.au/services/account/GetEducationSummary/v1", name = "GetEducationSummary")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface GetEducationSummary {

    @WebResult(name = "getEducationSummaryResponse", targetNamespace = "http://www.sample.project.com.au/services/account/GetEducationSummary/GetEducationSummaryResponse/v1", partName = "response")
    @WebMethod(operationName = "GetEducationSummary", action = "http://www.sample.project.com.au/services/account/GetEducationSummary/v1")
    public au.com.project.sample.services.account.geteducationsummary.GetEducationSummaryResponse getEducationSummary(
        @WebParam(partName = "request", name = "getEducationSummaryRequest", targetNamespace = "http://www.sample.project.com.au/services/account/GetEducationSummary/GetEducationSummaryRequest/v1")
        au.com.project.sample.services.account.geteducationsummary.GetEducationSummaryRequest request
    ) throws au.com.project.sample.common.message.BusinessFault, au.com.project.sample.common.message.TechnicalFault;
}
