/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.persistence.impl.jpa;

import java.util.List;

import org.hibernate.SessionFactory;

import au.com.project.sample.domain.Address;
import au.com.project.sample.persistence.AbstractDAO;
import au.com.project.sample.persistence.AddressDAO;
import au.com.project.sample.persistence.CityDAO;

/**
 * 
 * @author SONY
 */
public class AddressDAOImpl extends AbstractDAO<Address> implements
		AddressDAO {

	private SessionFactory sessionFactory;

	private CityDAO cityDAO;
	
	public AddressDAOImpl() {
		super(Address.class);
	}

	public void createAddress(Address address) {
		if (address.getCity().getId() == null) {
			cityDAO.createCity(address.getCity());
		}
		saveOrUpdate(address);
	}

	public void editAddress(Address address) {
		//edit(address);
	}

	public void removeAddress(Address address) {
		//remove(address);
	}

	public Address findAddress(Object id) {
		return null;//find(id);
	}

	public List<Address> findAllAddress() {
		return null;//findAll();
	}

	@Override
	public SessionFactory getSessionFactory() {
		return sessionFactory ;
	}

	@Override
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public List<Address> findRange(int[] range) {
		// TODO Auto-generated method stub
		return null;
	}

	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}

}
