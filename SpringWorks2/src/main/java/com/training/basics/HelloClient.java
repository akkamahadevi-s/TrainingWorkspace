package com.training.basics;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class HelloClient {
	public static void main(String[] args) {
		/*XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("spring-context.xml")); 
		HelloService serivce = (HelloService) factory.getBean("defaultHello"); 
	
		System.out.println(serivce.sayHello());
		*/
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml"); 

		HelloService serivce = (HelloService) context.getBean("defaultHello");
	
		System.out.println(serivce.sayHello());
		
		
		
	}

}
