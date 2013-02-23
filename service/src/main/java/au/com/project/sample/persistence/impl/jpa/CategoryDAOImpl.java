/*
 * To change this template, choose Tools | Templates
 * and open the template in the updateor.
 */
package au.com.project.sample.persistence.impl.jpa;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import au.com.project.sample.domain.Category;
import au.com.project.sample.persistence.AbstractDAO;
import au.com.project.sample.persistence.CategoryDAO;

/**
 *
 * @author SONY
 */
public class CategoryDAOImpl extends AbstractDAO<Category> implements
		CategoryDAO {

	private static Logger log = Logger.getLogger(CategoryDAOImpl.class);

	@Autowired
	private SessionFactory sessionFactory;

	public CategoryDAOImpl() {
		super(Category.class);
	}

	public Category createCategory(Category category) {
		return saveOrUpdate(category);
	}

	public void updateCategory(Category category) {
		// update(category);
	}

	public void deleteCategory(Category category) {
		// delete(category);
	}

	public Category findCategory(Object id) {
		return null;// find(id);
	}

	public Category findCategoryByCode(String code) {
		return (Category) findByCode(code);

	}

	public List<Category> findAllCategory() {
		return null;// findAll();
	}

	public List<Category> findRangeCategory(int[] range) {
		return null;// findRange(range);
	}

	public int countCategory() {
		return 0;// count();
	}

	@Override
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	@Override
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
