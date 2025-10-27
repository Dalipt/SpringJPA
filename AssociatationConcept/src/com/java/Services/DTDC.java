package com.java.Services;

public class DTDC implements IdeliveryServices {

	@Override
	public Boolean deliverProduct(double amount)
	{
		System.out.println("Product is delivered by DTDC amount paid is:"+ amount);
		return true;
	}

}
