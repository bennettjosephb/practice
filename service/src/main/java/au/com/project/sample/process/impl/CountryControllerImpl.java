/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.process.impl;

import java.util.List;

import au.com.project.sample.domain.Country;
import au.com.project.sample.persistence.CountryDAO;
import au.com.project.sample.process.CountryController;
import au.com.project.sample.process.impl.dto.CountryDTO;

/**
 * 
 * @author SONY
 */
public class CountryControllerImpl implements CountryController {

	private CountryDAO countryDAO;

	public CountryControllerImpl() {
	}

	private Country updateCountry(CountryDTO countryDTO) {
		Country country = new Country();

		country.setName(countryDTO.getName());
		country.setCode(countryDTO.getCode());

		return country;
	}

	public void createCountry(CountryDTO countryDTO) {
		countryDAO.createCountry(updateCountry(countryDTO));
	}

	public void editCountry(CountryDTO countryDTO) {
	}

	public void removeCountry(CountryDTO countryDTO) {
	}

	public CountryDTO findCountry(Object id) {
		return null;
	}

	public List<CountryDTO> findAllCountry() {
		return null;
	}

	public List<CountryDTO> findRangeCountry(int[] range) {
		return null;
	}

	public int countCountry() {
		return 0;
	}

	public CountryDAO getCountryDAO() {
		return countryDAO;
	}

	public void setCountryDAO(CountryDAO countryDAO) {
		this.countryDAO = countryDAO;
	}

}
