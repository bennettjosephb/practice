/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.process.impl;

import java.util.List;

import au.com.project.sample.domain.City;
import au.com.project.sample.domain.State;
import au.com.project.sample.persistence.CityDAO;
import au.com.project.sample.persistence.StateDAO;
import au.com.project.sample.process.CityController;
import au.com.project.sample.process.impl.dto.CityDTO;
import au.com.project.sample.process.impl.dto.StateDTO;

public class CityControllerImpl implements CityController {

	private CityDAO cityDAO;

	private StateDAO stateDAO;

	private State updateState(StateDTO stateDTO) {
		State state = stateDAO.findState(stateDTO.getId());
		return state;
	}

	private City updateCity(CityDTO cityDTO) {
		State state = stateDAO.findStateByCode(cityDTO.getStateDTO().getCode());
		
		City city = new City();

		city.setName(cityDTO.getName());
		city.setCode(cityDTO.getCode());
		city.setState(state);

		return city;
	}

	public CityControllerImpl() {
	}

	public void createCity(CityDTO cityDTO) {
		cityDAO.createCity(updateCity(cityDTO));
	}

	public void editCity(CityDTO cityDTO) {
	}

	public void removeCity(CityDTO cityDTO) {
	}

	public City findCity(Object id) {
		return null;
	}

	public List<City> findAllCity() {
		return null;
	}

	public List<City> findRangeCity(int[] range) {
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
