/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.process.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import au.com.project.sample.domain.Applicant;
import au.com.project.sample.domain.ApplicationUser;
import au.com.project.sample.persistence.ApplicationUserDAO;
import au.com.project.sample.process.CreateAccountController;
import au.com.project.sample.process.impl.dto.UserInfoDTO;
import au.com.project.sample.services.model.Gender;

/**
 * 
 * @author SONY
 */
public class CreateAccountControllerImpl implements CreateAccountController {

	@Autowired
	private ApplicationUserDAO applicationUserDAO;

	public void createAccount(UserInfoDTO userInfoDTO) {

		ApplicationUser applicationUser = new ApplicationUser();

		Applicant applicant = new Applicant();

		applicant.setFirstName(userInfoDTO.getFirstName());
		applicant.setLastName(userInfoDTO.getLastName());
		applicant.setDateOfBirth(userInfoDTO.getDateOfBirth());
		applicant.setEmailId(userInfoDTO.getEmailId());
		Gender gender = userInfoDTO.getGender();
		if (gender == Gender.MALE) {
			applicant.setGender(au.com.project.sample.domain.Gender.MALE);
		} else if (gender == Gender.FEMALE) {
			applicant.setGender(au.com.project.sample.domain.Gender.FEMALE);
		} else if (gender == Gender.OTHER) {
			applicant.setGender(au.com.project.sample.domain.Gender.OTHER);
		}

		applicationUser.setUsername(userInfoDTO.getUsername());
		applicationUser.setPassword(userInfoDTO.getPassword());
		applicationUser.setApplicant(applicant);

		applicationUserDAO.createApplicationUser(applicationUser);

	}

	public void editAccount(UserInfoDTO userInfoDTO) {
	}

	public void removeAccount(UserInfoDTO userInfoDTO) {
	}

	public UserInfoDTO findAccount(Object id) {
		return null;
	}

	public List<UserInfoDTO> findAllAccount() {
		return null;
	}

	public List<UserInfoDTO> findRange(int[] range) {
		return null;
	}

	public int count() {
		return 0;
	}

	public ApplicationUserDAO getApplicationUserDAO() {
		return applicationUserDAO;
	}

	public void setApplicationUserDAO(ApplicationUserDAO applicationUserDAO) {
		this.applicationUserDAO = applicationUserDAO;
	}

}
