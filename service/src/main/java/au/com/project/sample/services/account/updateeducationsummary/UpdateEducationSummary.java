package au.com.project.sample.services.account.updateeducationsummary;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * This class was generated by Apache CXF 2.5.2
 * 2013-03-09T00:42:55.456+11:00
 * Generated source version: 2.5.2
 * 
 */
@WebService(targetNamespace = "http://www.sample.project.com.au/services/account/UpdateEducationSummary/v1", name = "UpdateEducationSummary")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface UpdateEducationSummary {

    @WebResult(name = "updateEducationSummaryResponse", targetNamespace = "http://www.sample.project.com.au/services/account/UpdateEducationSummary/UpdateEducationSummaryResponse/v1", partName = "response")
    @WebMethod(operationName = "UpdateEducationSummary", action = "http://www.sample.project.com.au/services/account/UpdateEducationSummary/v1")
    public au.com.project.sample.services.account.updateeducationsummary.UpdateEducationSummaryResponse updateEducationSummary(
        @WebParam(partName = "request", name = "updateEducationSummaryRequest", targetNamespace = "http://www.sample.project.com.au/services/account/UpdateEducationSummary/UpdateEducationSummaryRequest/v1")
        au.com.project.sample.services.account.updateeducationsummary.UpdateEducationSummaryRequest request
    ) throws au.com.project.sample.common.message.BusinessFault, au.com.project.sample.common.message.TechnicalFault;
}
