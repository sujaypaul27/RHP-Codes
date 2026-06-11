                                            Trappig rain water uding DP / two pointer

            //USING 2 pointer (optimised)
class Solution {
    public int trap(int[] height) {
        int n=height.length-1;
        int left=0;
        int right=n;
        int leftmax=height[0];//for intial value of leftmax
        int rightmax=height[n];//for intial value of right max
        int water=0;
        while(left<right)
        {
            if(leftmax<rightmax)//for finding values from left
            {
                left++;
                leftmax=Math.max(leftmax,height[left]);
                
                water+=leftmax-height[left];//to find water present in it
            }else{
                {
                right--;
                rightmax=Math.max(rightmax,height[right]);
                
                water+=rightmax-height[right];
            }
            }
        }
        return water;
    }
}//             USING DP(more Space)

/*class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int water =0;
        int[] leftmax=new int[n];
        int[] rightmax=new int[n];

        leftmax[0]=height[0];
        for(int i=1;i<n;i++)
        {
            leftmax[i]=Math.max(leftmax[i-1],height[i]);
        }

        rightmax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--)
        {
            rightmax[i]=Math.max(rightmax[i+1],height[i]);
        }

        for(int i=0;i<n;i++)
        {
            water += Math.min(leftmax[i],rightmax[i])-height[i];
        }

        return water;
    }
}*/