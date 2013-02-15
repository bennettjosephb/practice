/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.process.impl;

import au.com.project.sample.domain.Location;
import au.com.project.sample.process.LocationController;
import java.util.List;

/**
 *
 * @author SONY
 */
public class LocationControllerImpl implements  LocationController{

    public void createLocation(Location location){}

    public void editLocation(Location location){}

    public void removeLocation(Location location){}

    public Location findLocation(Object id){return null;}

    public List<Location> findAllLocation(){return null;}

    public List<Location> findRangeLocation(int[] range){return null;}

    public int countLocation(){return 0;}
    
}
