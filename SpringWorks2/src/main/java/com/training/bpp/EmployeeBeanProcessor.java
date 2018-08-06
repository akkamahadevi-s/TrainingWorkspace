package com.training.bpp;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import com.training.employee.Employee;

//if you want spring to know this is post processor
//implement BeanPostProcessor,this way every bean
//when create by spring has to go through this class

//since this class can handle any class/s all are given as object
public class EmployeeBeanProcessor implements BeanPostProcessor{

	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("---------------PostProcessBeforeInitialization------"+beanName);
		return bean;
	}

	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("---------------PostProcessAfterInitialization------"+beanName);
		
		//this is the place to mutate the class
		if(bean instanceof Employee) {
			Employee emp = (Employee)bean;
			
			emp.setEmpName(emp.getEmpName().toUpperCase());
			return emp;
		}
		
		return bean;
	}
	

}
