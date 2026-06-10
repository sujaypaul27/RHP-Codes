                        //longest commom substring
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        int n1=s1.length();
        String s2 = sc.nextLine();
        int n2=s2.length();
        int[][] dp=new int [n1+1][n2+1];
        
        int maximum=0;
        
        for(int row=1;row<=n1;row++){//start from 1 inorder to avoid array out of bound index
            for(int col=1;col<=n2;col++)
            {
                if(s1.charAt(row-1)==s2.charAt(col-1))
                {
                    dp[row][col]=1+dp[row-1][col-1];
                    maximum=Math.max(maximum,dp[row][col]);
                }else{
                    dp[row][col]=0;
                }
            }
        }
        System.out.println(maximum);
        
    }
}