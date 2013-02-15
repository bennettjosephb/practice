/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.persistence.local;

import au.com.project.sample.domain.AuthenticationRole;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author SONY
 */
@Local
public interface AuthenticationRoleDAOLocal {

    void createAuthenticationRole(AuthenticationRole authenticationRole);

    void editAuthenticationRole(AuthenticationRole authenticationRole);

    void removeAuthenticationRole(AuthenticationRole authenticationRole);

    AuthenticationRole findAuthenticationRole(Object id);

    List<AuthenticationRole> findAllAuthenticationRole();

    List<AuthenticationRole> findRangeAuthenticationRole(int[] range);

    int countAuthenticationRole();
    
}
