/*
 * To change this template, choose Tools | Templates
 * and open the template in the updateor.
 */
package au.com.project.sample.persistence.impl.jpa;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import au.com.project.sample.domain.EmploymentSummary;
import au.com.project.sample.persistence.AbstractDAO;
import au.com.project.sample.persistence.EmploymentSummaryDAO;

/**
 *
 * @author SONY
 */
public class EmploymentSummaryDAOImpl extends AbstractDAO<EmploymentSummary>
		implements EmploymentSummaryDAO {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	@Override
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public EmploymentSummaryDAOImpl() {
		super(EmploymentSummary.class);
	}

	public EmploymentSummary createEmploymentSummary(EmploymentSummary employmentSummary) {
		return saveOrUpdate(employmentSummary);
	}

	public void updateEmploymentSummary(EmploymentSummary employmentSummary) {
		// update(employmentSummary);
	}

	public void deleteEmploymentSummary(EmploymentSummary employmentSummary) {
		delete(employmentSummary);
	}

	public EmploymentSummary findEmploymentSummary(Object id) {
		return null;// find(id);
	}

	public List<EmploymentSummary> findAllEmploymentSummary() {
		return null;// findAll();
	}

	public List<EmploymentSummary> findRangeEmploymentSummary(int[] range) {
		return null;// findRange(range);
	}

	public int countEmploymentSummary() {
		return 0;// count();
	}

}
