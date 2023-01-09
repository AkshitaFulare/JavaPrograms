
package IfElseIf;

import java.util.Scanner;
public class Result1 {
     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your marks");
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        int total = m1+m2+m3;
        float per =  total/3;
        System.out.println(per);
        if(per>=75)
        {
            System.out.println('A');
        }
        else 
        {
            if(per< 75 && per>=50 )
            {
                System.out.println('B');
            }
            else 
            {
                if(per<49 && per>33)
                {
                    System.out.println('C');
                }
                else
                {
                    System.out.println('D');
                }
            }
        }
     }
}
