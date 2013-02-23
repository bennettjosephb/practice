/*
 * To change this template, choose Tools | Templates
 * and open the template in the updateor.
 */
package au.com.project.sample.persistence.impl.jpa;

import java.util.List;

import org.hibernate.SessionFactory;

import au.com.project.sample.domain.CoverLetter;
import au.com.project.sample.persistence.AbstractDAO;
import au.com.project.sample.persistence.CoverLetterDAO;

/**
 *
 * @author SONY
 */

public class CoverLetterDAOImpl extends AbstractDAO<CoverLetter> implements CoverLetterDAO {
	private SessionFactory sessionFactory;

	@Override
	public  SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	@Override
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

    public CoverLetterDAOImpl() {
        super(CoverLetter.class);
    }

    public void createCoverLetter(CoverLetter coverLetter) {
        saveOrUpdate(coverLetter);
    }

    public void updateCoverLetter(CoverLetter coverLetter) {
        //update(coverLetter);
    }

    public void deleteCoverLetter(CoverLetter coverLetter) {
        //delete(coverLetter);
    }

    public CoverLetter findCoverLetter(Object id) {
        return null;//find(id);
    }

    public List<CoverLetter> findAllCoverLetter() {
        return null;//findAll();
    }

    public List<CoverLetter> findRangeCoverLetter(int[] range) {
        return null;//findRange(range);
    }

    public int countCoverLetter() {
        return 0;//count();
    }

}
