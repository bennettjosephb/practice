package au.com.showcase.application;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Employee implements BeanNameAware, BeanFactoryAware,
		ApplicationContextAware, InitializingBean, DisposableBean {

	public Employee() {

		System.out.println("constructor");
	}

	private Name name;

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	private Long id;

	private String position;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	@Override
	public String toString() {
		return "id " + id + " and position " + position;
	}

	public void initIt() throws Exception {
		System.out.println("Init method after properties are set : " + id
				+ "position");
	}

	public void cleanUp() throws Exception {
		System.out.println("Spring Clean Up! Employee is cleaned up now.");
	}

	public void setApplicationContext(ApplicationContext arg0)
			throws BeansException {
		System.out.println("ApplicationContext " + arg0);
	}

	public void setBeanFactory(BeanFactory arg0) throws BeansException {
		System.out.println("BeanFactory " + arg0);
	}

	public void setBeanName(String arg0) {
		System.out.println("BeanName " + arg0);
	}

	public void destroy() throws Exception {
		System.out.println("DESTORY METHOD");
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("AfterPropertiesSet METHOD");
	}

}