package multiLevelInheritance;

public class PartTime {
	
	private int noOfHours;
	private long hourlyRate;
	
	PartTime()
	{
		
	}
	PartTime(int noOfHours)
	{
		this.noOfHours = noOfHours;
	}
	PartTime(int noOfHours,long hourlyRate)
	{
		this.noOfHours =noOfHours;
		this.hourlyRate = hourlyRate;
	}
	private void setNoOfHours(int noOfHours)
	{
		this.noOfHours = noOfHours;
	}
	private void setHourlyRate(long hourlyRate)
	{
		this.hourlyRate = hourlyRate;
	}
	private int getNoOfHours()
	{
		return noOfHours;
	}
	private long getHourlyRate()
	{
		return hourlyRate;
	}
	
}
