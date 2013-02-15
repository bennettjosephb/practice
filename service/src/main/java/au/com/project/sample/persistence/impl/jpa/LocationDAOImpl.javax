/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.persistence.impl.jpa;

import au.com.project.sample.persistence.local.LocationDAOLocal;
import au.com.project.sample.domain.Location;
import au.com.project.sample.persistence.AbstractDAO;
import au.com.project.sample.persistence.remote.LocationDAORemote;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author SONY
 */
@Stateless
public class LocationDAOImpl extends AbstractDAO<Location> implements LocationDAOLocal, LocationDAORemote {
    @PersistenceContext(unitName = "project")
    private EntityManager em;

    protected EntityManager getEntityManager() {
        return em;
    }

    public LocationDAOImpl() {
        super(Location.class);
    }

    public void createLocation(Location location) {
        create(location);
    }

    public void editLocation(Location location) {
        edit(location);
    }

    public void removeLocation(Location location) {
        remove(location);
    }

    public Location findLocation(Object id) {
        return find(id);
    }

    public List<Location> findAllLocation() {
        return findAll();
    }

    public List<Location> findRangeLocation(int[] range) {
        return findRange(range);
    }

    public int countLocation() {
        return count();
    }
    
}
