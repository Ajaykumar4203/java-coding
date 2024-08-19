import java.util.*;

class  prime{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Number:");

        int number = sc.nextInt();
        int count = 0;
        int c = 2;

        while(c < number)
        {
            if(number % c == 0)
            {
                System.out.println("Not prime");
                count = count + 1;
                break;
            }
            c = c +1;
        }

        if(count == 0)
            System.out.println("Prime");
        
     sc.close();
    }
}