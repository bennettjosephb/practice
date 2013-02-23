/*
 * To change this template, choose Tools | Templates
 * and open the template in the updateor.
 */
package au.com.project.sample.persistence;

import au.com.project.sample.domain.Country;
import au.com.project.sample.domain.State;

import java.util.List;

/**
 *
 * author SONY
 */

public interface CountryDAO {

	Country createCountry(Country country);

    void updateCountry(Country country);

    void deleteCountry(Country country);

    Country findCountry(Long id);

    Country findCountryByCode(String c);

    List<Country> findCountryByName(String name);

    List<Country> findAllCountry();

    List<Country> findRangeCountry(int[] range);

    int countCountry();

}
