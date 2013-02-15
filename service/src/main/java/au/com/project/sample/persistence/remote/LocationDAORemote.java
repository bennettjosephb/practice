/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.persistence.remote;

import au.com.project.sample.domain.Location;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author SONY
 */
@Remote
public interface LocationDAORemote {

    void createLocation(Location location);

    void editLocation(Location location);

    void removeLocation(Location location);

    Location findLocation(Object id);

    List<Location> findAllLocation();

    List<Location> findRangeLocation(int[] range);

    int countLocation();
    
}
