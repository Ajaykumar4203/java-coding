import java.util.*;
class range
{
    public static void main(String[] args) 
    {
        Scanner sc =  new Scanner(System.in);
        HashSet<Integer> hash = new HashSet<Integer>();
        int val;
        while(true)
        {
            val = sc.nextInt();
            if(val==-1)
                break;
                hash.add(val);
        }
        System.out.println(hash);
        int val1 = sc.nextInt();
        if(val1==0 && val1<=50)
        {
            System.out.printf("%d the element in the set",val1);
        }
        else{
            System.out.print("the element not in the set");
        }
    }
}