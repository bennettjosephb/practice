/*
 * To change this template, choose Tools | Templates
 * and open the template in the updateor.
 */
package au.com.project.sample.process;

import java.util.List;

import au.com.project.sample.process.impl.dto.AuthenticationRoleDTO;

/**
 *
 * @author SONY
 */
public interface AuthenticationRoleController {

	void createAuthenticationRole(AuthenticationRoleDTO authenticationRoleDTO);

	void updateAuthenticationRole(AuthenticationRoleDTO authenticationRoleDTO);

	void deleteAuthenticationRole(AuthenticationRoleDTO authenticationRoleDTO);

	AuthenticationRoleDTO findAuthenticationRole(Object id);

	List<AuthenticationRoleDTO> findAllAuthenticationRole();

	List<AuthenticationRoleDTO> findRangeAuthenticationRole(int[] range);

	int countAuthenticationRole();

}
