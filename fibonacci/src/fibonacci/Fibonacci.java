/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fibonacci;

/**
 *
 * @author 91992
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int term1=0;
        int term2=1;
        //int nxt_term;
        int n=10;
        System.out.println(+term1);
        System.out.println(+term2);
        int i=0;
        while(i<n)
        {
            int sum=0;
            sum=term1 + term2;
            System.out.println(+sum);
            term1=term2;
            term2 = sum;
            i++;
        }    
    }
    
}
