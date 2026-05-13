class Solution {
    public int longestSubarray(int[] nums) {
        
        int biggest = 0;
        int zeroCount = 0;
        int left = 0;
        int oneCount=0;
        for(int right = 0; right <nums.length; right++){
             if(nums[right]==0){
                zeroCount++;
                if(zeroCount>1){
                    while(nums[left]!=0){
                        left++;
                        oneCount--;
                    }
                    left++;
                    zeroCount--;
                }

             }
             else{
                oneCount++;
             }

            if(biggest < (oneCount+zeroCount-1)){
                biggest=(oneCount+zeroCount-1);
            }
             
        }
        return  biggest;
    }
}
