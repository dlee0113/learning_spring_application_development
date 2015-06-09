package org.packt.Spring.chapter2.callbacks;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * 
 * @author RaviKantSoni
 * 
 */
public class EmployeeServiceImp implements EmployeeService, InitializingBean,
		DisposableBean {

	public Long generateEployeeID() {

		return System.currentTimeMillis();

	}

	public void destroy() throws Exception {
		
		System.out.println("Employee destroy... ");

	}

	public void afterPropertiesSet() throws Exception {
		
		System.out.println("Employee afterPropertiesSet... ");

	}

}
