package com.java.Services;

public class FirstFlight implements IdeliveryServices {

	@Override
	public Boolean deliverProduct(double amount)
	{
		System.out.println("Product is delivered by First flight amount paid is:"+ amount);
		return true;
	}

}
