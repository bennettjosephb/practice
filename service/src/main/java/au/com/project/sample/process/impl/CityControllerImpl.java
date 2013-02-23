/*
 * To change this template, choose Tools | Templates
 * and open the template in the updateor.
 */
package au.com.project.sample.process.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import au.com.project.sample.domain.City;
import au.com.project.sample.domain.State;
import au.com.project.sample.persistence.CityDAO;
import au.com.project.sample.persistence.StateDAO;
import au.com.project.sample.process.CityController;
import au.com.project.sample.process.impl.dto.CityDTO;
import au.com.project.sample.process.impl.dto.StateDTO;

public class CityControllerImpl implements CityController {

	@Autowired
	private CityDAO cityDAO;

	@Autowired
	private StateDAO stateDAO;

	private State populateState(StateDTO stateDTO) {
		State state = stateDAO.findState(stateDTO.getId());
		return state;
	}

	private City populateCity(CityDTO cityDTO) {
		State state = stateDAO.findStateByCode(cityDTO.getStateDTO().getCode());

		City city = new City();

		city.setName(cityDTO.getName());
		city.setCode(cityDTO.getCode());
		city.setState(state);

		return city;
	}

	private CityDTO populateCityDTO(City city) {
		CityDTO cityDTO = new CityDTO();

		cityDTO.setName(city.getName());
		cityDTO.setCode(city.getCode());
		cityDTO.setId(city.getId());
		// cityDTO.setStateDTO(populateStateDTO(city.getState()));

		return cityDTO;
	}

	private StateDTO populateStateDTO(State state) {
		StateDTO stateDTO = new StateDTO();

		stateDTO.setName(state.getName());
		stateDTO.setCode(state.getCode());
		stateDTO.setId(state.getId());

		return stateDTO;
	}

	public CityControllerImpl() {
	}

	public CityDTO createCity(CityDTO cityDTO) {
		return populateCityDTO(cityDAO.createCity(populateCity(cityDTO)));
	}

	public CityDTO updateCity(CityDTO cityDTO) {
		return null;
	}

	public void deleteCity(CityDTO cityDTO) {
	}

	public CityDTO findCity(Object id) {
		return null;
	}

	public List<CityDTO> findAllCity() {
		return null;
	}

	public List<CityDTO> findRangeCity(int[] range) {
		return null;
	}

	public int countCity() {
		return 0;
	}

	public CityDAO getCityDAO() {
		return cityDAO;
	}

	public void setCityDAO(CityDAO cityDAO) {
		this.cityDAO = cityDAO;
	}

	public StateDAO getStateDAO() {
		return stateDAO;
	}

	public void setStateDAO(StateDAO stateDAO) {
		this.stateDAO = stateDAO;
	}

}
