/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.persistence.impl.jpa;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;

import au.com.project.sample.domain.Country;
import au.com.project.sample.persistence.CountryCacheDAO;

/**
 *
 * @author SONY
 */
public class CountryCacheDAOImpl implements CountryCacheDAO {

	private SessionFactory sessionFactory;

	public  SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

    final List<Country> countryCache = new ArrayList<Country>();


    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

}
