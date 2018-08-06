package com.training.stratergy;

public class EWallet implements Payment{
	
	private String email;
	private String password;
	private String walletName;

	public EWallet(String email, String password, String walletName) {
		super();
		this.email = email;
		this.password = password;
		this.walletName = walletName;
	}

	@Override
	public void pay(int amount) {
		if(walletName.equalsIgnoreCase("paytm")) {
			amount =(int) (amount-(amount*0.1));
			System.out.println("you are paying through paytm,and paid"+amount);
		}else {
			System.out.println("paid amount"+amount +"with wallet"+this.walletName);
		}
		
	}

}
