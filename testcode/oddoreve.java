import java.util.*;
class sample
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            int a = sc.nextInt();
            if(i%2==0)
            {
                list1.add(a);
            }
            else
            {
                list2.add(a);
            }
        }
        if(n<=3)
        {
            System.out.print(0);
        }
        else
        {
            System.out.print(list1.get(list1.size()-2)+list2.get(list2.size()-2));
        }
    }
}