package au.com.project.sample.services.account.createeducationsummary;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.5.2
 * 2013-02-21T21:05:01.353+11:00
 * Generated source version: 2.5.2
 * 
 */
@WebService(targetNamespace = "http://www.sample.project.com.au/services/account/CreateEducationSummary/v1", name = "CreateEducationSummary")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface CreateEducationSummary {

    @WebResult(name = "createEducationSummaryResponse", targetNamespace = "http://www.sample.project.com.au/services/account/CreateEducationSummary/CreateEducationSummaryResponse/v1", partName = "response")
    @WebMethod(operationName = "CreateEducationSummary", action = "http://www.sample.project.com.au/services/account/CreateEducationSummary/v1")
    public au.com.project.sample.services.account.createeducationsummary.CreateEducationSummaryResponse createEducationSummary(
        @WebParam(partName = "request", name = "createEducationSummaryRequest", targetNamespace = "http://www.sample.project.com.au/services/account/CreateEducationSummary/CreateEducationSummaryRequest/v1")
        au.com.project.sample.services.account.createeducationsummary.CreateEducationSummaryRequest request
    ) throws au.com.project.sample.common.message.BusinessFault, au.com.project.sample.common.message.TechnicalFault;
}