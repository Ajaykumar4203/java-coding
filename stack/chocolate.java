import java.util.*;
class chocolate
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        int k = sc.nextInt();
        int arr[] =  new int[k];
        for(int i=0;i<k;i++)
        arr[i] = sc.nextInt();
        Arrays.sort(arr);
        int s = 0;
        for(int i=0;i<k;i++)
        {
            s =s+arr[i];
             arr[i]=s;
        }
        System.out.print(arr[n-1]);
    }
}