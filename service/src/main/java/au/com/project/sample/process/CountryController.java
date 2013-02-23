/*
 * To change this template, choose Tools | Templates
 * and open the template in the updateor.
 */
package au.com.project.sample.process;

import java.util.List;

import au.com.project.sample.process.impl.dto.CountryDTO;

/**
 *
 * @author SONY
 */
public interface CountryController {

    void createCountry(CountryDTO countryDTO);

    void updateCountry(CountryDTO countryDTO);

    void deleteCountry(CountryDTO countryDTO);

    CountryDTO findCountry(Object id);

    List<CountryDTO> findAllCountry();

    List<CountryDTO> findRangeCountry(int[] range);

    int countCountry();

}
