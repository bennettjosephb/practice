/*
 * To change this template, choose Tools | Templates
 * and open the template in the updateor.
 */
package au.com.project.sample.persistence.impl.jpa;

import java.util.List;

import org.hibernate.SessionFactory;

import au.com.project.sample.domain.MaritalStatus;
import au.com.project.sample.persistence.AbstractDAO;
import au.com.project.sample.persistence.MaritalStatusDAO;

/**
 *
 * @author SONY
 */
public class MaritalStatusDAOImpl extends AbstractDAO<MaritalStatus> implements MaritalStatusDAO {
	private SessionFactory sessionFactory;

	@Override
	public  SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	@Override
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

    public MaritalStatusDAOImpl() {
        super(MaritalStatus.class);
    }

    public MaritalStatus createMaritalStatus(MaritalStatus maritalStatus) {
        return saveOrUpdate(maritalStatus);
    }

    public void updateMaritalStatus(MaritalStatus maritalStatus) {
        //update(maritalStatus);
    }

    public void deleteMaritalStatus(MaritalStatus maritalStatus) {
        //delete(maritalStatus);
    }

    public MaritalStatus findMaritalStatus(Object id) {
        return null;//find(id);
    }

    public List<MaritalStatus> findAllMaritalStatus() {
        return null;//findAll();
    }

    public List<MaritalStatus> findRangeMaritalStatus(int[] range) {
        return null;//findRange(range);
    }

    public int countMaritalStatus() {
        return 0;// count();
    }

}