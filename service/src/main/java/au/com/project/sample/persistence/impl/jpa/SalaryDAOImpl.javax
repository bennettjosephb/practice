/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.persistence.impl.jpa;

import au.com.project.sample.persistence.local.SalaryDAOLocal;
import au.com.project.sample.domain.Salary;
import au.com.project.sample.persistence.AbstractDAO;
import au.com.project.sample.persistence.remote.SalaryDAORemote;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author SONY
 */
@Stateless
public class SalaryDAOImpl extends AbstractDAO<Salary> implements SalaryDAOLocal, SalaryDAORemote {
    @PersistenceContext(unitName = "project")
    private EntityManager em;

    protected EntityManager getEntityManager() {
        return em;
    }

    public SalaryDAOImpl() {
        super(Salary.class);
    }

    public void createSalary(Salary salary) {
        create(salary);
    }

    public void editSalary(Salary salary) {
        edit(salary);
    }

    public void removeSalary(Salary salary) {
        remove(salary);
    }

    public Salary findSalary(Object id) {
        return find(id);
    }

    public List<Salary> findAllSalary() {
        return findAll();
    }

    public List<Salary> findRangeSalary(int[] range) {
        return findRange(range);
    }

    public int countSalary() {
        return count();
    }
    
}
