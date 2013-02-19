package au.com.project.sample.common;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import au.com.project.sample.domain.Country;
import au.com.project.sample.domain.Currency;
import au.com.project.sample.persistence.CountryDAO;
import au.com.project.sample.persistence.CurrencyDAO;
import au.com.project.sample.persistence.impl.jpa.CountryDAOImpl;
import au.com.project.sample.persistence.impl.jpa.CurrencyDAOImpl;

public class SetUp implements ServletContextListener {

	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub

	}
	
	public static void main(String args[]){
		new SetUp().contextInitialized(null);
	}

	public void contextInitialized(ServletContextEvent arg0) {
		
		try {
			InputStream in = Class.class
					.getResourceAsStream("/au/com/project/sample/common/Country.txt");

			BufferedReader br = new BufferedReader(new InputStreamReader(in, "UTF-8"));

			String line = null;
			CountryDAO countryDAO = new CountryDAOImpl();

			while ((line = br.readLine()) != null) {
				String str[] = line.split("[,]");
				Country country = new Country();
				country.setCode(str[0].trim());
				country.setName(str[1].trim());
				countryDAO.createCountry(country);
			}
			
			in = Class.class
					.getResourceAsStream("/au/com/project/sample/common/Currency.txt");

			br = new BufferedReader(new InputStreamReader(in, "UTF-8"));

			CurrencyDAO currencyDAO = new CurrencyDAOImpl();
 
			while ((line = br.readLine()) != null) {
				String str[] = line.split("[,]");
				Currency currency = new Currency();
				currency.setCode(str[0].trim());
				currency.setName(str[1].trim());
				currencyDAO.createCurrency(currency);
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
