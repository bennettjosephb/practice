package au.com.project.sample.persistence.impl.jpa;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import au.com.project.sample.domain.Applicant;
import au.com.project.sample.domain.Location;
import au.com.project.sample.domain.Salary;
import au.com.project.sample.persistence.local.ApplicantDAOLocal;
import au.com.project.sample.persistence.remote.ApplicantDAORemote;

@Stateless
public class ApplicantDAOImpl implements ApplicantDAOLocal, ApplicantDAORemote
{
    @PersistenceContext(unitName="project") private EntityManager manager;

    public void createApplicant(Applicant applicant)
    {
	manager.persist(applicant);
    }

    public Applicant findCabin(Long pKey)
    {
	return manager.find(Applicant.class, pKey);
    }

    public void updateSalary(Long salary, Applicant applicant){
        Applicant a  = manager.find(Applicant.class, applicant.getId());
        a.getAnnualSalary().setValue(salary);
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
}
