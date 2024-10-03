import java.util.*;
class rangediff
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int sum=0, sum1=0;
        int c;
        for(int i=1;i<=m;i++)
        {
            if(i%n==0)
            sum = sum+i;
            else
            sum1 = sum1+i;
        }
        c = sum-sum1;
        System.out.print(Math.abs(c));
    }
}