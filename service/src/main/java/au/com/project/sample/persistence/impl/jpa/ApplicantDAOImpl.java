package au.com.project.sample.persistence.impl.jpa;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import au.com.project.sample.domain.Applicant;
import au.com.project.sample.domain.Location;
import au.com.project.sample.persistence.AbstractDAO;
import au.com.project.sample.persistence.ApplicantDAO;

public class ApplicantDAOImpl  extends AbstractDAO<Applicant> implements ApplicantDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public ApplicantDAOImpl(){
		super(Applicant.class);
	}

	public Applicant createApplicant(Applicant applicant) {
		return saveOrUpdate(applicant);
	}

	public Applicant findApplicant(Long pKey) {
		return find(pKey);
	}

	public void updateSalary(Long salary, Applicant applicant) {
//		Applicant a = manager.find(Applicant.class, applicant.getId());
//		a.getAnnualSalary().setValue(salary);
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

	public void editApplicant(Applicant applicant) {
//		manager.merge(applicant);
	}

	public void removeApplicant(Applicant applicant) {
	//	manager.remove(applicant);
	}

	@Override
	protected SessionFactory getSessionFactory() {
		// TODO Auto-generated method stub
		return sessionFactory ;
	}

	@Override
	protected void setSessionFactory(SessionFactory sessionFactory) {
		// TODO Auto-generated method stub
		this.sessionFactory  = sessionFactory ;
	}
}
