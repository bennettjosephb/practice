package au.com.project.sample.services.account.deleteeducationsummary;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * This class was generated by Apache CXF 2.5.2
 * 2013-03-09T00:42:24.995+11:00
 * Generated source version: 2.5.2
 * 
 */
@WebService(targetNamespace = "http://www.sample.project.com.au/services/account/DeleteEducationSummary/v1", name = "DeleteEducationSummary")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface DeleteEducationSummary {

    @WebResult(name = "deleteEducationSummaryResponse", targetNamespace = "http://www.sample.project.com.au/services/account/DeleteEducationSummary/DeleteEducationSummaryResponse/v1", partName = "response")
    @WebMethod(operationName = "DeleteEducationSummary", action = "http://www.sample.project.com.au/services/account/DeleteEducationSummary/v1")
    public au.com.project.sample.services.account.deleteeducationsummary.DeleteEducationSummaryResponse deleteEducationSummary(
        @WebParam(partName = "request", name = "deleteEducationSummaryRequest", targetNamespace = "http://www.sample.project.com.au/services/account/DeleteEducationSummary/DeleteEducationSummaryRequest/v1")
        au.com.project.sample.services.account.deleteeducationsummary.DeleteEducationSummaryRequest request
    ) throws au.com.project.sample.common.message.TechnicalFault, au.com.project.sample.common.message.BusinessFault;
}
