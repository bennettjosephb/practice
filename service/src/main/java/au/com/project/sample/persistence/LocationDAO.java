/*
 * To change this template, choose Tools | Templates
 * and open the template in the updateor.
 */
package au.com.project.sample.persistence;

import au.com.project.sample.domain.Location;
import java.util.List;

/**
 *
 * author SONY
 */

public interface LocationDAO {

    void createLocation(Location location);

    void updateLocation(Location location);

    void deleteLocation(Location location);

    Location findLocation(Object id);

    List<Location> findAllLocation();

    List<Location> findRangeLocation(int[] range);

    int countLocation();

}
