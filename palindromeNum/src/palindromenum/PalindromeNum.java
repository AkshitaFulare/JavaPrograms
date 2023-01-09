/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package palindromenum;

/**
 *
 * @author 91992
 */
public class PalindromeNum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int reverse=0,num=500,rem,n;
        for(int i=0;i<=num;i++)
        {
            n=i;
            reverse=0;
            while(n!=0)
            {
                rem=n%10;
                reverse=reverse*10+rem;
                n=n/10;
            }
            //printf("%d",reverse);
            if(i==reverse)
            {
                System.out.println(+i + "\n");
                
            }

        }   
    }
    
}
