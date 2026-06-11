
                    //Largest subarray of 0's and 1's

class Solution {
    public int maxLen(int[] arr) {
        // Your code here
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum =0;
        int maxlength=0;
        map.put(0,-1);
        for(int i=0 ;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                sum+=1;
            }else{
                sum+=-1;
            }
            if(map.containsKey(sum))
            {
                maxlength=Math.max(maxlength,i-(map.get(sum)));
            }else{
                map.put(sum,i);
            }
        }
        return maxlength;
    }
}//Largest subarray of 0's and 1's