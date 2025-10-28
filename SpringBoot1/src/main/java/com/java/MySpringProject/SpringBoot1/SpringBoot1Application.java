package com.java.MySpringProject.SpringBoot1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.java.MySpringProject.SpringBoot1.Services.GenerateGreeting;

@SpringBootApplication
public class SpringBoot1Application 
{

	public static void main(String[] args) 
	{
		 ConfigurableApplicationContext container = SpringApplication.run(SpringBoot1Application.class, args);
		 GenerateGreeting great = container.getBean(GenerateGreeting.class);
		 String status= great.generateWish("Haider ABBas");
		 System.out.println(status);
		 
	}

}
