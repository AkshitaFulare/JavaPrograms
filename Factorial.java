public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
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