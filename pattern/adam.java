import java.util.*;

class AdamNumber
{
    public int reversenumber(int n) 
    {
        int reverse = 0;
        while (n != 0) {
            reverse = reverse * 10 + n % 10;
            n = n / 10;
        }
        return reverse;
    }

    public boolean isadamnumber(int n)
    {
        int orgnumber = n * n;
        int reversenumber = reversenumber(n);
        int reversesqno = reversenumber * reversenumber;

        return orgnumber == reversenumber(reversesqno);
    }

    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);

        int number = s.nextInt();

        AdamNumber adam = new AdamNumber();
        if (adam.isadamnumber(number)) 
        {
            System.out.print("adam number");
        } else 
        {
            System.out.print("Not an adam number");
        }
    }
}
