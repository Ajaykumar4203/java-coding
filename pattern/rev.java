import java.util.*;
class rev {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String str2 = "";
        for(int i=str.length()-1;i>=0;i--)
        {
            char c= str.charAt(i);
            str2+=c;
        
        } 
        String d=str2.replaceAll(" ","");
        // System.out.print(d);
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==' ') System.out.print(" ");
            else{
                System.out.print(d.charAt(i));
            }
        }
    }
}
