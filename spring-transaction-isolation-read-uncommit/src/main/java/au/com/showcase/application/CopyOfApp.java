package au.com.showcase.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import au.com.showcase.application.bo.StockBo;
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

		UserProfile userProfile = (UserProfile) appContext
				.getBean("userProfile");

		System.out.println(userProfile.findByCustomerMobile("20340324803210"));

		System.out.println("Done");
	}
}
