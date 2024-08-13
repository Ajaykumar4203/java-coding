import java.util.Scanner;
class no
{
   public static void main(String[] args)
   {
    Scanner sc = new Scanner(System.in);
    int s = sc.nextInt();
    int sum = 0;
    for(int i=1;i<=s;i++)
    {
        sum +=i;
    }
    System.out.print(sum);
   }
}