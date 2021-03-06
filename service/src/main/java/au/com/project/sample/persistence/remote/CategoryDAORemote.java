/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.persistence.remote;

import au.com.project.sample.domain.Category;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author SONY
 */
@Remote
public interface CategoryDAORemote {

    void createCategory(Category category);

    void editCategory(Category category);

    void removeCategory(Category category);

    Category findCategory(Object id);

    List<Category> findAllCategory();

    List<Category> findRangeCategory(int[] range);

    int countCategory();
    
}
