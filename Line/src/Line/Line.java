package Line;

public class Line {
	private Point p1;
	private Point p2;
 
	Line()
	{}
	Line(Point p1)
	{
		this.p1 = p1;
	}
	Line(Point p1, Point p2)
	{
		this.p1 = p1;
		this.p2 = p2;
	}
	public void setPoint1(Point p1)
	{
		this.p1 = p1;
	}
	public void setPoint2(Point p2)
	{
		this.p2 = p2;
	}
	public Point getPoint1()
	{
		return p1;
	}
	public Point getPoint2()
	{
		return p2;
	}
	public Point getMidPoint()
	{
		return midpoint;
	}
	public double getLength()
	{
		
	}
	public double getDistanceFromMid(Point p)
	{
		
	}
	public double getslope()
	{
		
	}
	public boolean isParallel(line l)
	{
		
	}
	public boolean isTochingXAxis()
	{
		
	}
	public boolean isTochingYAxis()
	{
		
	}
	public boolean isOnLine(Point p)
	{
		
	}
	public boolean isOnLine(double x,double y)
	{
		
	}
}
