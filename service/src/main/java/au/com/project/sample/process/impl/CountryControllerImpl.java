/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.process.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import au.com.project.sample.domain.Country;
import au.com.project.sample.persistence.CountryDAO;
import au.com.project.sample.process.CountryController;
import au.com.project.sample.process.impl.dto.CountryDTO;

public class CountryControllerImpl implements CountryController {

	private static Logger log = Logger.getLogger(CountryControllerImpl.class);

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
		log.trace("Creating Country Entity");
		countryDAO.createCountry(updateCountry(countryDTO));
		log.trace("Created Country Entity");
	}

	public void editCountry(CountryDTO countryDTO) {
	}

	public void removeCountry(CountryDTO countryDTO) {
	}

	public CountryDTO findCountry(Object id) {
		return null;
	}

	public List<CountryDTO> findAllCountry() {
		log.trace("Retriving All Countries");
		return updateCountryDTO(countryDAO.findAllCountry());
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

	private List<CountryDTO> updateCountryDTO(List<Country> countryList) {

		List<CountryDTO> countries = new ArrayList<CountryDTO>();

		for (Country country : countryList) {

			CountryDTO countryDTO = new CountryDTO();
			countryDTO.setCode(country.getCode());
			countryDTO.setId(country.getId());
			countryDTO.setName(country.getName());
			countries.add(countryDTO);

		}

		return countries;
	}

}
