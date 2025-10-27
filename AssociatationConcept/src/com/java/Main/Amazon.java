package com.java.Main;

import com.java.Services.DTDC;
import com.java.Services.IdeliveryServices;

public class Amazon 
{
	private IdeliveryServices service;
	
	public void setService(IdeliveryServices service)
	{
		this.service= service;
	}
	public Amazon(IdeliveryServices service)
	{
		this.service=service;
	}
	
	public Boolean deliverProduct(Double amount)
	{
		return service.deliverProduct(amount);	
	}
	public void setDelivery(IdeliveryServices service)
	{
		this.service=service;
	}

}
