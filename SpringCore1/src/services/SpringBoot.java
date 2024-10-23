package services;

public class SpringBoot implements ICourse 
{

	@Override
	public Boolean getTheCourse(Double amount) {

		System.out.println("SpringBoot course is purchased and Fees paid is " + amount);
		return true;
	}

	
}
