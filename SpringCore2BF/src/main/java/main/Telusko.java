package main;

import service.ICourse;

public class Telusko 
{
	private ICourse course;
	
	public Telusko(ICourse course) 
	{
		System.out.println("Constructor Injection");
		this.course = course;		
	}
	public Telusko()
	{
		super();
		System.out.println("Telusko Bean created");
	}
	
	public void setCourse(ICourse course) //ICourse course = new Java(); 
	{
		System.out.println("Setter Injection");
		this.course = course;
	}

	public Boolean buyTheCourse(Double amount)
	{
//		Java j = new Java();
//		Boolean status = j.getTheCourse(4545.5);
//		return status;
//		return j.getTheCourse(amount);
		return course.getTheCourse(amount);
//		return new Java().getTheCourse(amount);
	}

}
