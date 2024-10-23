package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LaunchApp1 {

	public static void main(String[] args) 
	{
	
		ApplicationContext container = new ClassPathXmlApplicationContext("applicationconfig.xml");

	
//		Telusko t = container.getBean(Telusko.class);
//		
//		Boolean status = t.buyTheCourse(4545.5);		
//		if(status) 
//		{	
//			System.out.println("Course enrolled successfully");
//		}
//		else
//		{
//			System.out.println("Course purchased failed");
//		}
	}

}
