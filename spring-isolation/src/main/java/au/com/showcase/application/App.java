package au.com.showcase.application;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import au.com.showcase.application.bo.StockBo;
import au.com.showcase.application.model.Customer;
import au.com.showcase.application.model.Gender;
import au.com.showcase.application.model.IDProof;
import au.com.showcase.application.model.Stock;
import au.com.showcase.application.service.UserProfile;

/**
 * Hello world!
 * 
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext(
				"spring/config/BeanLocations.xml");

		StockBo stockBo = (StockBo) appContext.getBean("stockBo");
		UserProfile userProfile = (UserProfile) appContext
				.getBean("userProfile");

		Customer customer = new Customer();

		// customer.setAddress(address);

		customer.setDob(Calendar.getInstance());
		customer.setEmailId("hai@gmail.com");
		customer.setFirstName("Bennet");
		customer.setLastName("Xavier");
		customer.setGender(Gender.MALE);
		customer.setMobileNumber("20340324803210");
		customer.setPhoneNumber("203403248032");
		customer.setNationality("INININ");
		customer.setName("Summa1");
		customer.setValue("Value1");
		customer.setCreatedDate(Calendar.getInstance());
		customer.setCreatedTime(Calendar.getInstance());
		// customer.setIdProof(idProof);

		// Long longId = userProfile.save(customer);

		System.out.println(customer.getId());

		IDProof idProof = new IDProof();
		idProof.setCustomer(customer);

		List<IDProof> list = new ArrayList<IDProof>();

		list.add(idProof);

		customer.setIdProof(list);

		idProof.setName("PASSPORT");

		userProfile.save(customer);

		//userProfile.delete(customer);

		customer = userProfile.findByCustomerMobile("20340324803210");

		System.out.println(customer.getIdProof().size());

		for (Iterator iterator = customer.getIdProof().iterator(); iterator
				.hasNext();) {
			IDProof type = (IDProof) iterator.next();
			System.out.println(type.getName());

		}

		// /** insert **/
		// Stock stock = new Stock();
		// stock.setStockCode("7668");
		//
		// stock.setStockName("HAIO");
		// stockBo.save(stock);
		//
		// /** select **/
		// Stock stock2 = stockBo.findByStockCode("7668");
		// System.out.println(stock2);
		//
		// /** update **/
		// stock2.setStockName("HAIO-1");
		// // stockBo.update(stock2);
		//
		// /** delete **/
		// // stockBo.delete(stock2);

		System.out.println("Done");
	}
}
