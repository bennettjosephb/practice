/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.persistence.local;

import au.com.project.sample.domain.Category;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author SONY
 */
@Local
public interface CategoryDAOLocal {

    void createCategory(Category category);

    void editCategory(Category category);

    void removeCategory(Category category);

    Category findCategory(Object id);

    List<Category> findAllCategory();

    List<Category> findRangeCategory(int[] range);

    int countCategory();
    
}
