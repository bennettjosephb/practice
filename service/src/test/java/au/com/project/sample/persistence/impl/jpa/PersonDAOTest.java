package au.com.project.sample.persistence.impl.jpa;

import static org.junit.Assert.assertEquals;

import java.util.Calendar;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import au.com.project.sample.domain.Gender;
import au.com.project.sample.domain.Person;
import au.com.project.sample.persistence.PersonDAO;

public class PersonDAOTest extends BaseTest {

	@Autowired
	PersonDAO personDAO;

	@Test
	public void testPerson() {
		Person person = new Person();

		person.setFirstName("A");
		person.setLastName("B");
		person.setDateOfBirth(Calendar.getInstance());
		person.setGender(Gender.MALE);

		personDAO.createPerson(person);

		assertEquals(1l, personDAO.countPerson().longValue());

	}

	@Test
	public void testPerson1() {
		Person person = new Person();

		person.setFirstName("A");
		person.setLastName("B");
		person.setDateOfBirth(Calendar.getInstance());
		person.setGender(Gender.MALE);

		personDAO.createPerson(person);

		assertEquals(2l, personDAO.countPerson().longValue());

	}

	@Test
	public void testPerson2() {
		Person person = new Person();

		person.setFirstName("A");
		person.setLastName("B");
		person.setDateOfBirth(Calendar.getInstance());
		person.setGender(Gender.MALE);

		personDAO.createPerson(person);

		assertEquals(3l, personDAO.countPerson().longValue());

	}

	@Test
	public void testPerson3() {
		Person person = new Person();

		person.setFirstName("A");
		person.setLastName("B");
		person.setDateOfBirth(Calendar.getInstance());
		person.setGender(Gender.MALE);

		personDAO.createPerson(person);

		assertEquals(4l, personDAO.countPerson().longValue());

	}

	@Test
	public void testPerson4() {
		Person person = new Person();

		person.setFirstName("A");
		person.setLastName("B");
		person.setDateOfBirth(Calendar.getInstance());
		person.setGender(Gender.MALE);

		personDAO.createPerson(person);

		assertEquals(5l, personDAO.countPerson().longValue());

	}

	@Test
	public void testPerson5() {
		Person person = new Person();

		person.setFirstName("A");
		person.setLastName("B");
		person.setDateOfBirth(Calendar.getInstance());
		person.setGender(Gender.MALE);

		personDAO.createPerson(person);

		assertEquals(6l, personDAO.countPerson().longValue());

	}

}
