package services;

public class Telusko 
{
	private ICourse course;
	
	public Telusko(ICourse course) 
	{
		this.course = course;		
	}
	public Telusko()
	{
		
	}
	
	public void setCourse(ICourse course) //ICourse course = new Java(); 
	{
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
