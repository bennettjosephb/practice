package au.com.showcase.application;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 * 
 */
public class App {
	private static final Logger slf4jLogger = LoggerFactory
			.getLogger(App.class);

	public static void main(String[] args) {
		slf4jLogger.trace("Hello World!");

		String name = "Abhijit";
		slf4jLogger.debug("Hi, {}", name);
		slf4jLogger.info("Welcome to the HelloWorld example of Logback.");
		slf4jLogger.warn("Dummy warning message.");
		slf4jLogger.error("Dummy error message.");
	}
}
