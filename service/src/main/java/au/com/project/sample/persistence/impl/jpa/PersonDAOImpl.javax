/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.persistence.impl.jpa;

import au.com.project.sample.persistence.local.PersonDAOLocal;
import au.com.project.sample.domain.Person;
import au.com.project.sample.persistence.AbstractDAO;
import au.com.project.sample.persistence.remote.PersonDAORemote;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author SONY
 */
@Stateless
public class PersonDAOImpl extends AbstractDAO<Person> implements PersonDAOLocal, PersonDAORemote {
    @PersistenceContext(unitName = "project")
    private EntityManager em;

    protected EntityManager getEntityManager() {
        return em;
    }

    public PersonDAOImpl() {
        super(Person.class);
    }

    public void createPerson(Person person) {
        create(person);
    }

    public void editPerson(Person person) {
        edit(person);
    }

    public void removePerson(Person person) {
        remove(person);
    }

    public Person findPerson(Object id) {
        return find(id);
    }

    public List<Person> findAllPerson() {
        return findAll();
    }

    public List<Person> findRangePerson(int[] range) {
        return findRange(range);
    }

    public int countPerson() {
        return count();
    }
    
}
