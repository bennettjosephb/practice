/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.process.impl;

import au.com.project.sample.domain.Person;
import au.com.project.sample.process.PersonController;
import java.util.List;

/**
 *
 * @author SONY
 */
public class PersonControllerImpl implements  PersonController{

    public void createPerson(Person person){}

    public void editPerson(Person person){}

    public void removePerson(Person person){}

    public Person findPerson(Object id){return null;}

    public List<Person> findAllPerson(){return null;}

    public List<Person> findRangePerson(int[] range){return null;}

    public int countPerson(){return 0;}
    
}
