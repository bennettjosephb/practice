/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.persistence.remote;

import au.com.project.sample.domain.Person;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author SONY
 */
@Remote
public interface PersonDAORemote {

    void createPerson(Person person);

    void editPerson(Person person);

    void removePerson(Person person);

    Person findPerson(Object id);

    List<Person> findAllPerson();

    List<Person> findRangePerson(int[] range);

    int countPerson();
    
}
