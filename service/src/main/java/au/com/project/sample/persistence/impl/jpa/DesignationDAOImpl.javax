/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.persistence.impl.jpa;

import au.com.project.sample.persistence.local.DesignationDAOLocal;
import au.com.project.sample.domain.Designation;
import au.com.project.sample.persistence.AbstractDAO;
import au.com.project.sample.persistence.remote.DesignationDAORemote;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author SONY
 */
@Stateless
public class DesignationDAOImpl extends AbstractDAO<Designation> implements DesignationDAOLocal, DesignationDAORemote {
    @PersistenceContext(unitName = "project")
    private EntityManager em;

    protected EntityManager getEntityManager() {
        return em;
    }

    public DesignationDAOImpl() {
        super(Designation.class);
    }

    public void createDesignation(Designation designation) {
        create(designation);
    }

    public void editDesignation(Designation designation) {
        edit(designation);
    }

    public void removeDesignation(Designation designation) {
        remove(designation);
    }

    public Designation findDesignation(Object id) {
        return find(id);
    }

    public List<Designation> findAllDesignation() {
        return findAll();
    }

    public List<Designation> findRangeDesignation(int[] range) {
        return findRange(range);
    }

    public int countDesignation() {
        return count();
    }
    
}
