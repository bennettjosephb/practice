/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.persistence.impl.jpa;

import au.com.project.sample.persistence.local.MaritalStatusDAOLocal;
import au.com.project.sample.domain.MaritalStatus;
import au.com.project.sample.persistence.AbstractDAO;
import au.com.project.sample.persistence.remote.MaritalStatusDAORemote;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author SONY
 */
@Stateless
public class MaritalStatusDAOImpl extends AbstractDAO<MaritalStatus> implements MaritalStatusDAOLocal, MaritalStatusDAORemote {
    @PersistenceContext(unitName = "project")
    private EntityManager em;

    protected EntityManager getEntityManager() {
        return em;
    }

    public MaritalStatusDAOImpl() {
        super(MaritalStatus.class);
    }

    public void createMaritalStatus(MaritalStatus maritalStatus) {
        create(maritalStatus);
    }

    public void editMaritalStatus(MaritalStatus maritalStatus) {
        edit(maritalStatus);
    }

    public void removeMaritalStatus(MaritalStatus maritalStatus) {
        remove(maritalStatus);
    }

    public MaritalStatus findMaritalStatus(Object id) {
        return find(id);
    }

    public List<MaritalStatus> findAllMaritalStatus() {
        return findAll();
    }

    public List<MaritalStatus> findRangeMaritalStatus(int[] range) {
        return findRange(range);
    }

    public int countMaritalStatus() {
        return count();
    }
    
}