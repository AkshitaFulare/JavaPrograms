/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factorial;

/**
 *
 * @author 91992
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num=5;
        int num1=num;
        int fact=1;
        for(int i=0;i<num;i++)
        {
            fact*=num1;
            num--;
            
        }   
         System.out.println(+fact);
    }
    
}
