package StaticFunc;

public class Testing {
	
 public static void TestMethod()
 {
	 System.out.println("This is an static method ");
 }
 public void TestMethod2()
 {
	 System.out.println("This is a non static method ");
 }
 //Static method overloading
 public static int cal(int x ,int y)
 {
	return x*y; 
 }
 public static double cal(double x ,double y)
 {
	return x*y; 
 }
 public static float cal(float x, float y)
 {
	 return x*y;
 }
 public static int cal(int x)
 {
	 return x;
 }
}
