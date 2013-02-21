package au.com.project.sample.persistence.impl.jpa;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Ignore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.transaction.TransactionConfiguration;

@Ignore
@ContextConfiguration(locations = "/META-INF/dao-test.xml")
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)
public class BaseTest extends AbstractTransactionalJUnit4SpringContextTests {

	@Autowired
	SessionFactory sessionFactory;

	protected void flush() {
		this.sessionFactory.getCurrentSession().flush();
	}

	protected Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

}
