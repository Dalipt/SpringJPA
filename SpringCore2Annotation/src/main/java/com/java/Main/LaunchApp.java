package com.java.Main;
//Based on Layer Beans are getting created
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.Main.Service.Password;

public class LaunchApp {

	public static void main(String[] args) 
	{
		
		ClassPathXmlApplicationContext apl= new ClassPathXmlApplicationContext("Annotation1.xml");
		Password ps=apl.getBean(Password.class);
		ps.algo();
	}

}
