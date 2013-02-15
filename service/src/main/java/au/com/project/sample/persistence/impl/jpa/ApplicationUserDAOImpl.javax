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

/**
 *
 * @author SONY
 */
@Stateless
public class ApplicationUserDAOImpl extends AbstractDAO<ApplicationUser> implements ApplicationUserDAOLocal, ApplicationUserDAORemote {
    @PersistenceContext(unitName = "project")
    private EntityManager em;

    protected EntityManager getEntityManager() {
        return em;
    }

    public ApplicationUserDAOImpl() {
        super(ApplicationUser.class);
    }

    public void createApplicationUser(ApplicationUser applicationUser) {
        create(applicationUser);
    }

    public void editApplicationUser(ApplicationUser applicationUser) {
        edit(applicationUser);
    }

    public void removeApplicationUser(ApplicationUser applicationUser) {
        remove(applicationUser);
    }

    public ApplicationUser findApplicationUser(Object id) {
        return find(id);
    }

    public List<ApplicationUser> findAllApplicationUser() {
        return findAll();
    }

    public List<ApplicationUser> findRangeApplicationUser(int[] range) {
        return findRange(range);
    }

    public int countApplicationUser() {
        return count();
    }
    
}
