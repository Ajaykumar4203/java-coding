import java.util.*;
class extractno
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        str = str+" ";
        for(int i=0;i<str.length();i++)
        {
            char c = str.charAt(i);
            if(c>='0' && c<='9')
            {
                System.out.print(c);
                if(!(str.charAt(i)>='0' && str.charAt(i+1)<='9'))
                System.out.print(" ");
            }
        }
        
    }
}