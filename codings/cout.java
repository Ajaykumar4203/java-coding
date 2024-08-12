import java.util.*;
class sample
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int count = 0;
    while(true)
    {
      int val = sc.nextInt();
      if(val==-1)
      {
        break;
      }
      count++;
    }
    int d= count/2;
    System.out.printf("%d",d);
  }
}