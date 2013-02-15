/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
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

    void editLocation(Location location);

    void removeLocation(Location location);

    Location findLocation(Object id);

    List<Location> findAllLocation();

    List<Location> findRangeLocation(int[] range);

    int countLocation();

}
