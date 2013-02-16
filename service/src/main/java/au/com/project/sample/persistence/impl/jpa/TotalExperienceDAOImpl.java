/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.persistence.impl.jpa;

import java.util.List;

import javax.ejb.Stateless;

import org.hibernate.SessionFactory;

import au.com.project.sample.domain.TotalExperience;
import au.com.project.sample.persistence.AbstractDAO;
import au.com.project.sample.persistence.TotalExperienceDAO;

/**
 *
 * @author SONY
 */
public class TotalExperienceDAOImpl extends AbstractDAO<TotalExperience> implements TotalExperienceDAO{
	private SessionFactory sessionFactory;

	@Override
	public  SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	@Override
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

    public TotalExperienceDAOImpl() {
        super(TotalExperience.class);
    }

    public void createTotalExperience(TotalExperience totalExperience) {
        saveOrUpdate(totalExperience);
    }

    public void editTotalExperience(TotalExperience totalExperience) {
//        edit(totalExperience);
    }

    public void removeTotalExperience(TotalExperience totalExperience) {
  //      remove(totalExperience);
    }

    public TotalExperience findTotalExperience(Object id) {
        return null;//find(id);
    }

    public List<TotalExperience> findAllTotalExperience() {
        return null;//findAll();
    }

    public List<TotalExperience> findRangeTotalExperience(int[] range) {
        return null;//findRange(range);
    }

    public int countTotalExperience() {
        return 0;//count();
    }

}
