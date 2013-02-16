/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.persistence.impl.jpa;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import au.com.project.sample.domain.Country;
import au.com.project.sample.persistence.AbstractDAO;
import au.com.project.sample.persistence.CountryDAO;
import au.com.project.sample.process.impl.CountryControllerImpl;

public class CountryDAOImpl extends AbstractDAO<Country> implements CountryDAO {

	private static Logger log = Logger.getLogger(CountryDAOImpl.class);

	private SessionFactory sessionFactory;

	public CountryDAOImpl() {
		super(Country.class);
	}

	public void createCountry(Country country) {
		log.trace("Converting the code to Upper Case");
		country.setCode(country.getCode().toUpperCase());
		log.trace("Persisting Country Entity");
		saveOrUpdate(country);
	}

	public void editCountry(Country country) {
		// edit(country);
	}

	public void removeCountry(Country country) {
		// remove(country);
	}

	public Country findCountry(Long id) {
		return (Country) find(id);
	}

	public List<Country> findAllCountry() {
		log.trace("Retriving All Countries");
		return findAll();
	}

	public List<Country> findRangeCountry(int[] range) {
		return null;// findRange(range);
	}

	public int countCountry() {
		return 0;// count();
	}

	@Override
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	@Override
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Country findCountryByCode(String code) {
		Session session = getSession();

		Country country = (Country) session.createCriteria(Country.class)
				.add(Restrictions.eq("code", code)).uniqueResult();

		session.close();

		return country;
	}

	public List<Country> findCountryByName(String name) {
		Session session = getSession();

		List<Country> country = (List<Country>) session
				.createCriteria(Country.class)
				.add(Restrictions.eq("name", name)).list();

		session.close();

		return country;
	}

}
