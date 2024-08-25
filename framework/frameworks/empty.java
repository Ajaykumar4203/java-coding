import java.util.*;

class sample1 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        HashMap<String,Integer> list = new LinkedHashMap<String,Integer>();
        
        String str ;
        int val;
        while(true)
        {
            str = sc.next();
            val = sc.nextInt();
            if(val==-1)
                break;
                list.put(str,val);
        }
        if(list.isEmpty())
        {
            System.out.print("the map is empty");
        }
        else{
            System.out.print("the map is not empty");
        }
         
    }
}