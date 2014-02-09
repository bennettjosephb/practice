package au.com.showcase.application.dao.impl;

import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Repository;

import au.com.showcase.application.dao.CustomerDao;
import au.com.showcase.application.model.Customer;
import au.com.showcase.application.model.IDProof;
import au.com.showcase.application.util.CustomHibernateDaoSupport;

@Repository("userProfileDao")
public class CustomerDaoImpl extends CustomHibernateDaoSupport implements
		CustomerDao {

	public Long save(Customer stock) {
		getHibernateTemplate().saveOrUpdate(stock);
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

	public Customer findByCustomerMobile(String stockCode) {
		List<Customer> list = (List<Customer>) getHibernateTemplate().find(
				"from Customer where mobileNumber=?", stockCode);

		System.out.println(list.get(0));
		return list.get(0);
	}

}