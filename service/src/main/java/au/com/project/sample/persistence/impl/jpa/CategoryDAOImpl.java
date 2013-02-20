/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.persistence.impl.jpa;

import java.util.List;

import org.hibernate.SessionFactory;

import au.com.project.sample.domain.Category;
import au.com.project.sample.persistence.AbstractDAO;
import au.com.project.sample.persistence.CategoryDAO;

/**
 *
 * @author SONY
 */
public class CategoryDAOImpl extends AbstractDAO<Category> implements CategoryDAO {

    private SessionFactory sessionFactory;

	public CategoryDAOImpl() {
        super(Category.class);
    }

    public void createCategory(Category category) {
        saveOrUpdate(category);
    }

    public void editCategory(Category category) {
        //edit(category);
    }

    public void removeCategory(Category category) {
        //remove(category);
    }

    public Category findCategory(Object id) {
        return null;//find(id);
    }

    public List<Category> findAllCategory() {
        return null;//findAll();
    }

    public List<Category> findRangeCategory(int[] range) {
        return null;//findRange(range);
    }

    public int countCategory() {
        return 0;//count();
    }

	@Override
	protected SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	@Override
	protected void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
