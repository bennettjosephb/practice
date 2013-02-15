/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.persistence.impl.jpa;

import au.com.project.sample.persistence.local.CategoryDAOLocal;
import au.com.project.sample.domain.Category;
import au.com.project.sample.persistence.AbstractDAO;
import au.com.project.sample.persistence.remote.CategoryDAORemote;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author SONY
 */
@Stateless
public class CategoryDAOImpl extends AbstractDAO<Category> implements CategoryDAOLocal, CategoryDAORemote {
    @PersistenceContext(unitName = "project")
    private EntityManager em;

    protected EntityManager getEntityManager() {
        return em;
    }

    public CategoryDAOImpl() {
        super(Category.class);
    }

    public void createCategory(Category category) {
        create(category);
    }

    public void editCategory(Category category) {
        edit(category);
    }

    public void removeCategory(Category category) {
        remove(category);
    }

    public Category findCategory(Object id) {
        return find(id);
    }

    public List<Category> findAllCategory() {
        return findAll();
    }

    public List<Category> findRangeCategory(int[] range) {
        return findRange(range);
    }

    public int countCategory() {
        return count();
    }
    
}
