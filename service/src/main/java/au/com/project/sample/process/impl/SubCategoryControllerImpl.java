/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.process.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import au.com.project.sample.domain.Category;
import au.com.project.sample.domain.SubCategory;
import au.com.project.sample.persistence.CategoryDAO;
import au.com.project.sample.persistence.SubCategoryDAO;
import au.com.project.sample.process.SubCategoryController;
import au.com.project.sample.process.impl.dto.SubCategoryDTO;

/**
 * 
 * @author SONY
 */
public class SubCategoryControllerImpl implements SubCategoryController {

	@Autowired
	private SubCategoryDAO subCategoryDAO;

	@Autowired
	private CategoryDAO categoryDAO;

	private SubCategory updateCountry(SubCategoryDTO subCategoryDTO) {
		
		Category category = categoryDAO.findCategoryByCode(subCategoryDTO.getCategoryDTO().getCode());
		
		SubCategory subCategory = new SubCategory();

		subCategory.setName(subCategoryDTO.getName());
		subCategory.setCode(subCategoryDTO.getCode());
		subCategory.setCategory(category);

		return subCategory;
	}

	public void createSubCategory(SubCategoryDTO subCategoryDTO) {

		subCategoryDAO.createSubCategory(updateCountry(subCategoryDTO));
	}

	public void editSubCategory(SubCategoryDTO subCategoryDTO) {
	}

	public void removeSubCategory(SubCategoryDTO subCategoryDTO) {
	}

	public SubCategoryDTO findSubCategory(Object id) {
		return null;
	}

	public List<SubCategoryDTO> findAllSubCategory() {
		return null;
	}

	public List<SubCategoryDTO> findRangeSubCategory(int[] range) {
		return null;
	}

	public int countSubCategory() {
		return 0;
	}

	public SubCategoryDAO getSubCategoryDAO() {
		return subCategoryDAO;
	}

	public void setSubCategoryDAO(SubCategoryDAO subCategoryDAO) {
		this.subCategoryDAO = subCategoryDAO;
	}

	public CategoryDAO getCategoryDAO() {
		return categoryDAO;
	}

	public void setCategoryDAO(CategoryDAO categoryDAO) {
		this.categoryDAO = categoryDAO;
	}

}
