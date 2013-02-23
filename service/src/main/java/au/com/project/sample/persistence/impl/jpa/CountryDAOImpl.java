/*
 * To change this template, choose Tools | Templates
 * and open the template in the updateor.
 */
package au.com.project.sample.persistence.impl.jpa;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import au.com.project.sample.domain.Country;
import au.com.project.sample.persistence.AbstractDAO;
import au.com.project.sample.persistence.CountryDAO;

public class CountryDAOImpl extends AbstractDAO<Country> implements CountryDAO {

	private static Logger log = Logger.getLogger(CountryDAOImpl.class);

	@Autowired
	private SessionFactory sessionFactory;

	public CountryDAOImpl() {
		super(Country.class);
	}

	public Country createCountry(Country country) {
		log.trace("Converting the code to Upper Case");
		country.setCode(country.getCode().toUpperCase());
		log.trace("Persisting Country Entity");
		return saveOrUpdate(country);
	}

	public void updateCountry(Country country) {
		// update(country);
	}

	public void deleteCountry(Country country) {
		// delete(country);
	}

	public Country findCountry(Long id) {
		return (Country) findById(id);
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
