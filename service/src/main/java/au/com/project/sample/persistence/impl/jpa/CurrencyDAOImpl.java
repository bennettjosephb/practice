package au.com.project.sample.persistence.impl.jpa;

import java.util.List;

import org.hibernate.SessionFactory;

import au.com.project.sample.domain.Currency;
import au.com.project.sample.domain.Location;
import au.com.project.sample.persistence.AbstractDAO;
import au.com.project.sample.persistence.CurrencyDAO;

public class CurrencyDAOImpl extends AbstractDAO<Currency> implements CurrencyDAO {

	private SessionFactory sessionFactory;

	@Override
	public  SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	@Override
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

    public CurrencyDAOImpl() {
        super(Currency.class);
    }

    public void createCurrency(Currency currency) {
        saveOrUpdate(currency);
    }

//    public Location findLocation(Long pKey)
//    {
//	return manager.find(Location.class, pKey);
//    }
//    public void updateSalary(Long salary, Location location){
//        Location a  = manager.find(Location.class, location.getId());
//    }
//
//    public void updateLocation(String location, Applicant applicant){
//        Applicant a  = manager.find(Applicant.class, applicant.getId());
//        Location location1 = new Location();
//        location1.setLocationName(location);
//        a.setCurrentLocation(location1);
//    }
//
//    public void addLocation(String location, Long applicantId){
//        Applicant a  = manager.find(Applicant.class, applicantId);
//        Location location1 = new Location();
//        location1.setLocationName(location);
//        a.setCurrentLocation(location1);
//    }
//
//    public void updateLocation(String location, Long applicantId){
//        Applicant a  = manager.find(Applicant.class, applicantId);
//        manager.find(Location.class, this);
//        a.getCurrentLocation().setLocationName(location);
//    }
//
//    public void updateLocation(Location location, Long applicantId){
//        Applicant a  = manager.find(Applicant.class, applicantId);
//        a.setCurrentLocation(location);
//    }
//
//    public void editApplicant(Applicant applicant) {
//        manager.merge(applicant);
//    }
//
//    public void removeApplicant(Applicant applicant) {
//        manager.remove(applicant);
//    }
    public void editLocation(Location applicant) {
        editCurrency(null);
    }

    public void removeLocation(Location applicant) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void updateLocation(String location, Location applicant) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void createLocation(Location applicant) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void editCurrency(Currency currency) {
     //   edit(currency);
    }

    public void removeCurrency(Currency currency) {
     //   remove(currency);
    }

    public void updateSalary(Long salary, Currency applicant) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Currency findCurrency(Long pKey) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void updateCurrency(String location, Currency applicant) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void updateCurrency(String location, Long applicantId) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void addCurrency(String location, Long applicantId) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void updateCurrency(Currency location, Long applicantId) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void updateCurrency(String location, Location applicant) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Currency findCurrency(Object id) {
        return null;//find(id);
    }

    public List<Currency> findAllCurrency() {
        return null;//findAll();
    }

    public List<Currency> findRangeCurrency(int[] range) {
        return null;//findRange(range);
    }

    public int countCurrency() {
        return 0;//count();
    }
}
