package IfElsepkg;
import java.util.*;
public class Result {
  public static void main(String[] args) {
        
   
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your marks");
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        int total = m1+m2+m3;
        float per =  total/3;
        System.out.println(per);
        if(per>=33)
        {
            System.out.println("Pass");
        }
        else
        {
            System.out.println("Fail");
        }
    }
}

