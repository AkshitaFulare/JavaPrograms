/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

/**
 *
 * @author 91992
 */

// Program to find distance between two point
class Distance
{
    Point point1, point2;
    double distance;
    void find_distance()
    {
        int dx = point1.getX()-point2.getX();
        int dy = point1.getY()-point2.getY();
        distance = Math.sqrt(dx * dx + dy*dx);
    }
    void display_distance()
    {
 System.out.println ("Distance ="+distance );
    }  
}
public class Main
{
 public static void main(String args[])
 {
    Distance d= new Distance();
    d.point1 = new Point();
    d.point2 = new Point();
    d.point1.setPoint(10,20);
    d.point2.setPoint(50,68);
    d.find_distance();
    d.display_distance();
 }
}
class Point
{
    int x,y;
   void setPoint(int a, int b)
   {
    x = a; y = b;
   }
   int getX()
   {
       return x;
   }
   int getY()
   {
       return y;
   }
   
}