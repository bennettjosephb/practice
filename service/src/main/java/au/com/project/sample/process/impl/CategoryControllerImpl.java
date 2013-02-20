/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.process.impl;

import java.util.List;

import org.apache.log4j.Logger;

import au.com.project.sample.domain.Category;
import au.com.project.sample.persistence.CategoryDAO;
import au.com.project.sample.process.CategoryController;
import au.com.project.sample.process.impl.dto.CategoryDTO;
import au.com.project.sample.services.admin.createcategory.CreateCategoryManager;

public class CategoryControllerImpl implements CategoryController {

	private static Logger log = Logger.getLogger(CategoryControllerImpl.class);

	private CategoryDAO categoryDAO;

	private Category updateCountry(CategoryDTO categoryDTO) {
		Category category = new Category();

		category.setName(categoryDTO.getName());
		category.setCode(categoryDTO.getCode());

		return category;
	}

	public void createCategory(CategoryDTO categoryDTO) {
		categoryDAO.createCategory(updateCountry(categoryDTO));
	}

	public void editCategory(CategoryDTO categoryDTO) {
	}

	public void removeCategory(CategoryDTO categoryDTO) {
	}

	public CategoryDTO findCategory(Object id) {
		return null;
	}

	public List<CategoryDTO> findAllCategory() {
		return null;
	}

	public List<CategoryDTO> findRangeCategory(int[] range) {
		return null;
	}

	public int countCategory() {
		return 0;
	}

	public CategoryDAO getCategoryDAO() {
		return categoryDAO;
	}

	public void setCategoryDAO(CategoryDAO categoryDAO) {
		this.categoryDAO = categoryDAO;
	}

}
