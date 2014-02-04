package au.com.showcase.application.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import au.com.showcase.application.dao.AddressDao;
import au.com.showcase.application.model.Address;
import au.com.showcase.application.model.Stock;
import au.com.showcase.application.util.CustomHibernateDaoSupport;

@Repository("addressDao")
public class AddressDaoImpl extends CustomHibernateDaoSupport implements
		AddressDao {

	public void save(Address stock) {
		getHibernateTemplate().save(stock);
	}

	public void update(Address stock) {
		getHibernateTemplate().update(stock);
	}

	public void delete(Address stock) {
		getHibernateTemplate().delete(stock);
	}

	public Address findByStockCode(String stockCode) {
		List list = getHibernateTemplate().find(
				"from Address where stockCode=?", stockCode);
		return (Address) list.get(0);
	}

}