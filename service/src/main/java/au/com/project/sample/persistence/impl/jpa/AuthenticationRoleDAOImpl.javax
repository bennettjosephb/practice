/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.persistence.impl.jpa;

import au.com.project.sample.persistence.local.AuthenticationRoleDAOLocal;
import au.com.project.sample.domain.AuthenticationRole;
import au.com.project.sample.persistence.AbstractDAO;
import au.com.project.sample.persistence.remote.AuthenticationRoleDAORemote;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author SONY
 */
@Stateless
public class AuthenticationRoleDAOImpl extends AbstractDAO<AuthenticationRole> implements AuthenticationRoleDAOLocal, AuthenticationRoleDAORemote {
    @PersistenceContext(unitName = "project")
    private EntityManager em;

    protected EntityManager getEntityManager() {
        return em;
    }

    public AuthenticationRoleDAOImpl() {
        super(AuthenticationRole.class);
    }

    public void createAuthenticationRole(AuthenticationRole authenticationRole) {
        create(authenticationRole);
    }

    public void editAuthenticationRole(AuthenticationRole authenticationRole) {
        edit(authenticationRole);
    }

    public void removeAuthenticationRole(AuthenticationRole authenticationRole) {
        remove(authenticationRole);
    }

    public AuthenticationRole findAuthenticationRole(Object id) {
        return find(id);
    }

    public List<AuthenticationRole> findAllAuthenticationRole() {
        return findAll();
    }

    public List<AuthenticationRole> findRangeAuthenticationRole(int[] range) {
        return findRange(range);
    }

    public int countAuthenticationRole() {
        return count();
    }
}