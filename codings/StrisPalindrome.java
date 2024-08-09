import java.util.Scanner;

public class StrisPalindrome 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your String");
        String str=sc.nextLine();
        String original=str;
        String rev="";

        int len=str.length();
        for(int i=len-1;i>=0;i--)
        {
            rev+=str.charAt(i);
        }
        if(original.equals(rev))
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }
        
    }    
}
