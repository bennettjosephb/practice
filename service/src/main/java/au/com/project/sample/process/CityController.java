/*
 * To change this template, choose Tools | Templates
 * and open the template in the updateor.
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

	CityDTO createCity(CityDTO cityDTO);

	CityDTO updateCity(CityDTO cityDTO);

    void deleteCity(CityDTO cityDTO);

    CityDTO findCity(Object id);

    List<CityDTO> findAllCity();

    List<CityDTO> findRangeCity(int[] range);

    int countCity();

}
