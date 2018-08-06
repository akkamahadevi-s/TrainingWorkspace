package com.exilant.day1;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class LambdaThreadService06 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		
		executorService.execute(new Runnable() {
			public void run() {
				System.out.println("Hi i am anonymous block");
			}
		  });
		executorService.shutdown();
		
		//java 8 way
		ExecutorService executorService1 =Executors.newSingleThreadExecutor();
		executorService1.execute(()->{
			System.out.println("Hi i am lambda block");
		});
		executorService1.shutdown();
		
		System.out.println("---------callables work------");
		ExecutorService executorService2 = Executors.newSingleThreadExecutor();
		Set<Callable<String>> callables = initializeCallables();
		//String result = executorService2.invokeAny(callables);
		//System.out.println("Result:"+result);
		List<Future<String>> results = executorService2.invokeAll(callables);
		
		for(Future temp:results) {
		System.out.println(temp.get());
		}
		executorService2.shutdown();
	}
	//this method will create set of callables(each callable is one thread)
	
	public static Set<Callable<String>> initializeCallables(){
		Set<Callable<String>> callables= new HashSet<Callable<String>>();
		callables.add(()-> "1st Callable");
		callables.add(()-> "2nd Callable");
		callables.add(()-> "3rd Callable");
		callables.add(()-> "4th Callable");
		callables.add(()-> "5th Callable");
		callables.add(()-> "6th Callable");
		
		callables.add(new Callable<String>() {
			public String call() throws Exception{
				return "Callable thread in anonymous class";
			}
		});	
		callables.add(()-> { return "complex called business logic";});
		return callables;
		
	}
	

}
