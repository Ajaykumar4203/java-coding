import java.util.*;
class pentagonal
{
  public static boolean get(int n)
  {
    double d = (1+Math.sqrt(1+24*n))/6;
    return d == (int)d;
  }
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if(get(n))
    {
      System.out.print("Pentagonal Number");
    }
    else
    {
      System.out.print("Not a Pentagonal Number");
    }
  }
}