import java.util.*;
class HelloWorld 
{
    public static Boolean valid(String str, int arr[])
    {
        for(int i=0;i<str.length();i++)
        {
            char c = str.charAt(i);
            if(c>='0'||c<='9')
            arr[0] = 1;
            else if(c>='A'||c<='Z')
            arr[1] = 1;
            else if(c==' '||c=='/')
            arr[2]=0;
            else
            {continue;
            }}
            for(int i=0;i<3;i++)
            {
                if(arr[i]==0)
                {
                    return false;
                }
             }
              return true;
        
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int arr[]  = new int[3];
        arr[2] = 1;
        if(str.length()<=4||str.length()>='0'&&str.length()<='9')
        {
            System.out.print("Invalid");
        }
        else
        {
            boolean s = valid(str,arr);
            if(s)
            {
                System.out.print("valid");
            }
            else
            {
                System.out.print("invalid");
            }
        }
    }
}