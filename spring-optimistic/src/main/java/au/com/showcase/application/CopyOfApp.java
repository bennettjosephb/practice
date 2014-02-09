package au.com.showcase.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import au.com.showcase.application.bo.StockBo;
import au.com.showcase.application.model.Customer;
import au.com.showcase.application.model.Stock;
import au.com.showcase.application.service.UserProfile;

/**
 * Hello world!
 * 
 */
public class CopyOfApp {
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext(
				"spring/config/BeanLocations.xml");

		StockBo stockBo = (StockBo) appContext.getBean("stockBo");
		UserProfile userProfile = (UserProfile) appContext
				.getBean("userProfile");

		Customer customer = new Customer();

		customer = userProfile.findByCustomerMobile("20340324803210");
		customer.setFirstName("MODIFED");

		try {
			Thread.sleep(10000);
		} catch (Exception e) {

		}

		userProfile.save(customer);

		/** insert **/
		Stock stock = new Stock();
		stock.setStockCode("7668");

		stock.setStockName("HAIO");
		stockBo.save(stock);

		/** select **/
		Stock stock2 = stockBo.findByStockCode("7668");
		System.out.println(stock2);

		/** update **/
		stock2.setStockName("HAIO-1");
		// stockBo.update(stock2);

		/** delete **/
		// stockBo.delete(stock2);

		System.out.println("Done");
	}
}
