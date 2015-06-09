package org.packt.Spring.chapter2.callbacks.xml;

/**
 * 
 * @author RaviKantSoni
 * 
 */
public class NewEmployeeServiceImp implements EmployeeService {

	public Long generateEployeeID() {

		return System.currentTimeMillis();

	}

	public void cleanUp() {

		System.out.println("New Employee Cleanup... ");

	}

	public void myInit() {

		System.out.println("New Employee My Init... ");

	}

}
