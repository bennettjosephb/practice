/*
 * To change this template, choose Tools | Templates
 * and open the template in the updateor.
 */
package au.com.project.sample.process.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

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

	@Autowired
	CountryDAO countryDAO;

	@Autowired
	StateDAO stateDAO;

	private State populateState(StateDTO stateDTO) {
		Country country = countryDAO.findCountryByCode(stateDTO.getCountryDTO()
				.getCode());

		State state = new State();

		state.setName(stateDTO.getName());
		state.setCode(stateDTO.getCode());
		state.setCountry(country);

		return state;
	}

	public void createState(StateDTO stateDTO) {
		stateDAO.createState(populateState(stateDTO));
	}

	public void updateState(StateDTO stateDTO) {
	}

	public void deleteState(StateDTO stateDTO) {
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
