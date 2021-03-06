package au.com.project.sample.services.admin.createstate;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.5.2
 * 2013-02-24T02:20:42.755+11:00
 * Generated source version: 2.5.2
 *
 */
@WebService(targetNamespace = "http://www.sample.project.com.au/services/admin/CreateState/v1", name = "CreateState")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface CreateState {

    @WebResult(name = "createStateResponse", targetNamespace = "http://www.sample.project.com.au/services/admin/CreateState/CreateStateResponse/v1", partName = "response")
    @WebMethod(operationName = "CreateState", action = "http://www.sample.project.com.au/services/admin/CreateState/v1")
    public au.com.project.sample.services.admin.createstate.CreateStateResponse createState(
        @WebParam(partName = "request", name = "createStateRequest", targetNamespace = "http://www.sample.project.com.au/services/admin/CreateState/CreateStateRequest/v1")
        au.com.project.sample.services.admin.createstate.CreateStateRequest request
    ) throws au.com.project.sample.common.message.TechnicalFault, au.com.project.sample.common.message.BusinessFault;
}
