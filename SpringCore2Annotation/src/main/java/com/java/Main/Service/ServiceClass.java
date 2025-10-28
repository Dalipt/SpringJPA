package com.java.Main.Service;

import org.springframework.stereotype.Service;

@Service   //Internally Spring create Camle case of class serviceClass
public class ServiceClass
{
	public ServiceClass()
	{
		System.out.println("Service Class Bean");
	}
}
