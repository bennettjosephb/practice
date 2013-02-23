/*
 * To change this template, choose Tools | Templates
 * and open the template in the updateor.
 */
package au.com.project.sample.process.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import au.com.project.sample.domain.AuthenticationRole;
import au.com.project.sample.persistence.AuthenticationRoleDAO;
import au.com.project.sample.process.AuthenticationRoleController;
import au.com.project.sample.process.impl.dto.AuthenticationRoleDTO;

/**
 *
 * @author SONY
 */
public class AuthenticationRoleControllerImpl implements
		AuthenticationRoleController {

	@Autowired
	private AuthenticationRoleDAO authenticationRoleDAO;

	private AuthenticationRole populateAuthenticationRole(
			AuthenticationRoleDTO authenticationRoleDTO) {
		AuthenticationRole authenticationRole = new AuthenticationRole();

		authenticationRole.setName(authenticationRoleDTO.getName());
		authenticationRole.setCode(authenticationRoleDTO.getCode());
		authenticationRole.setValue(authenticationRoleDTO.getValue());

		return authenticationRole;
	}

	public void createAuthenticationRole(
			AuthenticationRoleDTO authenticationRoleDTO) {

		authenticationRoleDAO
				.createAuthenticationRole(populateAuthenticationRole(authenticationRoleDTO));

	}

	public void updateAuthenticationRole(
			AuthenticationRoleDTO authenticationRoleDTO) {
	}

	public void deleteAuthenticationRole(
			AuthenticationRoleDTO authenticationRoleDTO) {
	}

	public AuthenticationRoleDTO findAuthenticationRole(Object id) {
		return null;
	}

	public List<AuthenticationRoleDTO> findAllAuthenticationRole() {
		return null;
	}

	public List<AuthenticationRoleDTO> findRangeAuthenticationRole(int[] range) {
		return null;
	}

	public int countAuthenticationRole() {
		return 0;
	}

	public AuthenticationRoleDAO getAuthenticationRoleDAO() {
		return authenticationRoleDAO;
	}

	public void setAuthenticationRoleDAO(
			AuthenticationRoleDAO authenticationRoleDAO) {
		this.authenticationRoleDAO = authenticationRoleDAO;
	}

}