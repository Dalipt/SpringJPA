package com.java.MySpringProject.SpringBoot1.Services;

import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class GenerateGreeting implements Igreeting 
{
	public GenerateGreeting()
	{
		System.out.println("GenerateGreeting Bean");
	}
	@Autowired
	private LocalTime time;
	@Override
	public String generateWish(String name)
	{
		int hour=time.getHour();
		int minutes=time.getMinute();
		if(hour<12)
			return "Good Morning:"+"Hour:"+hour+":"+"Minutes:"+minutes;
		else if(hour<16)
			return"Good Afternoon:"+hour+minutes;
		else if(hour<20)
			return"Good Evening:"+hour+minutes;
		else
			return"Good Night:"+ hour+ minutes;
	
	}

}
