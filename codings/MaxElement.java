import java.util.Scanner;

public class MaxElement 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int[] arr=new int[x];
        int largest=arr[0];

        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int j=0;j<arr.length;j++)
        {
            if(arr[j]>largest)
            {
                largest=arr[j];
            }
        }
        System.out.println(largest);

    }
}
