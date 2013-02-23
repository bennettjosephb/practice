/*
 * To change this template, choose Tools | Templates
 * and open the template in the updateor.
 */
package au.com.project.sample.process;

import java.util.List;

import au.com.project.sample.process.impl.dto.SubCategoryDTO;

/**
 *
 * @author SONY
 */
public interface SubCategoryController {

	void createSubCategory(SubCategoryDTO subCategoryDTO);

	void updateSubCategory(SubCategoryDTO subCategoryDTO);

	void deleteSubCategory(SubCategoryDTO subCategoryDTO);

	SubCategoryDTO findSubCategory(Object id);

	List<SubCategoryDTO> findAllSubCategory();

	List<SubCategoryDTO> findRangeSubCategory(int[] range);

	int countSubCategory();

}
