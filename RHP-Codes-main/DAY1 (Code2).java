//Code for finding A-Z usign BIT manipulation

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str=sc.nextLine();
        int flag=0;
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch>='A' && ch<='Z')
            {
            flag=flag|1<<(ch-'A');
            }
        }
        
        System.out.println(flag==(1<<26)-1?"YES":"NO");
    }
}