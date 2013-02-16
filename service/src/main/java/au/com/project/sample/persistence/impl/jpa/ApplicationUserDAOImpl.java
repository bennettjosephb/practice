/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.persistence.impl.jpa;

import au.com.project.sample.persistence.local.ApplicationUserDAOLocal;
import au.com.project.sample.domain.ApplicationUser;
import au.com.project.sample.persistence.AbstractDAO;
import au.com.project.sample.persistence.remote.ApplicationUserDAORemote;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.SessionFactory;

/**
 *
 * @author SONY
 */
public class ApplicationUserDAOImpl extends AbstractDAO<ApplicationUser> implements ApplicationUserDAOLocal, ApplicationUserDAORemote {
   
    public ApplicationUserDAOImpl() {
        super(ApplicationUser.class);
    }

    public void createApplicationUser(ApplicationUser applicationUser) {
        saveOrUpdate(applicationUser);
    }

    public void editApplicationUser(ApplicationUser applicationUser) {
        //edit(applicationUser);
    }

    public void removeApplicationUser(ApplicationUser applicationUser) {
        //remove(applicationUser);
    }

    public ApplicationUser findApplicationUser(Object id) {
        return null;//find(id);
    }

    public List<ApplicationUser> findAllApplicationUser() {
        return null;//findAll();
    }

    public List<ApplicationUser> findRangeApplicationUser(int[] range) {
        return null;//findRange(range);
    }

    public int countApplicationUser() {
        return 0;//count();
    }

	@Override
	protected SessionFactory getSessionFactory() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected void setSessionFactory(SessionFactory sessionFactory) {
		// TODO Auto-generated method stub
		
	}
    
}
