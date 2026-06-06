// Online Java Compiler
// Use this editor to write, compile and run your Java code online   (DP Col vise)

// Given a grid of size r*c, find the maximum sum path from 1st coloumn to last coloumn. You can move in 3 direction (down, right, up) but you cannot move in same row twice.

import java .util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] grid=new int[r][c];
        
        
        for(int i=0;i<r;i++)//for matrics  as input
        {
            for(int j=0;j<c;j++)
            {
                grid[i][j]=sc.nextInt();
            }
        }
        int [] prev=new int[r];
        // for finding initial prev values 
        for(int i=0;i<r;i++)
        {
            prev[i]=grid[i][0];//since initial values is needed 
        }
        
        int[] current=new int[r];
        
        for(int col=1;col<c;col++)
        {
            int max1=Integer.MIN_VALUE;
            int max2=Integer.MIN_VALUE;
            int maxindex=-1;
            for(int row=0;row<r;row++)
            {
                
                if(prev[row]>max1)
                {
                    max2=max1;
                    max1=prev[row];
                    maxindex=row;
                }else if (prev[row]>max2)
                {
                    max2=prev[row];
                }
            }
            
            // for finding current vlues (2nd row)
            for(int row=0;row<r;row++)//coz row will have no of coloumn elements
            {
                if(row!=maxindex)
                {
                    current[row]=grid[row][col]+max1;
                }else{
                    current[row]=grid[row][col]+max2;
                }
            }
            prev=current;
        }
        int ans=Integer.MIN_VALUE;
        for(int values:prev)
        {
            ans=Math.max(ans,values);
        }
        System.out.println(ans);
    }
}