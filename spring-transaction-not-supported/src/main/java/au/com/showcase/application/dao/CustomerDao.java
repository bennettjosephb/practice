package au.com.showcase.application.dao;

import au.com.showcase.application.model.Customer;

public interface CustomerDao {

	Long save(Customer customer);

	void update(Customer customer);

	void delete(Customer customer);

	Customer findByCustomerMobile(String stockCode);

}
