
public class printprime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
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
