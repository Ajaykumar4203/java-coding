import java.util.*;
class fib
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 1;
        for (int i = 1; i <= n; i++) 
        {
            c = c*i;
        }
        System.out.println(c);
    }
}