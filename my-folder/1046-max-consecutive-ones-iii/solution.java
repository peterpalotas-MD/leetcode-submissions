class Solution {
    public int longestOnes(int[] nums, int k) {
        if(nums.length==1){
            if (k >= 1){
                return 1;
            }else{

            
            return nums[0];
            }
        }

        int numZeroes = 0;
        int oneCount = 0;
        int left = 0;
        int longest = 0;
        for(int right=0;right<nums.length;right++){

            if(nums[right] == 0){
                numZeroes++;
            }else{
                oneCount++;
            }

            while(numZeroes>k){
                if(nums[left] == 0){
                    numZeroes--;
                }else{
                    oneCount--;
                }
                left++;
            }

            if(longest < oneCount+numZeroes)
                longest=oneCount+numZeroes;
            
        }
        return longest;
    }
}
