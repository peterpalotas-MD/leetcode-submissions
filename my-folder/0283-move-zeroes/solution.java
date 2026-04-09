class Solution {
    public void moveZeroes(int[] nums) {
        int zeroPointer = 0;

        for(int numPointer = 1; numPointer<nums.length; numPointer++){

            while(zeroPointer<numPointer && nums[zeroPointer] != 0){
                zeroPointer++;
            }


            if(nums[numPointer] != 0 && nums[zeroPointer] == 0){
                nums[zeroPointer]=nums[numPointer];
                nums[numPointer]=0;
            }
            
        }
        
        
    }
}
