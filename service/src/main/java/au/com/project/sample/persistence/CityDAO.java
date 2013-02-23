/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.persistence;

import java.util.List;

import au.com.project.sample.domain.City;

/**
 *
 * author SONY
 */

public interface CityDAO {

	City createCity(City city);

    void editCity(City city);

    void removeCity(City city);

    City findCity(Object id);

    List<City> findAllCity();

    List<City> findRangeCity(int[] range);

    int countCity();

    public City findCityByCode(String code);

	public List<City> findStateByName(String name);
	
}
