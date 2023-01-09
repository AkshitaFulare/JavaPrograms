import java.net.SocketPermission;
import java.util.*;
public class addThreeNumbers {
    
    public int add(int a, int b , int c)
    {
        a+=b+c;
        return a;
    }

}
public class Main{
    public static void main(String[] args)
    {
        addThreeNumbers a1;
         a1= new addThreeNumbers();
         Scanner print = new Scanner(System.in);
         System.out.println("Enter three numbers to be add ");
         int num1 = print.nextInt();
         int num2 = print.nextInt();
         int num3 = print.nextInt();
         int sum;
         sum = a1.add(num1,num2,num3);
         System.out.println("Sum  = "+sum);
    }
}
