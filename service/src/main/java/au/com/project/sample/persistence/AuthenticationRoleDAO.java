/*
 * To change this template, choose Tools | Templates
 * and open the template in the updateor.
 */
package au.com.project.sample.persistence;

import java.util.List;

import au.com.project.sample.domain.AuthenticationRole;

/**
 *
 * author SONY
 */

public interface AuthenticationRoleDAO {

	AuthenticationRole createAuthenticationRole(AuthenticationRole authenticationRole);

    void updateAuthenticationRole(AuthenticationRole authenticationRole);

    void deleteAuthenticationRole(AuthenticationRole authenticationRole);

    AuthenticationRole findAuthenticationRole(Object id);

    List<AuthenticationRole> findAllAuthenticationRole();

    List<AuthenticationRole> findRangeAuthenticationRole(int[] range);

    int countAuthenticationRole();

}
