import java.util.*;
class fib
{
    public static void main(String[] args)
    {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int c = 1,d =1,sum=0;
        for(int i = 1;i<n;i++)
        {
            sum = c+d;
            c=d;
            d=sum;
        }
        System.out.println(d);
    }
}
