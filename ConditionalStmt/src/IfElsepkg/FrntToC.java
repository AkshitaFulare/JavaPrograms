
package IfElsepkg;

import java.util.Scanner;
public class FrntToC {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Fahrenheit To Celcius");
        System.out.println("2.Celcius To Fahrenheit");
        System.out.println("Enter yoour choice");
        int ch = sc.nextInt();
        float Fahrenheit;
        float c ;
        if(ch==1)
        {
            System.out.println("Enter temperature in F");
            Fahrenheit = sc.nextFloat();
            c= ((Fahrenheit-32)*5)/9;
            System.out.println("Temperature in celcius = " +c+" C");
        }
        else 
        {
            System.out.println("Enter temperature in c");
            c = sc.nextFloat();
            Fahrenheit = ((c * 9)/5)+32;
            System.out.println("Temperature in celcius = " +Fahrenheit+" F");
        }    
    
    }
}
