class Solution {
    public int maxArea(int[] height) {
        
        int left = 0;
        int right = height.length-1;

        int best = 0;
        //amt of water = min of 2 h[i] * i(upper)-i(lower)
        while (left<right){

            best = Math.max(best, Math.min(height[left], height[right])*(right-left));

            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
        return best;
    }
}
