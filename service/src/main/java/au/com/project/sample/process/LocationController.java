/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.process;

import au.com.project.sample.domain.Location;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author SONY
 */
public interface LocationController {

    void createLocation(Location location);

    void editLocation(Location location);

    void removeLocation(Location location);

    Location findLocation(Object id);

    List<Location> findAllLocation();

    List<Location> findRangeLocation(int[] range);

    int countLocation();
    
}
