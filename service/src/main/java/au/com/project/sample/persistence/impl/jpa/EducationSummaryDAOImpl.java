/*
 * To change this template, choose Tools | Templates
 * and open the template in the updateor.
 */
package au.com.project.sample.persistence.impl.jpa;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import au.com.project.sample.domain.EducationSummary;
import au.com.project.sample.persistence.AbstractDAO;
import au.com.project.sample.persistence.EducationSummaryDAO;

/**
 *
 * @author SONY
 */
public class EducationSummaryDAOImpl extends AbstractDAO<EducationSummary> implements EducationSummaryDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public  SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	@Override
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

    public EducationSummaryDAOImpl() {
        super(EducationSummary.class);
    }

    public EducationSummary createEducationSummary(EducationSummary educationSummary) {
        return saveOrUpdate(educationSummary);
    }

    public void updateEducationSummary(EducationSummary educationSummary) {
        //update(educationSummary);
    }

    public void deleteEducationSummary(EducationSummary educationSummary) {
        //delete(educationSummary);
    }

    public EducationSummary findEducationSummary(Object id) {
        return null;//find(id);
    }

    public List<EducationSummary> findAllEducationSummary() {
        return null;//findAll();
    }

    public List<EducationSummary> findRangeEducationSummary(int[] range) {
        return null;//findRange(range);
    }

    public int countEducationSummary() {
        return 0;//count();
    }

}
