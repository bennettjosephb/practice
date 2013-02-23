/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.persistence.impl.jpa;

import java.util.List;

import org.hibernate.SessionFactory;

import au.com.project.sample.domain.EmploymentRole;
import au.com.project.sample.persistence.AbstractDAO;
import au.com.project.sample.persistence.EmploymentRoleDAO;

/**
 *
 * @author SONY
 */
public class EmploymentRoleDAOImpl extends AbstractDAO<EmploymentRole> implements EmploymentRoleDAO {
	private SessionFactory sessionFactory;

	@Override
	public  SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	@Override
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

    public EmploymentRoleDAOImpl() {
        super(EmploymentRole.class);
    }

    public EmploymentRole createEmploymentRole(EmploymentRole employmentRole) {
        return saveOrUpdate(employmentRole);
    }

    public void editEmploymentRole(EmploymentRole employmentRole) {
        //edit(employmentRole);
    }

    public void removeEmploymentRole(EmploymentRole employmentRole) {
        //remove(employmentRole);
    }

    public EmploymentRole findEmploymentRole(Object id) {
        return null;//find(id);
    }

    public List<EmploymentRole> findAllEmploymentRole() {
        return null;//findAll();
    }

    public List<EmploymentRole> findRangeEmploymentRole(int[] range) {
        return null;//findRange(range);
    }

    public int countEmploymentRole() {
        return 0;//count();
    }

}
