package service;

public class SpringBoot implements ICourse 
{
	
	public SpringBoot()
	{
		System.out.println("SPRINGBOOT Bean created");
	}

	@Override
	public Boolean getTheCourse(Double amount) {
		System.out.println("SPRINGBOOT course purchased successfully " + amount);
		return true;
	}

}
