/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.persistence.remote;

import au.com.project.sample.domain.Country;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author SONY
 */
@Remote
public interface CountryDAORemote {

    void createCountry(Country country);

    void editCountry(Country country);

    void removeCountry(Country country);

    Country findCountry(Object id);

    List<Country> findAllCountry();

    List<Country> findRangeCountry(int[] range);

    int countCountry();
    
}
