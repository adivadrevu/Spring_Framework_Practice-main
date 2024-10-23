package service;

public class Java implements ICourse 
{
	public Java() {
		System.out.println("JAVA Bean created");
	}

	@Override
	public Boolean getTheCourse(Double amount) 
	{
		System.out.println("JAVA course purchased successfully " + amount);
		return true;
	}

}
