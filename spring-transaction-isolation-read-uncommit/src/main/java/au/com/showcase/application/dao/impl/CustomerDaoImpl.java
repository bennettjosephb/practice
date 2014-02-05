package au.com.showcase.application.dao.impl;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import au.com.showcase.application.dao.CustomerDao;
import au.com.showcase.application.model.Customer;
import au.com.showcase.application.model.IDProof;
import au.com.showcase.application.util.CustomHibernateDaoSupport;

@Repository("userProfileDao")
public class CustomerDaoImpl extends CustomHibernateDaoSupport implements
		CustomerDao {

	public Long save(Customer stock) {
		Session session = getHibernateTemplate().getSessionFactory()
				.openSession();
		session.saveOrUpdate(stock);

		try {
			System.out.println("WAITING WAITING WAITING....");
			Thread.sleep(20000);
		} catch (Exception e) {

		}

		session.close();
		return (Long) 1l;
	}

	public void update(Customer stock) {
		getHibernateTemplate().update(stock);
	}

	public void delete(Customer stock) {

		System.out.println("HAI");
		for (IDProof idProof : stock.getIdProof()) {
			System.out.println("HAI");
			getHibernateTemplate().delete(idProof);
		}

		getHibernateTemplate().delete(stock);
	}

	@Transactional(isolation = Isolation.READ_UNCOMMITTED)
	public Customer findByCustomerMobile(String stockCode) {
		List<Customer> list = (List<Customer>) getHibernateTemplate().find(
				"from Customer where mobileNumber=?", stockCode);

		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			Customer customer = (Customer) iterator.next();
			System.out.println(customer);
			System.out.println("=================");
		}
		return list.get(0);
	}

}