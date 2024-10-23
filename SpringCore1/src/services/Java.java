package services;

public class Java implements ICourse 
{

	@Override
	public Boolean getTheCourse(Double amount) 
	{
		System.out.println("JAVA course is purchased and Fees paid is " + amount);
		return true;
	}

}
