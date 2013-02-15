/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.persistence.impl.jpa;

import au.com.project.sample.persistence.local.EducationSummaryDAOLocal;
import au.com.project.sample.domain.EducationSummary;
import au.com.project.sample.persistence.AbstractDAO;
import au.com.project.sample.persistence.remote.EducationSummaryDAORemote;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author SONY
 */
@Stateless
public class EducationSummaryDAOImpl extends AbstractDAO<EducationSummary> implements EducationSummaryDAOLocal, EducationSummaryDAORemote {
    @PersistenceContext(unitName = "project")
    private EntityManager em;

    protected EntityManager getEntityManager() {
        return em;
    }

    public EducationSummaryDAOImpl() {
        super(EducationSummary.class);
    }

    public void createEducationSummary(EducationSummary educationSummary) {
        create(educationSummary);
    }

    public void editEducationSummary(EducationSummary educationSummary) {
        edit(educationSummary);
    }

    public void removeEducationSummary(EducationSummary educationSummary) {
        remove(educationSummary);
    }

    public EducationSummary findEducationSummary(Object id) {
        return find(id);
    }

    public List<EducationSummary> findAllEducationSummary() {
        return findAll();
    }

    public List<EducationSummary> findRangeEducationSummary(int[] range) {
        return findRange(range);
    }

    public int countEducationSummary() {
        return count();
    }
    
}
