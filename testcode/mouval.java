import java.util.*;
class mouval
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        String str = sc.nextLine();
        int c= 0;
        for(int i=0;i<str.length();i++)
        {
            char co = str.charAt(i);
            if(co=='u')
            {
                c++;
            }
            if(co=='d')
            {
                c--;
            }
        }
        if(c<0)
        {
            System.out.print(0);
        }
        else{
            System.out.print(1);
        }
    }
}