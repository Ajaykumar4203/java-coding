import java.util.Scanner;
public class panagram 
{
   public static void main(String[] var0) {
      Runnable var1 = () -> {
         try 
         {
            Scanner var0 = new Scanner(System.in);
            String var1 = var0.nextLine();
            String var2 = var1.toLowerCase();
            int[] var3 = new int[26];

            int var4;
            for(var4 = 0; var4 < 26; ++var4) {
               var3[var4] = 0;
            }

            boolean var10 = false;
            boolean var5 = false;
            var0.close();

            int var6;
            for(var6 = 0; var6 < var2.length(); ++var6) {
               char var7 = var2.charAt(var6);
               if (var7 >= 'a' && var7 <= 'z' && var7 != ' ') {
                  var4 = var7 - 97;
                  int var10002 = var3[var4]++;
               }
            }

            for(var6 = 0; var6 < 26; ++var6) {
               if (var3[var6] == 0) {
                  var5 = true;
                  break;
               }
            }

            Thread.sleep(200L);
            if (var5) {
               System.out.print("Not a panagram");
            } else {
               System.out.print("Panagram");
            }
         } 
         catch (Exception var9) 
         {
            var9.printStackTrace();
         }
      };
      Thread var2 = new Thread(var1);
      var2.start();
   }
}
