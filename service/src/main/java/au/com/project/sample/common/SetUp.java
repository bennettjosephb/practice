package au.com.project.sample.common;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import au.com.project.sample.domain.Country;
import au.com.project.sample.persistence.CountryDAO;
import au.com.project.sample.persistence.impl.jpa.CountryDAOImpl;

public class SetUp implements ServletContextListener {

	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub

	}
	
	public static void main(String args[]){
		new SetUp().contextInitialized(null);
	}

	public void contextInitialized(ServletContextEvent arg0) {
		
		System.out.println("uyiyiuyuyoiuoiupoupo");
		System.out.println("uyiyiuyuyoiuoiupoupo");
		System.out.println("uyiyiuyuyoiuoiupoupo");
		System.out.println("uyiyiuyuyoiuoiupoupo");
		System.out.println("uyiyiuyuyoiuoiupoupo");
		System.out.println("uyiyiuyuyoiuoiupoupo");
		System.out.println("uyiyiuyuyoiuoiupoupo");
		System.out.println("uyiyiuyuyoiuoiupoupo");
		System.out.println("uyiyiuyuyoiuoiupoupo34567");
		
		try {
			System.out.println("uyiyiuyuyoiuoiupoupo1");
			InputStream in = Class.class
					.getResourceAsStream("/au/com/project/sample/common/Country.txt");

			System.out.println("uyiyiuyuyoiuoiupoupo2");
			BufferedReader br = new BufferedReader(new InputStreamReader(in, "UTF-8"));
			System.out.println("uyiyiuyuyoiuoiupoupo");

			String line = null;
			System.out.println("uyiyiuyuyoiuoiupoupo3");
			CountryDAO countryDAO = new CountryDAOImpl();
			System.out.println("uyiyiuyuyoiuoiupoupo4");
			while ((line = br.readLine()) != null) {
				String str[] = line.split("[,]");
				System.out.println(line);
				System.out.println(str[0] + ":" + str[1]);
				Country country = new Country();
				country.setCode(str[0].trim());
				country.setName(str[1].trim());
				countryDAO.createCountry(country);
			}
		} catch (IOException e) {
			System.out.println("uyiyiuyuyoiuoiupoupo");
			System.out.println("uyiyiuyuyoiuoiupoupo");
			System.out.println("uyiyiuyuyoiuoiupoupo");
			System.out.println("uyiyiuyuyoiuoiupoupo");
			System.out.println("uyiyiuyuyoiuoiupoupo");
			System.out.println("uyiyiuyuyoiuoiupoupo");
			System.out.println("uyiyiuyuyoiuoiupoupo");
			System.out.println("uyiyiuyuyoiuoiupoupo");
			System.out.println("uyiyiuyuyoiuoiupoupo");
			System.out.println("uyiyiuyuyoiuoiupoupo");
			System.out.println("uyiyiuyuyoiuoiupoupo");
			System.out.println("uyiyiuyuyoiuoiupoupo");
			System.out.println("uyiyiuyuyoiuoiupoupo");
			System.out.println("uyiyiuyuyoiuoiupoupo");
			System.out.println("uyiyiuyuyoiuoiupoupo");
			System.out.println("uyiyiuyuyoiuoiupoupo");
			System.out.println("uyiyiuyuyoiuoiupoupo");
			System.out.println("uyiyiuyuyoiuoiupoupo");
			System.out.println("uyiyiuyuyoiuoiupoupo");
			System.out.println("uyiyiuyuyoiuoiupoupo");
			e.printStackTrace();
		}

	}

}
