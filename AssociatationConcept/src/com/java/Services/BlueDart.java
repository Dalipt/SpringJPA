package com.java.Services;

public class BlueDart implements IdeliveryServices {

	@Override
	public Boolean deliverProduct(double amount)
	{
		System.out.println("Product is delivered by BlueDart and amount paid:"+ amount);
		return true;
	}

}
