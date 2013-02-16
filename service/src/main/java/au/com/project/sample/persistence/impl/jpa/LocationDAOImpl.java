/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.persistence.impl.jpa;

import java.util.List;

import org.hibernate.SessionFactory;

import au.com.project.sample.domain.Location;
import au.com.project.sample.persistence.AbstractDAO;
import au.com.project.sample.persistence.LocationDAO;

/**
 *
 * @author SONY
 */
public class LocationDAOImpl extends AbstractDAO<Location> implements LocationDAO {
	private SessionFactory sessionFactory;

	@Override
	public  SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	@Override
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

    public LocationDAOImpl() {
        super(Location.class);
    }

    public void createLocation(Location location) {
        saveOrUpdate(location);
    }

    public void editLocation(Location location) {
        //edit(location);
    }

    public void removeLocation(Location location) {
        //remove(location);
    }

    public Location findLocation(Object id) {
        return null;//find(id);
    }

    public List<Location> findAllLocation() {
        return null;//findAll();
    }

    public List<Location> findRangeLocation(int[] range) {
        return null;//findRange(range);
    }

    public int countLocation() {
        return 0;//count();
    }

}
