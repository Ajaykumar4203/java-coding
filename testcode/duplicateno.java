import java.util.*;
class duplicateno
{
    public static boolean check(int m)
    {
        String str = m+"";
        int[] arr = new int[10];
        for(int i=0;i<str.length();i++)
        {
            arr[(str.charAt(i)-'0')]++;
            if(arr[str.charAt(i)-'0']>1)
             return false;
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m = sc.nextInt();
        int count = 0;
        for(int i=n;i<=m;i++)
        {
            if(check(i))
            {
                System.out.println(i+" ");
                count++;
            }
        }
        System.out.println("\n"+count);
    }
}

