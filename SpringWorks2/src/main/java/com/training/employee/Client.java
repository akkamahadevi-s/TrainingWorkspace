package com.training.employee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.basics.HelloService;

public class Client {

	public static void main(String[] args) {
		//ApplicationContext context = new ClassPathXmlApplicationContext("spring-context2.xml");
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml","spring-context2.xml");
		
		Employee emp = context.getBean("employee",Employee.class);
		
		System.out.println("Emp Id"+ emp.getEmpId());
		System.out.println("Emp Name"+ emp.getEmpName());
		System.out.println("Emp Sal"+ emp.getEmpSal());
		
		System.out.println("------------------------");
		
		HelloService service = (HelloService)context.getBean("defaultHello");
		
			context.registerShutdownHook();
		
	}

}
