import java.util.*;
class sample
{
  public static void main(String[] args)
  {
    Scanner sc= new Scanner(System.in);
    int n= sc.nextInt();
    
    int d = 0;
    
    for(int i= 0;i<n;i++)
    {
      if(i ==0|| i==1)
      {
        System.out.print("0 ");
      }
      else if(i%2==0)
      {
        System.out.print(i+" ");
      }
      else
      {
        d++;
        System.out.print(d+" ");
        
      }
    }
  }
}