package au.com.project.sample.persistence.impl.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.SessionFactory;

import au.com.project.sample.domain.Applicant;
import au.com.project.sample.domain.Location;
import au.com.project.sample.persistence.LocationDAO;

public class LocationBean implements LocationDAO {
	private SessionFactory sessionFactory;

	// @Override
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	// @Override
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void createLocation(Location location) {
		//saveOrUpdate(location);
	}

	public Location findLocation(Long pKey) {
		return null;//manager.find(Location.class, pKey);
	}

	public void updateSalary(Long salary, Location location) {
		//Location a = manager.find(Location.class, location.getId());
	}

	public void updateLocation(String location, Applicant applicant) {
//		Applicant a = manager.find(Applicant.class, applicant.getId());
//		Location location1 = new Location();
//		location1.setLocationName(location);
//		a.setCurrentLocation(location1);
	}

	public void addLocation(String location, Long applicantId) {
//		Applicant a = manager.find(Applicant.class, applicantId);
//		Location location1 = new Location();
//		location1.setLocationName(location);
//		a.setCurrentLocation(location1);
	}

	public void updateLocation(String location, Long applicantId) {
//		Applicant a = manager.find(Applicant.class, applicantId);
//		manager.find(Location.class, this);
//		a.getCurrentLocation().setLocationName(location);
	}

	public void updateLocation(Location location, Long applicantId) {
//		Applicant a = manager.find(Applicant.class, applicantId);
//		a.setCurrentLocation(location);
	}

	public void updateApplicant(Applicant applicant) {
//		manager.merge(applicant);
	}

	public void deleteApplicant(Applicant applicant) {
	//	manager.delete(applicant);
	}

	public void updateLocation(Location applicant) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	public void deleteLocation(Location applicant) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	public void updateLocation(String location, Location applicant) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	public Location findLocation(Object id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Location> findAllLocation() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Location> findRangeLocation(int[] range) {
		// TODO Auto-generated method stub
		return null;
	}

	public int countLocation() {
		// TODO Auto-generated method stub
		return 0;
	}
}
