/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.persistence.impl.jpa;

import au.com.project.sample.persistence.local.EmploymentRoleDAOLocal;
import au.com.project.sample.domain.EmploymentRole;
import au.com.project.sample.persistence.AbstractDAO;
import au.com.project.sample.persistence.remote.EmploymentRoleDAORemote;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author SONY
 */
@Stateless
public class EmploymentRoleDAOImpl extends AbstractDAO<EmploymentRole> implements EmploymentRoleDAOLocal, EmploymentRoleDAORemote {
    @PersistenceContext(unitName = "project")
    private EntityManager em;

    protected EntityManager getEntityManager() {
        return em;
    }

    public EmploymentRoleDAOImpl() {
        super(EmploymentRole.class);
    }

    public void createEmploymentRole(EmploymentRole employmentRole) {
        create(employmentRole);
    }

    public void editEmploymentRole(EmploymentRole employmentRole) {
        edit(employmentRole);
    }

    public void removeEmploymentRole(EmploymentRole employmentRole) {
        remove(employmentRole);
    }

    public EmploymentRole findEmploymentRole(Object id) {
        return find(id);
    }

    public List<EmploymentRole> findAllEmploymentRole() {
        return findAll();
    }

    public List<EmploymentRole> findRangeEmploymentRole(int[] range) {
        return findRange(range);
    }

    public int countEmploymentRole() {
        return count();
    }
    
}
