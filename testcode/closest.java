import java.util.*;
class closet
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr  = new int[n];
        int s = 0;
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n-1;i++)
        {
            s = s+Math.abs(arr[i]-arr[i+1]);
        }
        s = s+Math.abs(arr[0] - arr[n-1]);
        System.out.print(s);
    }
}