package com.java.Main;

import com.java.Services.BlueDart;
import com.java.Services.DTDC;

public class LaunchAmazon {

	public static void main(String[] args) 
	{
		Amazon amz= new Amazon(new DTDC());
		
		//amz.setDelivery(new DTDC());
		amz.setDelivery(new BlueDart());
		
		Boolean status=amz.deliverProduct(232.1);
		if(status==true)
		{
			System.out.println("Product delivered successful:");
		}
		else
		{
			System.out.println("Product delivery failed");
		}
	}

}
