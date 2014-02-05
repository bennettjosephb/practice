package au.com.showcase.application.bo.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import au.com.showcase.application.bo.StockBo;
import au.com.showcase.application.dao.StockDao;
import au.com.showcase.application.model.Stock;

@Service("stockBo")
public class StockBoImpl implements StockBo {

	@Autowired
	StockDao stockDao;

	public void setStockDao(StockDao stockDao) {
		this.stockDao = stockDao;
	}

	@Transactional(readOnly = false)
	public void save(Stock stock) {
		stockDao.save(stock);
	}

	public void update(Stock stock) {
		stockDao.update(stock);
	}

	public void delete(Stock stock) {
		stockDao.delete(stock);
	}

	public Stock findByStockCode(String stockCode) {
		return stockDao.findByStockCode(stockCode);
	}
}
