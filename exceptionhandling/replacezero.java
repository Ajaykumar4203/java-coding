import java.util.*;
class replacezero
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        String str = n+"";
        String str1 = str.replaceAll("0","5");
        System.out.print(str1);
    }
}