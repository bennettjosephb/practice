/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.persistence;

import au.com.project.sample.domain.Category;
import java.util.List;

/**
 *
 * author SONY
 */

public interface CategoryDAO {

	Category createCategory(Category category);

    void editCategory(Category category);

    void removeCategory(Category category);

    Category findCategory(Object id);

    Category findCategoryByCode(String code);

    List<Category> findAllCategory();

    List<Category> findRangeCategory(int[] range);

    int countCategory();

}
