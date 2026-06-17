class Solution {
    public int firstMissingPositive(int[] nums) {
        int[] seen = new int[100002];
        for(int number : nums){
            
            if(number > 0 && number < 100002){
            seen[number]= 1;
            }
            
                
        }
        
        for(int i = 1; i< seen.length; i++){

            if(seen[i]==0){
                return i;
            }
        }
        return 1;
    }
}
