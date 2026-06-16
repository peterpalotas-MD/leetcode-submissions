class Solution {
    public int maxSubArray(int[] nums) {
        
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int number : nums){
            currentSum+=number;
            if(maxSum<currentSum){
                maxSum=currentSum;
            }
            if(currentSum<0){
                currentSum=0;
            }
        }

        return maxSum;
    }
}
