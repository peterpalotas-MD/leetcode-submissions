
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length+1];
        prefix[0] = 1;
        prefix[1] = nums[0];

        int[] postfix = new int[nums.length+1];
        postfix[nums.length]=1;
        postfix[nums.length-1]=nums[nums.length-1];
        int product = nums[0];

        for(int i = 2; i < nums.length+1; i++){
            prefix[i]=nums[i-1]*prefix[i-1];
            product*=nums[i-1];
            postfix[nums.length-i]=postfix[nums.length-i+1]*nums[nums.length-i];

        }
        int[] result = new int[nums.length];
        
        for(int j = 0; j< nums.length; j++){
            result[j] = prefix[j]*postfix[j+1];
        }

        //O(2n) how can I dynamically do it incone pass
        return result;
    }
}
