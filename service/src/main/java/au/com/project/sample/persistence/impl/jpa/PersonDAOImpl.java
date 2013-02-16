/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.persistence.impl.jpa;

import java.util.List;

import org.hibernate.SessionFactory;

import au.com.project.sample.domain.Person;
import au.com.project.sample.persistence.AbstractDAO;
import au.com.project.sample.persistence.PersonDAO;

/**
 *
 * @author SONY
 */
public class PersonDAOImpl extends AbstractDAO<Person> implements PersonDAO {
	private SessionFactory sessionFactory;

	@Override
	public  SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	@Override
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

    public PersonDAOImpl() {
        super(Person.class);
    }

    public void createPerson(Person person) {
        saveOrUpdate(person);
    }

    public void editPerson(Person person) {
        //edit(person);
    }

    public void removePerson(Person person) {
        //remove(person);
    }

    public Person findPerson(Object id) {
        return null;//find(id);
    }

    public List<Person> findAllPerson() {
        return null;//findAll();
    }

    public List<Person> findRangePerson(int[] range) {
        return null;//findRange(range);
    }

    public int countPerson() {
        return 0;//count();
    }

}