/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.persistence.impl.jpa;

import java.util.List;

import javax.ejb.Stateless;

import org.hibernate.SessionFactory;

import au.com.project.sample.domain.SubCategory;
import au.com.project.sample.persistence.AbstractDAO;
import au.com.project.sample.persistence.SubCategoryDAO;

/**
 *
 * @author SONY
 */
public class SubCategoryDAOImpl extends AbstractDAO<SubCategory> implements SubCategoryDAO {
	private SessionFactory sessionFactory;

	@Override
	public  SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	@Override
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

    public SubCategoryDAOImpl() {
        super(SubCategory.class);
    }

    public void createSubCategory(SubCategory subCategory) {
        saveOrUpdate(subCategory);
    }

    public void editSubCategory(SubCategory subCategory) {
   //     edit(subCategory);
    }

    public void removeSubCategory(SubCategory subCategory) {
    //    remove(subCategory);
    }

    public SubCategory findSubCategory(Object id) {
        return null;//find(id);
    }

    public List<SubCategory> findAllSubCategory() {
        return null;//findAll();
    }

    public List<SubCategory> findRangeSubCategory(int[] range) {
        return null;//findRange(range);
    }

    public int countSubCategory() {
        return 0;//count();
    }

}
