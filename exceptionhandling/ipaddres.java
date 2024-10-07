import java.util.*;
class ipaddres
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String arr[] = str.split("\\.");
        int c =0;
        for(int i=0;i<arr.length;i++)
        {
            if(Integer.parseInt(arr[i])>255)
            {
                c=1;
                break;
            }
        }
        if(c==1||arr.length!=4)
        {
            System.out.println("invalid");
        }
        else
        {
            System.out.println("Invalid");
        }
    }
}