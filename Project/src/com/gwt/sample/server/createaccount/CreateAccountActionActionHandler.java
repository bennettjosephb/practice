package com.gwt.sample.server.createaccount;

import java.util.Calendar;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import au.com.project.sample.services.account.createaccount.createaccountrequest.v1.CreateAccountRequest;
import au.com.project.sample.services.account.createaccount.v1.CreateAccount;
import au.com.project.sample.services.model.gender.v1.Gender;
import au.com.project.sample.services.model.userinfo.v1.UserInfo;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.gwt.sample.client.login.createaccount.CreateAccountAction;
import com.gwt.sample.client.login.createaccount.CreateAccountActionResult;
import com.gwt.sample.server.encrypt.BCrypt;
import com.gwtplatform.dispatch.server.ExecutionContext;
import com.gwtplatform.dispatch.server.actionhandler.ActionHandler;
import com.gwtplatform.dispatch.shared.ActionException;

public class CreateAccountActionActionHandler implements
		ActionHandler<CreateAccountAction, CreateAccountActionResult> {

	@Inject
	public CreateAccountActionActionHandler(
			Provider<HttpServletRequest> requestProvider,
			ServletContext servletContext) {
		super();
		this.requestProvider = requestProvider;
		this.servletContext = servletContext;
	}

	private Provider<HttpServletRequest> requestProvider;
	private ServletContext servletContext;

	@Override
	public CreateAccountActionResult execute(CreateAccountAction action,
			ExecutionContext context) throws ActionException {

		System.out.println(action.getFirstName());
		System.out.println(action.getLastName());
		System.out.println(action.getConfirmPassword());
		System.out.println(action.getDate());
		System.out.println(action.getMonth());
		System.out.println(action.getYear());
		System.out.println(action.getGender());
		System.out.println(action.getLocation());
		System.out.println(action.getPassword());
		System.out.println(action.getPhoneNumber());
		System.out.println(action.getServiceName());
		System.out.println(action.getUsername());
		System.out.println(action.getEmailId());

		Calendar calendar = Calendar.getInstance();

		System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||");
		System.out.println(calendar);
		System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||");
		calendar.set(Calendar.DATE, action.getDate());
		calendar.set(Calendar.MONTH, action.getMonth());
		calendar.set(Calendar.YEAR, action.getYear());

		System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||");
		System.out.println(calendar.get(Calendar.DATE));
		System.out.println(calendar.get(Calendar.MONTH));
		System.out.println(calendar.get(Calendar.YEAR));
		System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||");

		String password = action.getPassword();

		String confirmPassword = action.getConfirmPassword();

		if (password.equals(confirmPassword)) {

			String hashValue = BCrypt.hashpw(password, BCrypt.gensalt());
			boolean valid = BCrypt.checkpw(password, hashValue);
			System.out.println(valid);

			WebApplicationContext applicationContext = WebApplicationContextUtils
					.getWebApplicationContext(servletContext);

			System.out.println(applicationContext.getBean("x"));
			
			System.out.println("GETTING PROXY");

			System.out.println(applicationContext.getBean("createAccount"));

			System.out.println("GOT PROXY");

			CreateAccount createAccount = (CreateAccount) applicationContext
					.getBean("createAccount");

			System.out.println("CREATED ACCOUNT PROXY OBJECT CREATED");

			CreateAccountRequest createAccountRequest = new CreateAccountRequest();
			System.out.println("CREATED ACCOUNT REQUEST OBJECT CREATED");
			createAccountRequest.setMessage(new CreateAccountRequest.Message());
			UserInfo userInfo = new UserInfo();
			userInfo.setConfirmPassword(action.getConfirmPassword());
			userInfo.setDateOfBirth(calendar);
			userInfo.setEmailId(action.getEmailId());
			userInfo.setFirstName(action.getFirstName());
			if (action.getGender().equals("0")) {
				userInfo.setGender(Gender.MALE);
			} else if (action.getGender().equals("1")) {
				userInfo.setGender(Gender.FEMALE);
			} else {
				userInfo.setGender(Gender.OTHER);
			}
			userInfo.setLastName(action.getLastName());
			userInfo.setLocation(action.getLocation());
			userInfo.setPassword(action.getPassword());
			userInfo.setPhoneNumber(action.getPhoneNumber());
			userInfo.setUsername(action.getUsername());
			createAccountRequest.getMessage().setUserInfo(userInfo);

			System.out.println("CREATED ACCOUNT REQUEST MESSAGE OBJECT CREATED");

			try {

				System.out.println("INVOKING SERVICE");
				createAccount.createAccount(createAccountRequest);
				System.out.println("SERVICE INVOKED");
			} catch (Exception e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
				System.out.println(e.getMessage());
			}
			System.out.println("END END END END ");

		}

		System.out.println("OUT OUT OUT OUT END END END END ");
		return new CreateAccountActionResult(true, null);
	}

	@Override
	public void undo(CreateAccountAction action,
			CreateAccountActionResult result, ExecutionContext context)
			throws ActionException {
	}

	@Override
	public Class<CreateAccountAction> getActionType() {
		return CreateAccountAction.class;
	}
}
