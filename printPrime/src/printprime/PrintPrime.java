/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package printprime;

/**
 *
 * @author 91992
 */
public class PrintPrime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int num_start,num_end,i,j,count=0;
    num_start=1;
    num_end=10;
    i=num_start;
    while(i<=num_end)
    {
        j=2;
        while(j<i)
        {
            if(i%j==0)
            {
                count=1;
                break;
            }
            j++;
        }
        if(count==0 && i!=1)
        {
           System.out.println(+i);
        }
        count = 0;
        i++;
    }
    }
    
}
