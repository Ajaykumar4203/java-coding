import java.util.*;
class kill
{
    public static void main(String[] args)
    {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int a = 1;
        while(a<=n)
        {
            a = a*2;
        }
        a = a/2;
        int sum = (n-a)*2;
        sum = sum+1;
        System.out.println(sum);
    }
}