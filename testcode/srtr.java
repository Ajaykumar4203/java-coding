import java.util.*;
class easy
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        Set<Character> se = new HashSet<>();
        String str = s.nextLine();
        char[] ch = str.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            if(!(se.contains(ch[i])))
            { 
                se.add(ch[i]);
                System.out.print(ch[i]);
                
            }
            
        }
    }
}