/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.process;

import au.com.project.sample.domain.SubCategory;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author SONY
 */
public interface SubCategoryController {

    void createSubCategory(SubCategory subCategory);

    void editSubCategory(SubCategory subCategory);

    void removeSubCategory(SubCategory subCategory);

    SubCategory findSubCategory(Object id);

    List<SubCategory> findAllSubCategory();

    List<SubCategory> findRangeSubCategory(int[] range);

    int countSubCategory();
    
}
