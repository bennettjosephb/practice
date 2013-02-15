/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.persistence.impl.jpa;

import au.com.project.sample.persistence.local.SubCategoryDAOLocal;
import au.com.project.sample.domain.SubCategory;
import au.com.project.sample.persistence.AbstractDAO;
import au.com.project.sample.persistence.remote.SubCategoryDAORemote;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author SONY
 */
@Stateless
public class SubCategoryDAOImpl extends AbstractDAO<SubCategory> implements SubCategoryDAOLocal, SubCategoryDAORemote {
    @PersistenceContext(unitName = "project")
    private EntityManager em;

    protected EntityManager getEntityManager() {
        return em;
    }

    public SubCategoryDAOImpl() {
        super(SubCategory.class);
    }

    public void createSubCategory(SubCategory subCategory) {
        create(subCategory);
    }

    public void editSubCategory(SubCategory subCategory) {
        edit(subCategory);
    }

    public void removeSubCategory(SubCategory subCategory) {
        remove(subCategory);
    }

    public SubCategory findSubCategory(Object id) {
        return find(id);
    }

    public List<SubCategory> findAllSubCategory() {
        return findAll();
    }

    public List<SubCategory> findRangeSubCategory(int[] range) {
        return findRange(range);
    }

    public int countSubCategory() {
        return count();
    }
    
}
