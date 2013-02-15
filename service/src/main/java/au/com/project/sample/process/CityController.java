/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.process;

import java.util.List;

import au.com.project.sample.domain.City;
import au.com.project.sample.process.impl.dto.CityDTO;

/**
 *
 * @author SONY
 */
public interface CityController {

    void createCity(CityDTO cityDTO);

    void editCity(CityDTO cityDTO);

    void removeCity(CityDTO cityDTO);

    City findCity(Object id);

    List<City> findAllCity();

    List<City> findRangeCity(int[] range);

    int countCity();
    
}
