
 
package point;


import java.lang.Math;
public class Point {
 
	private double xCoordinate;
	private double yCoordinate;
	
	Point() {
		xCoordinate = 0;
		yCoordinate = 0;
	}
	Point(double xcoordinate , double ycoordinate)
	{
		this.xCoordinate = xCoordinate;
		this.yCoordinate = yCoordinate;
	}
	public void setxCoordinate(double xCoordinate)
	{
		this.xCoordinate = xCoordinate;
	}
	public void setyCoordinate(double yCoordinate)
	{
		this.yCoordinate = yCoordinate;
	}
    public void setCoordinate(double xCoordinate,double yCoordinate)
    {
    	this.xCoordinate = xCoordinate;
    	this.yCoordinate = yCoordinate;
    }
    public double getxCoordinate()
    {
    	return xCoordinate;
    }
    public double getyCoordinate()
    {
    	return yCoordinate;
    }
    public double findDistanceFrom(Point distantPoint)
	{
		return Math.sqrt(Math.pow((this.yCoordinate-distantPoint.yCoordinate), 2)+Math.pow((this.xCoordinate-distantPoint.xCoordinate), 2));
	}
	public double findDistanceFrom(double xCoordinate, double yCoordinate)
	{
		return Math.sqrt(Math.pow((this.yCoordinate-yCoordinate), 2)+Math.pow((this.xCoordinate-xCoordinate), 2));
	}
	public void moveLeftBy(double distance )
	{
		this.xCoordinate = this.xCoordinate - distance;
	}
	public void moveRightBy(double distance )
	{
		this.xCoordinate = this.xCoordinate + distance;
	}
	public void moveUpBy(double distance )
	{
		this.yCoordinate = this.yCoordinate + distance;
	}
	public void moveDownBy(double distance )
	{
		this.yCoordinate = this.yCoordinate - distance;
	}
}	
