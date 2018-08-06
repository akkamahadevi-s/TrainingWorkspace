package com.training.aop.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.trining.aop.service.BankingService;

public class Client {
	public static void main(String[] args) {
		ApplicationContext context  = new ClassPathXmlApplicationContext("aspect-context.xml");
		
		BankingService service = (BankingService)context.getBean("banking",BankingService.class);
		System.out.println(service.getCaAccount().showBalance());
		System.out.println(service.getSbAccount().getAcc());
		
		String retVal= service.setAndGet("Harry");
		System.out.println("Return Val in Main"+retVal);
	}
}