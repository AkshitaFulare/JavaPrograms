package clock;

import java.lang.String;
public class Clock {
	private int hours;
	private int minutes;
	private int second;
	private String meridian;
    public boolean setTime(int hours, int minutes, int second)
    {
    	if(hours>23 || hours <0 || minutes > 59 || minutes < 0 || second >59 || second < 0)
    	{
    		return false;
    	}
    	else
    	{
	        if(hours > 12)
	    	{
	    		this.hours = hours -12;
	    		this.meridian = "PM";
	    	}
	    	else if(hours == 12)
	    	{
	    		this.hours = hours ;
	    		this.meridian = "PM";
	    	}
	    	else if(hours == 0)
	    	{
	    		this.hours = 12;
	    		this.meridian = "AM";
	    	}
	    	else 
	    	{
	    		this.hours = hours ;
	    		this.meridian = "AM";
	    	}
	    	this.minutes = minutes;
	    	this.second = second;
	    	return true;
    	}
    }
    public void printTime()
    {
    	System.out.println(+hours+":"+minutes+":"+second+":"+meridian);
    }
}
