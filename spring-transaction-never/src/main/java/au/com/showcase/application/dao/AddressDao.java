package au.com.showcase.application.dao;

import au.com.showcase.application.model.Address;

public interface AddressDao {
	
	void save(Address stock);
	
	void update(Address stock);
	
	void delete(Address stock);
	
	Address findByStockCode(String stockCode);

}
