package au.com.project.sample.persistence.impl.jpa;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import au.com.project.sample.domain.Applicant;
import au.com.project.sample.domain.Location;
import au.com.project.sample.persistence.remote.AddressRemote;
import au.com.project.sample.persistence.local.AddressLocal;

@Stateless
public class AddressBean implements AddressLocal, AddressRemote
{
    @PersistenceContext(unitName="project") private EntityManager manager;

    public void createLocation(Location location)
    {
	manager.persist(location);
    }

    public Location findLocation(Long pKey)
    {
	return manager.find(Location.class, pKey);
    }

    public void updateSalary(Long salary, Location location){
        Location a  = manager.find(Location.class, location.getId());
    }

    public void updateLocation(String location, Applicant applicant){
        Applicant a  = manager.find(Applicant.class, applicant.getId());
        Location location1 = new Location();
        location1.setLocationName(location);
        a.setCurrentLocation(location1);
    }

    public void addLocation(String location, Long applicantId){
        Applicant a  = manager.find(Applicant.class, applicantId);
        Location location1 = new Location();
        location1.setLocationName(location);
        a.setCurrentLocation(location1);
    }

    public void updateLocation(String location, Long applicantId){
        Applicant a  = manager.find(Applicant.class, applicantId);
        manager.find(Location.class, this);
        a.getCurrentLocation().setLocationName(location);
    }

    public void updateLocation(Location location, Long applicantId){
        Applicant a  = manager.find(Applicant.class, applicantId);
        a.setCurrentLocation(location);
    }

    public void editApplicant(Applicant applicant) {
        manager.merge(applicant);
    }

    public void removeApplicant(Applicant applicant) {
        manager.remove(applicant);
    }

    public void editLocation(Location applicant) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void removeLocation(Location applicant) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void updateLocation(String location, Location applicant) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
