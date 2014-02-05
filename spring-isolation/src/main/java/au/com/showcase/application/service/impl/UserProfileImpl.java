package au.com.showcase.application.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import au.com.showcase.application.dao.AddressDao;
import au.com.showcase.application.dao.CustomerDao;
import au.com.showcase.application.dao.IDProofDao;
import au.com.showcase.application.model.Address;
import au.com.showcase.application.model.Customer;
import au.com.showcase.application.model.IDProof;
import au.com.showcase.application.service.UserProfile;

@Service("userProfile")
public class UserProfileImpl implements UserProfile {

	@Autowired
	CustomerDao customerDao;

	@Autowired
	AddressDao addressDao;

	@Autowired
	IDProofDao idProofDao;

	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}

	public void setAddressDao(AddressDao addressDao) {
		this.addressDao = addressDao;
	}

	public void setIDProofDao(IDProofDao idProofDao) {
		this.idProofDao = idProofDao;
	}

	public Long save(Customer customer) {
		return customerDao.save(customer);
	}

	public void save(IDProof idProof) {
		idProofDao.save(idProof);
	}

	public void save(Address address) {
		addressDao.save(address);
	}

	public void update(Customer customer) {
		customerDao.update(customer);
	}

	public void delete(Customer customer) {
		customerDao.delete(customer);
	}

	public Customer findByCustomerMobile(String customerMobile) {
		return customerDao.findByCustomerMobile(customerMobile);
	}

	@Transactional
	public void save(Customer customer, IDProof idProof) {
		customerDao.save(customer);

		// List<IDProof> list = new ArrayList<IDProof>();
		//
		// list.add(idProof);
		//
		// customer.setIdProof(list);

		idProof.setCustomer(customer);
		idProofDao.save(idProof);
		// idProofDao.save(null); // FOR GENERATING EXCEPTION

	}
}
