package Circle;

	import java.lang.Math;
	public class Point {
	 
		private double xCoordinate;
		private double yCoordinate;
		
		Point() {
			xCoordinate = 0;
			yCoordinate = 0;
		}
		Point(double xCoordinate , double yCoordinate)
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
}
