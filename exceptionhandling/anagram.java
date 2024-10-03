import java.util.*;
class anagram
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String str1 = sc.next();
        int c =0;
        if(str.length()==str1.length())
        {
        for(int i=0;i<str.length();i++)
        {
            for(int j=0;j<str1.length();j++)
            {
                if(str.charAt(i)==str1.charAt(j))
                {
                    c++;
                }
            }
        }
        }
        if(c==str.length())
        System.out.print("Anagram");
        else
        System.out.print("Not an Anagram");
    }
}