/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.persistence.impl.jpa;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import au.com.project.sample.domain.City;
import au.com.project.sample.domain.State;
import au.com.project.sample.persistence.AbstractDAO;
import au.com.project.sample.persistence.CityDAO;

/**
 * 
 * @author SONY
 */
public class CityDAOImpl extends AbstractDAO<City> implements CityDAO {

	private SessionFactory sessionFactory;

	public CityDAOImpl() {
		super(City.class);
	}

	public void createCity(City city) {
		city.setCode(city.getCode().toUpperCase());
		saveOrUpdate(city);
	}

	public void editCity(City city) {
		// edit(city);
	}

	public void removeCity(City city) {
		// remove(city);
	}

	public City findCity(Object id) {
		return null;// find(id);
	}

	public List<City> findAllCity() {
		return null;// findAll();
	}

	public List<City> findRangeCity(int[] range) {
		return null;// findRange(range);
	}

	public int countCity() {
		return 0;
	}

	public City findCityByCode(String code) {
		Session session = getSession();

		City city = (City) session.createCriteria(City.class)
				.add(Restrictions.eq("code", code)).uniqueResult();

		session.close();

		return city;
	}

	public List<City> findStateByName(String name) {
		Session session = getSession();

		List<City> city = (List<City>) session.createCriteria(City.class)
				.add(Restrictions.eq("name", name)).list();

		session.close();

		return city;
	}

	@Override
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	@Override
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
