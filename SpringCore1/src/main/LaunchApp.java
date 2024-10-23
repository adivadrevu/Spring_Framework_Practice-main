package main;

import services.Java;
import services.SpringBoot;
import services.Telusko;

public class LaunchApp 
{

	public static void main(String [] args) 
	{
		Telusko t = new Telusko(new Java()); // Target class -> which ever class is using services of other class 
		
//		Java j = new Java();
//		t.setCourse(j);
		//setter Injection
//		t.setCourse(new Java()); // Dependency Injection -> Injecting dependent object into target object
//		t.setCourse(new SpringBoot());
		
		
		Boolean status = t.buyTheCourse(4545.5);
		if(status) 
		{	
			System.out.println("Course enrolled successfully");
		}
		else
		{
			System.out.println("Course purchased failed");
		}
	}

}
