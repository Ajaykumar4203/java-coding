import java.util.*;
class sample
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;
        int high = 0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='u')
            {
                high++;
                if(high==0)
                {
                    count++;
                }
            }
            else{
                high--;
            }
        }
        System.out.println(count);
    }
}