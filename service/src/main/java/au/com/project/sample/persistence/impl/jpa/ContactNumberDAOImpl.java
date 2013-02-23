/*
 * To change this template, choose Tools | Templates
 * and open the template in the updateor.
 */
package au.com.project.sample.persistence.impl.jpa;

import java.util.List;

import org.hibernate.SessionFactory;

import au.com.project.sample.domain.phonenumber.ContactNumber;
import au.com.project.sample.persistence.AbstractDAO;
import au.com.project.sample.persistence.ContactNumberDAO;

/**
 *
 * @author SONY
 */
public class ContactNumberDAOImpl extends AbstractDAO<ContactNumber> implements ContactNumberDAO {

	private SessionFactory sessionFactory;

	@Override
	public  SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	@Override
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

    public ContactNumberDAOImpl() {
        super(ContactNumber.class);
    }

    public void createContactNumber(ContactNumber contactNumber) {
        saveOrUpdate(contactNumber);
    }

    public void updateContactNumber(ContactNumber contactNumber) {
        //update(contactNumber);
    }

    public void deleteContactNumber(ContactNumber contactNumber) {
        //delete(contactNumber);
    }

    public ContactNumber findContactNumber(Object id) {
        return null;//find(id);
    }

    public List<ContactNumber> findAllContactNumber() {
        return null;//findAll();
    }

    public List<ContactNumber> findRangeContactNumber(int[] range) {
        return null;//findRange(range);
    }

    public int countContactNumber() {
        return 0;//count();
    }

}
