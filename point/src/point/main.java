package point;
import java.lang.String;
public class main {

	public static void main(String[] args) {
		Point p1;
		p1 = new Point(5,12);
		Point p2 = new Point();
		p1.moveDownBy(5);
		p1.setCoordinate(2, 2);
		System.out.println("The point p1 is : ("+p1.getxCoordinate()+", "+p1.getyCoordinate()+")");
		System.out.println("The distance of p1 from (5,12) is : "+p1.findDistanceFrom(p2));
	}

}
