package com.java.Main.Service;

public class Password
{
	String algo;
	public Password(String algo)
	{
		this.algo= algo;
		System.out.println("Password bean created");
	}
	public void algo()
	{
		System.out.println("The algo used for password"+ algo);
	}
}
