
package playwithascii;

import java.util.Scanner;
public class PlayWithAscii {


    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter any character");
       char c = sc.next().charAt(0);
       int  result;
       if( c >= 65 || c <= 90){
          result = c + 1;
          
          System.out.println();
       }
    }
    
}
