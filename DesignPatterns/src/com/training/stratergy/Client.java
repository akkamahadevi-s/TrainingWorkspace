package com.training.stratergy;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Client {

	public static void main(String[] args) {
	
		ShoppingCart cart = new ShoppingCart();
		
		/*cart.addItem(new Item("ITM101",30,4));
		cart.addItem(new Item("ITM102",2000,2));
		cart.addItem(new Item("ITM103",100,5));
		
		
		System.out.println("Total Amount" +cart.calculateTotal());
		Payment paymentStratergy = new EWallet("akkamahadevi@gmail.com","adsasd","CCAvenue");
		cart.checkOut(paymentStratergy);*/
		
		//method which take list of items
				List<Item> items = Stream.of(
						new Item("ITM101",30,4),
						new Item("ITM101",30,4),
						new Item("ITM101",30,4)
						).collect(Collectors.toList());
				
				ShoppingCart cart2 = new ShoppingCart();
				cart2.addItems(items);
				System.out.println("Total Amount" +cart2.calculateTotal());
				Payment paymentStratergy = new EWallet("akkamahadevi@gmail.com","adsasd","CCAvenue");
				cart2.checkOut(paymentStratergy);
				
				/*for(Item item:items) {
					System.out.println("Total Amount" +cart.calculateTotal());
					Payment paymentStratergy = new EWallet("akkamahadevi@gmail.com","adsasd","CCAvenue");
					cart.checkOut(paymentStratergy);
				}
		*/
				

	}

}
