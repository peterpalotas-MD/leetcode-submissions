
class Solution {
    //THIS LITERALLY TOOK 2 HOURS TO SOLVE
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        List<List<Integer>> output = new ArrayList<>();

        for(int i = 0; i < nums.length - 1; i++) {
            int right = nums.length-1;
            int left = i+1;
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int sum = nums[i] + nums[left] + nums[right];
            while(left < right) {

                if (sum < 0) {
                    left++;

                }
                else if (sum > 0) {
                    right--;
                }
                sum = nums[i] + nums[left] + nums[right];

                if (sum == 0 && left < right) {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[left]);
                    temp.add(nums[right]);
                    output.add(temp);

                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }

                    left++;
                    right--;
                }
            }

        }
        return output;


    }
}
