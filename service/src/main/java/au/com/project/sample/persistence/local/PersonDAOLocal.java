/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.persistence.local;

import au.com.project.sample.domain.Person;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author SONY
 */
@Local
public interface PersonDAOLocal {

    void createPerson(Person person);

    void editPerson(Person person);

    void removePerson(Person person);

    Person findPerson(Object id);

    List<Person> findAllPerson();

    List<Person> findRangePerson(int[] range);

    int countPerson();
    
}
