package au.com.project.sample.services.admin.getstate;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.5.2
 * 2013-02-24T02:21:46.048+11:00
 * Generated source version: 2.5.2
 *
 */
@WebService(targetNamespace = "http://www.sample.project.com.au/services/admin/GetState/v1", name = "GetState")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface GetState {

    @WebResult(name = "getStateResponse", targetNamespace = "http://www.sample.project.com.au/services/admin/GetState/GetStateResponse/v1", partName = "response")
    @WebMethod(operationName = "GetState", action = "http://www.sample.project.com.au/services/admin/GetState/v1")
    public au.com.project.sample.services.admin.getstate.GetStateResponse getState(
        @WebParam(partName = "request", name = "getStateRequest", targetNamespace = "http://www.sample.project.com.au/services/admin/GetState/GetStateRequest/v1")
        au.com.project.sample.services.admin.getstate.GetStateRequest request
    ) throws au.com.project.sample.common.message.TechnicalFault, au.com.project.sample.common.message.BusinessFault;
}