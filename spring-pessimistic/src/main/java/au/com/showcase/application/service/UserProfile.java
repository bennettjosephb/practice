package au.com.showcase.application.service;

import au.com.showcase.application.model.Address;
import au.com.showcase.application.model.Customer;
import au.com.showcase.application.model.IDProof;

public interface UserProfile {

	Long save(Customer customer);

	void save(Customer customer, IDProof idProof);

	void save(Address address);

	void save(IDProof idProof);

	void update(Customer customer);

	void delete(Customer customer);

	Customer findByCustomerMobile(String customerId);

}
