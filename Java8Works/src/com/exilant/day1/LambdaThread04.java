package com.exilant.day1;

public class LambdaThread04 {

	public static void main(String[] args) {
		new Thread(new Runnable(){
			
			public void run() {
				System.out.println("Hi i am from ananymous call.. start");
				try {
					Thread.sleep(1000);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Anonymous call exiting");
			}
		}).start();
		
		
		//////////////Lambda based/////
		new Thread(()->
		{
			System.out.println("Hi, i am from lambda");
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Lambda Call exiting");
		}).start();
		
	}

}
