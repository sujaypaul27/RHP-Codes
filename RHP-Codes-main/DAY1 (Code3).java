// Online Java Compiler....sd..//
// Use this editor to write, compile and run your Java code online//..//..
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
       String str=sc.nextLine();
       int l=str.length();
       for(int outer=1;outer<(1<<l);outer++)
       {
           StringBuilder sb=new StringBuilder();
           for(int inner=0;inner< l;inner++)
           {
               if((outer & 1<<inner) >0 )
               {
                   sb.append(str.charAt(inner));
               }
           }
           System.out.println(sb);
       }
    }
}