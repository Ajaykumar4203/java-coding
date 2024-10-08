import java.util.*;
class roundofval
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        float cir = 3.14f;
        System.out.printf("%.0f",(cir*n*n));
    }
}