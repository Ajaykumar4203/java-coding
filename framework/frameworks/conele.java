import java.util.*;
class conele
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        HashMap<String,Integer> list = new LinkedHashMap<String,Integer>();
        String str;
        int val;
        while(true)
        {
            str = sc.next();
            val = sc.nextInt();
            if(val==-1)
            break;
            list.put(str,val);
        }
        System.out.println(list);
        String str1 = sc.next();
        if(list.containsKey(str1))
        {
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        System.out.println();
        int val1 = sc.nextInt();
        if(list.containsValue(val1))
        {
            System.out.println("true");
        }
        else{
            System.out.println(false);
        }
    }
}