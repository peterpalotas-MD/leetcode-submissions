class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> lookup = new HashMap<>();


        for(int i = 0; i < nums.length;i++){
            int targetNumber = target-nums[i];
            Integer lookupIndex = lookup.get(targetNumber);
            if(lookupIndex != null){
                return new int[] {lookupIndex, i};
            }

            lookup.put(nums[i], i);
        }
        return new int[] {};
    }
}
