public class fibonacci {
    public static void main(String[] args) {
        
        int term1=0;
        int term2=1;
        //int nxt_term;
        int n=10;
        System.out.println(+term1+" "+term2);
        int i=0;
        while(i<n)
        {
            int sum=0;
            sum=term1 + term2;
            System.out.println(" "+sum);
            term1=term2;
            term2 = sum;
            i++;
        }    
    }
}
