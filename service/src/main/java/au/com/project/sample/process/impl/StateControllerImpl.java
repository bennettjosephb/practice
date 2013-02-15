/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.process.impl;

import java.util.List;

import au.com.project.sample.domain.Country;
import au.com.project.sample.domain.State;
import au.com.project.sample.persistence.CountryDAO;
import au.com.project.sample.persistence.StateDAO;
import au.com.project.sample.process.StateController;
import au.com.project.sample.process.impl.dto.StateDTO;

/**
 * 
 * @author SONY
 */
public class StateControllerImpl implements StateController {

	CountryDAO countryDAO;

	StateDAO stateDAO;

	private State updateState(StateDTO stateDTO) {
		System.out.println(stateDTO.getCountryDTO()
				.getId());
		System.out.println(stateDTO.getCountryDTO()
				.getId());
		System.out.println(stateDTO.getCountryDTO()
				.getId());
		System.out.println(stateDTO.getCountryDTO()
				.getId());
		System.out.println(stateDTO.getCountryDTO()
				.getId());
		Country country = countryDAO.findCountryByCode(stateDTO.getCountryDTO()
				.getCode());

		System.out.println(country);
		System.out.println(country);
		System.out.println(country);
		System.out.println(country);
		System.out.println(country);
		System.out.println(country);

		State state = new State();

		state.setName(stateDTO.getName());
		state.setCode(stateDTO.getCode());
		state.setCountry(country);

		return state;
	}

	public void createState(StateDTO stateDTO) {
		stateDAO.createState(updateState(stateDTO));
	}

	public void editState(StateDTO stateDTO) {
	}

	public void removeState(StateDTO stateDTO) {
	}

	public StateDTO findState(Object id) {
		return null;
	}

	public List<StateDTO> findAllStates() {
		return null;
	}

	public List<StateDTO> findRange(int[] range) {
		return null;
	}

	public int count() {
		return 0;
	}

	public CountryDAO getCountryDAO() {
		return countryDAO;
	}

	public void setCountryDAO(CountryDAO countryDAO) {
		this.countryDAO = countryDAO;
	}

	public StateDAO getStateDAO() {
		return stateDAO;
	}

	public void setStateDAO(StateDAO stateDAO) {
		this.stateDAO = stateDAO;
	}

}
