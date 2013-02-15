/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
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

    void createCountry(Country country);

    void editCountry(Country country);

    void removeCountry(Country country);

    Country findCountry(Long id);
    
    Country findCountryByCode(String c);

    List<Country> findCountryByName(String name);

    List<Country> findAllCountry();

    List<Country> findRangeCountry(int[] range);

    int countCountry();

}
