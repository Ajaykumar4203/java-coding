import java.util.*;
class kids
{
    public static void main(String[] args)
    {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int s = n;
        int d = 0;
        for(int i=1;i<m;i++)
        {
            d = s-1;
            s= s+d;
        }
        System.out.println(s);
    }
}