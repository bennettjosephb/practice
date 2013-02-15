/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.persistence;

import au.com.project.sample.domain.Person;
import java.util.List;

/**
 *
 * author SONY
 */

public interface PersonDAO {

    void createPerson(Person person);

    void editPerson(Person person);

    void removePerson(Person person);

    Person findPerson(Object id);

    List<Person> findAllPerson();

    List<Person> findRangePerson(int[] range);

    int countPerson();

}
