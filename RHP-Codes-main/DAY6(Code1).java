// problem link : https://atcoder.jp/contests/abc460/tasks/abc460_c
//question :C - Sushi 

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        long[] i=new long[m];
        long[] j=new long[n];
        long counter=0;
        for(int k = 0; k < m; k++)
         {
             i[k] = sc.nextLong();
        }

        for(int k = 0; k < n; k++)
        {
             j[k] = sc.nextLong();
        }
        Arrays.sort(j);
        Arrays.sort(i);
        int up=m-1;
        int down=n-1;
        while(up>=0 && down>=0)
        {
           if(j[down]<=(2*i[up]))
           {
             counter++;
             down--;
             up--;
           }else{
           down--;
               
           }
        }
        System.out.println(counter);
    }
}