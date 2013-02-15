/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.persistence.impl.jpa;

import au.com.project.sample.persistence.local.TotalExperienceDAOLocal;
import au.com.project.sample.domain.TotalExperience;
import au.com.project.sample.persistence.AbstractDAO;
import au.com.project.sample.persistence.remote.TotalExperienceDAORemote;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author SONY
 */
@Stateless
public class TotalExperienceDAOImpl extends AbstractDAO<TotalExperience> implements TotalExperienceDAOLocal, TotalExperienceDAORemote {
    @PersistenceContext(unitName = "project")
    private EntityManager em;

    protected EntityManager getEntityManager() {
        return em;
    }

    public TotalExperienceDAOImpl() {
        super(TotalExperience.class);
    }

    public void createTotalExperience(TotalExperience totalExperience) {
        create(totalExperience);
    }

    public void editTotalExperience(TotalExperience totalExperience) {
        edit(totalExperience);
    }

    public void removeTotalExperience(TotalExperience totalExperience) {
        remove(totalExperience);
    }

    public TotalExperience findTotalExperience(Object id) {
        return find(id);
    }

    public List<TotalExperience> findAllTotalExperience() {
        return findAll();
    }

    public List<TotalExperience> findRangeTotalExperience(int[] range) {
        return findRange(range);
    }

    public int countTotalExperience() {
        return count();
    }
    
}
