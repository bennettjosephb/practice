/*
 * To change this template, choose Tools | Templates
 * and open the template in the updateor.
 */
package au.com.project.sample.process;

import java.util.List;

import au.com.project.sample.process.impl.dto.CategoryDTO;

/**
 *
 * @author SONY
 */
public interface CategoryController {

    void createCategory(CategoryDTO categoryDTO);

    void updateCategory(CategoryDTO categoryDTO);

    void deleteCategory(CategoryDTO categoryDTO);

    CategoryDTO findCategory(Object id);

    List<CategoryDTO> findAllCategory();

    List<CategoryDTO> findRangeCategory(int[] range);

    int countCategory();

}
