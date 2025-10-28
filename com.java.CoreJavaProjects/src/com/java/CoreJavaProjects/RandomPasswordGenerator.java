package com.java.CoreJavaProjects;

import java.security.SecureRandom;
import java.util.Scanner;

class PasswordGenerator
{
	Scanner sc= new Scanner(System.in);
	public final static String character="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_=+<>?";
	public final static int Password_Length=12;
	
	public static String generatePassword()
	{
		SecureRandom random =new SecureRandom();
		StringBuilder builder= new StringBuilder();
		for(int i=0; i<Password_Length;i++)
		{
			int index =random.nextInt(character.length());
			builder.append(character.charAt(index));
			
		}
		return builder.toString();
	}
}
public class RandomPasswordGenerator 
{
	public static void main(String[] args) 
	{
		String str=PasswordGenerator.generatePassword();
		System.out.println(str);
	}

}

