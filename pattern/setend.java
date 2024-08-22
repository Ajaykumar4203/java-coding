import java.util.*;
class setend
{
    public static void main(String[] args)
    {
        TreeSet<Integer> set = new TreeSet<Integer>();
        Scanner sc = new Scanner(System.in);
        int val;
        while(true)
        {
            val = sc.nextInt();
            if(val==-1)
            break;
            set.add(val);
        }
        System.out.println(set);
        ArrayList<Integer> list = new ArrayList<Integer>(set);
        val = sc.nextInt();
        list.addLast(val);
        System.out.println(list);
    }
}