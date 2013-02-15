/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.persistence.impl.jpa;

import au.com.project.sample.persistence.local.EmploymentSummaryDAOLocal;
import au.com.project.sample.domain.EmploymentSummary;
import au.com.project.sample.persistence.AbstractDAO;
import au.com.project.sample.persistence.remote.EmploymentSummaryDAORemote;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author SONY
 */
@Stateless
public class EmploymentSummaryDAOImpl extends AbstractDAO<EmploymentSummary> implements EmploymentSummaryDAOLocal, EmploymentSummaryDAORemote {
    @PersistenceContext(unitName = "project")
    private EntityManager em;

    protected EntityManager getEntityManager() {
        return em;
    }

    public EmploymentSummaryDAOImpl() {
        super(EmploymentSummary.class);
    }

    public void createEmploymentSummary(EmploymentSummary employmentSummary) {
        create(employmentSummary);
    }

    public void editEmploymentSummary(EmploymentSummary employmentSummary) {
        edit(employmentSummary);
    }

    public void removeEmploymentSummary(EmploymentSummary employmentSummary) {
        remove(employmentSummary);
    }

    public EmploymentSummary findEmploymentSummary(Object id) {
        return find(id);
    }

    public List<EmploymentSummary> findAllEmploymentSummary() {
        return findAll();
    }

    public List<EmploymentSummary> findRangeEmploymentSummary(int[] range) {
        return findRange(range);
    }

    public int countEmploymentSummary() {
        return count();
    }
    
}
