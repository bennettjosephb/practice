/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.persistence.local;

import au.com.project.sample.domain.City;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author SONY
 */
@Local
public interface CityDAOLocal {

    void createCity(City city);

    void editCity(City city);

    void removeCity(City city);

    City findCity(Object id);

    List<City> findAllCity();

    List<City> findRangeCity(int[] range);

    int countCity();
    
}
