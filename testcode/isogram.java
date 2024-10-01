import java.util.*;
class isogram
{
    public static void main(String[] agrs)
    {
        Scanner sc = new Scanner(System.in);
        String str =  sc.next();
        List<Character> list = new ArrayList<>();
        for(int i=0;i<str.length();i++)
        {
            char c = str.charAt(i);
            if(!list.contains(c))
            list.add(c);
        }
        if(list.size()==str.length())
        {
            System.out.print("true");
        }
        else
        {
            System.out.print(false);
        }
    }
}