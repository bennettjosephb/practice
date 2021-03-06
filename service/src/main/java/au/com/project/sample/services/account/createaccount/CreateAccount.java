package au.com.project.sample.services.account.createaccount;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.5.2
 * 2013-02-16T18:04:06.532+11:00
 * Generated source version: 2.5.2
 * 
 */
@WebService(targetNamespace = "http://www.sample.project.com.au/services/account/CreateAccount/v1", name = "CreateAccount")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface CreateAccount {

    @WebResult(name = "createAccountResponse", targetNamespace = "http://www.sample.project.com.au/services/account/CreateAccount/CreateAccountResponse/v1", partName = "response")
    @WebMethod(operationName = "CreateAccount", action = "http://www.sample.project.com.au/services/account/CreateAccount/v1")
    public au.com.project.sample.services.account.createaccount.CreateAccountResponse createAccount(
        @WebParam(partName = "request", name = "createAccountRequest", targetNamespace = "http://www.sample.project.com.au/services/account/CreateAccount/CreateAccountRequest/v1")
        au.com.project.sample.services.account.createaccount.CreateAccountRequest request
    ) throws au.com.project.sample.common.message.BusinessFault, au.com.project.sample.common.message.TechnicalFault;
}
