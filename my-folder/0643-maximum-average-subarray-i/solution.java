class Solution {
    public double findMaxAverage(int[] nums, int k) {
        

        int right = k-1;
        int sum = 0;
        
        
        for (int i = 0; i <= right; i++) {
            sum+=nums[i];
        }
        

        double max = sum;
        for(int left = 1; left+k <= (nums.length);left++){
            right++;
            sum+=nums[right];
            sum-= nums[left-1];
            max = Math.max(max, sum);
        }
        

        return max/=k;
    }
}
