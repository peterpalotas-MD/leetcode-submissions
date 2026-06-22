class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.isEmpty()){
            return 0;
        }
        int maxSize = Integer.MIN_VALUE;

        HashSet<Character> currentThings = new HashSet<>();
        
        char[] sArr = s.toCharArray();
        int left = 0;
        for(int right = 0; right<sArr.length;right++){
            while(currentThings.contains(sArr[right]) && left < right){
                currentThings.remove(sArr[left]);
                left++;
            }
            currentThings.add(sArr[right]);
            maxSize = Math.max(maxSize, (right-left)+1);
        }
        return maxSize;
    }
}
