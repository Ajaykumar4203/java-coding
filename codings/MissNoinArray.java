import java.util.Scanner;
public class MissNoinArray 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int[] arr={1,2,3,4,5,7,8,9};
        int n=arr.length+1;
        int sum=(n*(n+1))/2;

        for(int i=0;i<arr.length;i++)
        {
            sum=sum-arr[i];
        }
        System.out.println("Missing number is"+sum);
    }    
}
