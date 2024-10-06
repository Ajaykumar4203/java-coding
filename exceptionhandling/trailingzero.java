
import java.util.*;
class trailingzero
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int m = 5;
        while(n>=m)
        {
            sum =sum+n/m;
            m=m*5;
        }
        System.out.print(sum);
    }
}