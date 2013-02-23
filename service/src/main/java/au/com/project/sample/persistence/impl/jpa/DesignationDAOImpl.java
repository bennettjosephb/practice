/*
 * To change this template, choose Tools | Templates
 * and open the template in the updateor.
 */
package au.com.project.sample.persistence.impl.jpa;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import au.com.project.sample.domain.Designation;
import au.com.project.sample.persistence.AbstractDAO;
import au.com.project.sample.persistence.DesignationDAO;

/**
 *
 * @author SONY
 */

public class DesignationDAOImpl extends AbstractDAO<Designation> implements
		DesignationDAO {
	private static Logger log = Logger.getLogger(DesignationDAOImpl.class);

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

	public DesignationDAOImpl() {
		super(Designation.class);
	}

	public Designation createDesignation(Designation designation) {
		return saveOrUpdate(designation);
	}

	public void updateDesignation(Designation designation) {
		// update(designation);
	}

	public void deleteDesignation(Designation designation) {
		// delete(designation);
	}

	public Designation findDesignation(Object id) {
		return null;// find(id);
	}

	public List<Designation> findAllDesignation() {
		return null;// findAll();
	}

	public List<Designation> findRangeDesignation(int[] range) {
		return null;// findRange(range);
	}

	public int countDesignation() {
		return 0;// count();
	}

}
