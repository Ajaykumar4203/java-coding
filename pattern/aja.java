import java.util.*;

class aja
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();
        while(true)
        {
            int val = s.nextInt();
            if(val == -1)break;
            list.add(val);
        }
        System.out.print(list);
        for(int itr = 0;itr<list.size();itr++)
        {
            for(int itr1 = itr+1;itr1<list.size();itr1++)
            {
                if((list.get(itr))>(list.get(itr1)))
                {
                 int t = list.get(itr);
                 list.set(itr, list.get(itr1));
                 list.set(itr1,t);
                }
            }
        }
        System.out.println(list);
    }
}