package com.globallogic.spring_core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeDIDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		//Constructor Injection
		System.out.println("CONSTRUCTOR INJECTION");
		Employee emp = (Employee) context.getBean("employeeDemo");
		System.out.println(emp);
		System.out.println();
		
		//Bean Injection
		System.out.println("BEAN INJECTION");
		Employee emp1 = (Employee)context.getBean("beanDemo");
		System.out.println(emp1);
		System.out.println();
		
		//Constructor Collection Injection
		System.out.println("CONSTRUCTOR COLLECTION INJECTION");
		Employee emp2 = (Employee)context.getBean("employeeCollectionDemo");
		System.out.println(emp2);
		System.out.println();
		
		//Bean Collection Injection
		System.out.println("BEAN COLLECTION INJECTION");
		Employee emp3 = (Employee)context.getBean("beanCollectionDemo");
		System.out.println(emp3);
		System.out.println();
	}

}
