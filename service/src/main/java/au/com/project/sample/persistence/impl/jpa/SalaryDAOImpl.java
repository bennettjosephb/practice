/*
 * To change this template, choose Tools | Templates
 * and open the template in the updateor.
 */
package au.com.project.sample.persistence.impl.jpa;

import java.util.List;

import javax.ejb.Stateless;

import org.hibernate.SessionFactory;

import au.com.project.sample.domain.Salary;
import au.com.project.sample.persistence.AbstractDAO;
import au.com.project.sample.persistence.SalaryDAO;

/**
 *
 * @author SONY
 */
public class SalaryDAOImpl extends AbstractDAO<Salary> implements SalaryDAO {
	private SessionFactory sessionFactory;

	@Override
	public  SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	@Override
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

    public SalaryDAOImpl() {
        super(Salary.class);
    }

    public void createSalary(Salary salary) {
        saveOrUpdate(salary);
    }

    public void updateSalary(Salary salary) {
//        update(salary);
    }

    public void deleteSalary(Salary salary) {
 //       delete(salary);
    }

    public Salary findSalary(Object id) {
        return null;//find(id);
    }

    public List<Salary> findAllSalary() {
        return null;//findAll();
    }

    public List<Salary> findRangeSalary(int[] range) {
        return null;//findRange(range);
    }

    public int countSalary() {
        return 0;//count();
    }

}
