/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.persistence.impl.jpa;

import java.util.List;

import org.hibernate.SessionFactory;

import au.com.project.sample.domain.Designation;
import au.com.project.sample.persistence.AbstractDAO;
import au.com.project.sample.persistence.DesignationDAO;

/**
 *
 * @author SONY
 */

public class DesignationDAOImpl extends AbstractDAO<Designation> implements DesignationDAO {
	private SessionFactory sessionFactory;

	@Override
	public  SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	@Override
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}


    public DesignationDAOImpl() {
        super(Designation.class);
    }

    public void createDesignation(Designation designation) {
        saveOrUpdate(designation);
    }

    public void editDesignation(Designation designation) {
        //edit(designation);
    }

    public void removeDesignation(Designation designation) {
        //remove(designation);
    }

    public Designation findDesignation(Object id) {
        return null;//find(id);
    }

    public List<Designation> findAllDesignation() {
        return null;//findAll();
    }

    public List<Designation> findRangeDesignation(int[] range) {
        return null;//findRange(range);
    }

    public int countDesignation() {
        return 0;//count();
    }

}
