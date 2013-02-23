/*
 * To change this template, choose Tools | Templates
 * and open the template in the updateor.
 */
package au.com.project.sample.persistence;

import au.com.project.sample.domain.SubCategory;
import java.util.List;

/**
 *
 * author SONY
 */

public interface SubCategoryDAO {

	SubCategory createSubCategory(SubCategory subCategory);

    void updateSubCategory(SubCategory subCategory);

    void deleteSubCategory(SubCategory subCategory);

    SubCategory findSubCategory(Object id);

    List<SubCategory> findAllSubCategory();

    List<SubCategory> findRangeSubCategory(int[] range);

    int countSubCategory();

}
