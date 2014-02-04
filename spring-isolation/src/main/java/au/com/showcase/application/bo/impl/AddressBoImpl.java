package au.com.showcase.application.bo.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import au.com.showcase.application.dao.AddressDao;
import au.com.showcase.application.model.Address;

@Service("addressBo")
public class AddressBoImpl /* implements AddressBo */{

	@Autowired
	AddressDao addressDao;

	public void setStockDao(AddressDao addressDao) {
		this.addressDao = addressDao;
	}

	public void save(Address Address) {
		addressDao.save(Address);
	}

	public void update(Address Address) {
		addressDao.update(Address);
	}

	public void delete(Address Address) {
		addressDao.delete(Address);
	}

	public Address findByStockCode(String stockCode) {
		return addressDao.findByStockCode(stockCode);
	}
}
