/*
 * To change this template, choose Tools | Templates
 * and open the template in the updateor.
 */
package au.com.project.sample.persistence.impl.jpa;

import java.util.List;

import javax.ejb.Stateless;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import au.com.project.sample.domain.SubCategory;
import au.com.project.sample.persistence.AbstractDAO;
import au.com.project.sample.persistence.SubCategoryDAO;

/**
 *
 * @author SONY
 */
public class SubCategoryDAOImpl extends AbstractDAO<SubCategory> implements
		SubCategoryDAO {

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

	public SubCategoryDAOImpl() {
		super(SubCategory.class);
	}

	public SubCategory createSubCategory(SubCategory subCategory) {
		return saveOrUpdate(subCategory);
	}

	public void updateSubCategory(SubCategory subCategory) {
		// update(subCategory);
	}

	public void deleteSubCategory(SubCategory subCategory) {
		// delete(subCategory);
	}

	public SubCategory findSubCategory(Object id) {
		return null;// find(id);
	}

	public List<SubCategory> findAllSubCategory() {
		return null;// findAll();
	}

	public List<SubCategory> findRangeSubCategory(int[] range) {
		return null;// findRange(range);
	}

	public int countSubCategory() {
		return 0;// count();
	}

}
