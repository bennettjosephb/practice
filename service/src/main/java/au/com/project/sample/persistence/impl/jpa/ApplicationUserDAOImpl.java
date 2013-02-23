/*
 * To change this template, choose Tools | Templates
 * and open the template in the updateor.
 */
package au.com.project.sample.persistence.impl.jpa;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import au.com.project.sample.domain.ApplicationUser;
import au.com.project.sample.persistence.AbstractDAO;
import au.com.project.sample.persistence.ApplicationUserDAO;

/**
 *
 * @author SONY
 */
public class ApplicationUserDAOImpl extends AbstractDAO<ApplicationUser>
		implements ApplicationUserDAO {

	private static Logger log = Logger.getLogger(ApplicationUserDAOImpl.class);

	@Autowired
	private SessionFactory sessionFactory;

	public ApplicationUserDAOImpl() {
		super(ApplicationUser.class);
	}

	public ApplicationUser createApplicationUser(ApplicationUser applicationUser) {
		log.info("Creating Application User");
		return saveOrUpdate(applicationUser);
		// log.info("Application User Created");
	}

	public void updateApplicationUser(ApplicationUser applicationUser) {
		// update(applicationUser);
	}

	public void deleteApplicationUser(ApplicationUser applicationUser) {
		// delete(applicationUser);
	}

	public ApplicationUser findApplicationUser(Object id) {
		return null;// find(id);
	}

	public List<ApplicationUser> findAllApplicationUser() {
		return null;// findAll();
	}

	public List<ApplicationUser> findRangeApplicationUser(int[] range) {
		return null;// findRange(range);
	}

	public int countApplicationUser() {
		return 0;// count();
	}

	@Override
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	@Override
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
