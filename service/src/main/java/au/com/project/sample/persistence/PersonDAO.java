/*
 * To change this template, choose Tools | Templates
 * and open the template in the updateor.
 */
package au.com.project.sample.persistence;

import au.com.project.sample.domain.Person;
import java.util.List;

/**
 *
 * author SONY
 */

public interface PersonDAO {

	Person createPerson(Person person);

    void updatePerson(Person person);

    void deletePerson(Person person);

    Person findPerson(Object id);

    List<Person> findAllPerson();

    List<Person> findRangePerson(int[] range);

    Long countPerson();

}
