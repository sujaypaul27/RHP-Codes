// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str=sc.nextLine();
        int flag=0;
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            flag=flag|1<<(ch-'a');
        }
        
        System.out.println(flag==(1<<26)-1?"YES":"NO");
    }
}