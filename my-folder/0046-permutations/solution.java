class Solution {
    public List<List<Integer>> permute(int[] nums) {

        if(nums.length == 0){
            return List.of(List.of());
        }

        List<List<Integer>> perm = permute(Arrays.copyOfRange(nums, 1, nums.length ));
        List<List<Integer>> result = new ArrayList<>();

        for(int i = 0; i <= perm.size()-1; i++){
            for(int j = 0; j < perm.get(i).size()+1; j++) {
                    List<Integer> temp = new ArrayList<>(List.copyOf(perm.get(i)));
                    temp.add(j, nums[0]);
                    result.add(temp);
                }
        }
        return result;

    }
}
