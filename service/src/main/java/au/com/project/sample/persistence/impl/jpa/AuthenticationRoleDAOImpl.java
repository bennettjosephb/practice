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

import org.hibernate.SessionFactory;

/**
 * 
 * @author SONY
 */
public class AuthenticationRoleDAOImpl extends AbstractDAO<AuthenticationRole>
		implements AuthenticationRoleDAOLocal, AuthenticationRoleDAORemote {

	private SessionFactory sessionFactory;

	public AuthenticationRoleDAOImpl() {
		super(AuthenticationRole.class);
	}

	public void createAuthenticationRole(AuthenticationRole authenticationRole) {
		saveOrUpdate(authenticationRole);
	}

	public void editAuthenticationRole(AuthenticationRole authenticationRole) {
		// edit(authenticationRole);
	}

	public void removeAuthenticationRole(AuthenticationRole authenticationRole) {
		// remove(authenticationRole);
	}

	public AuthenticationRole findAuthenticationRole(Object id) {
		return null;// find(id);
	}

	public List<AuthenticationRole> findAllAuthenticationRole() {
		return null;// findAll();
	}

	public List<AuthenticationRole> findRangeAuthenticationRole(int[] range) {
		return null;// findRange(range);
	}

	public int countAuthenticationRole() {
		return 0;// count();
	}

	@Override
	protected SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	@Override
	protected void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
}