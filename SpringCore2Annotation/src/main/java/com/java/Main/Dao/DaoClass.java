package com.java.Main.Dao;

import org.springframework.stereotype.Repository;

@Repository //Internally Spring create Camel case of class DaoClass
public class DaoClass
{
	public DaoClass()
	{
		System.out.println("Dao bean created");
	}
}
